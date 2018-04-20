package com.bdqn.spz.file;

import java.io.*;

public class FileMethods {
	public static void main(String[] args) {
		File file = new File("file/施鹏振.txt");
		insertFile(file);
		showFile(file);
		updateFile(file);
		ejzFile();
		// deleteFile(file);
	}

	/**
	 * 读取文件
	 * @param file
	 */
	public static void showFile(File file) {
		InputStream inputStream = null;
		Reader reader = null;
		BufferedReader bufferedReader = null;
		try {
			// 判断文件或目录是否存在
			if (file.exists()) {
				// 是否是文件
				if (file.isFile()) {
					System.out.println("名称：" + file.getName());
					System.out.println("相对路径" + file.getParent());
					System.out.println("绝对路径" + file.getAbsolutePath());
					System.out.println("文件大小" + file.length() + "字节");
					// 读取1
					System.out.println("读取1");
					inputStream = new FileInputStream(file);
					System.out.println("可读取的字节数：" + inputStream.available());
					System.out.println("文件内容为：");
					// 循环读数据
					int data = 0;
					while ((data = inputStream.read()) != -1) {
						System.out.print((char)data + "");
					}
					//读取2
					System.out.println("读取2");
//					byte[] bs=new byte[2的n次方数]
					byte[] bs=new byte[inputStream.available()];
					//缓冲区
					inputStream.read(bs);
					System.out.println("文件内容为：");
					for (byte b : bs) {
						System.out.print((char)b+"");
					}
					// 读取3
					System.out.println("读取3");
					reader = new FileReader(file);
					char cs[] = new char[(int)file.length()];
					StringBuffer buffer = new StringBuffer();
					int length = reader.read(cs);
					// 循环读取并追加字符
					while (length != -1) {
						buffer.append(cs);
						length = reader.read();
					}
					System.out.println("文件内容为：");
					System.out.println(buffer);

					// 读取4
					System.out.println("读取4");
					bufferedReader = new BufferedReader(reader);
					String line = bufferedReader.readLine();
					System.out.println("文件内容为：");
					while (line != null) {
						System.out.println(line);
						line = bufferedReader.readLine();//读下一跳数据
					}
				}

				// 是否是目录
				if (file.isDirectory()) {
					System.out.println("此文件是目录");
				}
			} else {
				System.out.println("文件不存在");
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (reader != null) {
					reader.close();
				}
				if (inputStream != null) {
					inputStream.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * 新建写入文件 
	 * @param file
	 */
	public static void insertFile(File file) {
		FileOutputStream fileOutputStream = null;
		Writer writer = null;
		BufferedWriter bufferedWriter = null;
		try {
			if (!file.exists()) {
				System.out.println("文件不存在");
				file.createNewFile();
				System.out.println("文件创建成功");

				// 写入1
				String string = "我是施鹏振";
				// 字节数组
				byte[] bs = string.getBytes();
				// 创建流对象，以追加方式写入文件
				fileOutputStream = new FileOutputStream(file, true);
				// 写入文件
				fileOutputStream.write(bs, 0, bs.length);
				fileOutputStream.flush();// 刷新缓冲区
				System.out.println("文件已更新");

			} else {
				System.out.println("文件已存在");

				// 写入2
				// 创建一个FileWriter对象
				writer = new FileWriter(file);
				// 写入信息
				writer.write("我热爱我的团队!");
				writer.flush();// 刷新缓冲区
				System.out.println("文件已更新");

				// 写入3
				// 创建一个BufferedWriter对象
				bufferedWriter = new BufferedWriter(writer);
				// 写入信息
				bufferedWriter.write("大家好!");
				bufferedWriter.write("我正在学习BufferedWriter。");
				bufferedWriter.newLine();// 换行
				bufferedWriter.write("请多多指教!");
				bufferedWriter.newLine();
				bufferedWriter.flush();// 刷新
				System.out.println("文件已更新");
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {

			try {
				if (bufferedWriter != null) {
					bufferedWriter.close();
				}
				if (writer != null) {
					writer.close();
				}
				if (fileOutputStream != null) {
					fileOutputStream.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	/**
	 * 删除文件
	 * @param file
	 */
	public static void deleteFile(File file) {
		try {
			if (file.exists()) {
				file.delete();
				System.out.println("文件删除成功");
			} else {
				System.out.println("文件不存在");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 修改文件
	 * @param file
	 */
	public static void updateFile(File file) {
		// 判断文件或目录是否存在
		if (file.exists()) {
			// 是否是文件
			if (file.isFile()) {
				Reader reader=null;
				BufferedReader bufferedReader = null;
				Writer writer = null;
				BufferedWriter bufferedWriter = null;
				try {
					reader = new FileReader(file);
					bufferedReader = new BufferedReader(reader);
					String line = null;
					StringBuffer buffer = new StringBuffer();
					// 循环读取并追加字符
					while ((line = bufferedReader.readLine()) != null) {
						buffer.append(line);
						line = bufferedReader.readLine();
					}
					System.out.println("替换前：" + buffer);
					// 替换内容
					String newline = buffer.toString().replace("BufferedWriter", "java");
					// 写入文件
					writer = new FileWriter(file,false);
					bufferedWriter = new BufferedWriter(writer);
					bufferedWriter.write(newline);
					bufferedWriter.flush();
					System.out.println("替换后：" + newline);
				} catch (Exception e) {
					e.printStackTrace();
					// TODO: handle exception
				}finally{
					try {
						if (bufferedReader!=null) {
							bufferedReader.close();
						}
						if (bufferedWriter!=null) {
							bufferedWriter.close();
						}
						if (reader!=null) {
							reader.close();
						}
						if (writer!=null) {
							writer.close();
						}
					} catch (Exception e2) {
						e2.printStackTrace();
						// TODO: handle exception
					}
				}
			}else {
				System.out.println("不是文件");
			}
		}else{
			System.out.println("文件不存在");
		}
	}
	
	
	/**
	 * 复制文件
	 */
	public static void ejzFile(){
		FileInputStream fileInputStream=null;
		DataOutputStream dataOutputStream=null;
		FileOutputStream fileOutputStream=null;
		DataInputStream dataInputStream=null;
		try {
			//创建输入流对象
			fileInputStream=new FileInputStream("C:\\Users\\xiaomi\\Pictures\\Camera Roll\\Camera Roll28af5e09265ba416.jpg");
			dataInputStream=new DataInputStream(fileInputStream);
			//创建输出流对象
			fileOutputStream=new FileOutputStream("file/1111.jpg");
			dataOutputStream=new DataOutputStream(fileOutputStream);
			int temp;
			//读取文件并写入
			while ((temp=dataInputStream.read())!=-1) {
				dataOutputStream.write(temp);
			}
			System.out.println("复制成功");
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}finally{
			try {
				if (dataInputStream!=null) {
					dataInputStream.close();
				}
				if (dataOutputStream!=null) {
					dataOutputStream.close();
				}
				if (fileInputStream!=null) {
					fileInputStream.close();
				}
				if (fileOutputStream!=null) {
					fileOutputStream.close();
				}
			} catch (IOException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
}
