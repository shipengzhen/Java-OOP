package com.bdqn.spz.file;

import java.io.*;

public class FileMethods {
	public static void main(String[] args) {
		File file = new File("file/ʩ����.txt");
		insertFile(file);
		showFile(file);
		updateFile(file);
		ejzFile();
		// deleteFile(file);
	}

	/**
	 * ��ȡ�ļ�
	 * @param file
	 */
	public static void showFile(File file) {
		InputStream inputStream = null;
		Reader reader = null;
		BufferedReader bufferedReader = null;
		try {
			// �ж��ļ���Ŀ¼�Ƿ����
			if (file.exists()) {
				// �Ƿ����ļ�
				if (file.isFile()) {
					System.out.println("���ƣ�" + file.getName());
					System.out.println("���·��" + file.getParent());
					System.out.println("����·��" + file.getAbsolutePath());
					System.out.println("�ļ���С" + file.length() + "�ֽ�");
					// ��ȡ1
					System.out.println("��ȡ1");
					inputStream = new FileInputStream(file);
					System.out.println("�ɶ�ȡ���ֽ�����" + inputStream.available());
					System.out.println("�ļ�����Ϊ��");
					// ѭ��������
					int data = 0;
					while ((data = inputStream.read()) != -1) {
						System.out.print((char)data + "");
					}
					//��ȡ2
					System.out.println("��ȡ2");
//					byte[] bs=new byte[2��n�η���]
					byte[] bs=new byte[inputStream.available()];
					//������
					inputStream.read(bs);
					System.out.println("�ļ�����Ϊ��");
					for (byte b : bs) {
						System.out.print((char)b+"");
					}
					// ��ȡ3
					System.out.println("��ȡ3");
					reader = new FileReader(file);
					char cs[] = new char[(int)file.length()];
					StringBuffer buffer = new StringBuffer();
					int length = reader.read(cs);
					// ѭ����ȡ��׷���ַ�
					while (length != -1) {
						buffer.append(cs);
						length = reader.read();
					}
					System.out.println("�ļ�����Ϊ��");
					System.out.println(buffer);

					// ��ȡ4
					System.out.println("��ȡ4");
					bufferedReader = new BufferedReader(reader);
					String line = bufferedReader.readLine();
					System.out.println("�ļ�����Ϊ��");
					while (line != null) {
						System.out.println(line);
						line = bufferedReader.readLine();//����һ������
					}
				}

				// �Ƿ���Ŀ¼
				if (file.isDirectory()) {
					System.out.println("���ļ���Ŀ¼");
				}
			} else {
				System.out.println("�ļ�������");
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
	 * �½�д���ļ� 
	 * @param file
	 */
	public static void insertFile(File file) {
		FileOutputStream fileOutputStream = null;
		Writer writer = null;
		BufferedWriter bufferedWriter = null;
		try {
			if (!file.exists()) {
				System.out.println("�ļ�������");
				file.createNewFile();
				System.out.println("�ļ������ɹ�");

				// д��1
				String string = "����ʩ����";
				// �ֽ�����
				byte[] bs = string.getBytes();
				// ������������׷�ӷ�ʽд���ļ�
				fileOutputStream = new FileOutputStream(file, true);
				// д���ļ�
				fileOutputStream.write(bs, 0, bs.length);
				fileOutputStream.flush();// ˢ�»�����
				System.out.println("�ļ��Ѹ���");

			} else {
				System.out.println("�ļ��Ѵ���");

				// д��2
				// ����һ��FileWriter����
				writer = new FileWriter(file);
				// д����Ϣ
				writer.write("���Ȱ��ҵ��Ŷ�!");
				writer.flush();// ˢ�»�����
				System.out.println("�ļ��Ѹ���");

				// д��3
				// ����һ��BufferedWriter����
				bufferedWriter = new BufferedWriter(writer);
				// д����Ϣ
				bufferedWriter.write("��Һ�!");
				bufferedWriter.write("������ѧϰBufferedWriter��");
				bufferedWriter.newLine();// ����
				bufferedWriter.write("����ָ��!");
				bufferedWriter.newLine();
				bufferedWriter.flush();// ˢ��
				System.out.println("�ļ��Ѹ���");
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
	 * ɾ���ļ�
	 * @param file
	 */
	public static void deleteFile(File file) {
		try {
			if (file.exists()) {
				file.delete();
				System.out.println("�ļ�ɾ���ɹ�");
			} else {
				System.out.println("�ļ�������");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * �޸��ļ�
	 * @param file
	 */
	public static void updateFile(File file) {
		// �ж��ļ���Ŀ¼�Ƿ����
		if (file.exists()) {
			// �Ƿ����ļ�
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
					// ѭ����ȡ��׷���ַ�
					while ((line = bufferedReader.readLine()) != null) {
						buffer.append(line);
						line = bufferedReader.readLine();
					}
					System.out.println("�滻ǰ��" + buffer);
					// �滻����
					String newline = buffer.toString().replace("BufferedWriter", "java");
					// д���ļ�
					writer = new FileWriter(file,false);
					bufferedWriter = new BufferedWriter(writer);
					bufferedWriter.write(newline);
					bufferedWriter.flush();
					System.out.println("�滻��" + newline);
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
				System.out.println("�����ļ�");
			}
		}else{
			System.out.println("�ļ�������");
		}
	}
	
	
	/**
	 * �����ļ�
	 */
	public static void ejzFile(){
		FileInputStream fileInputStream=null;
		DataOutputStream dataOutputStream=null;
		FileOutputStream fileOutputStream=null;
		DataInputStream dataInputStream=null;
		try {
			//��������������
			fileInputStream=new FileInputStream("C:\\Users\\xiaomi\\Pictures\\Camera Roll\\Camera Roll28af5e09265ba416.jpg");
			dataInputStream=new DataInputStream(fileInputStream);
			//�������������
			fileOutputStream=new FileOutputStream("file/1111.jpg");
			dataOutputStream=new DataOutputStream(fileOutputStream);
			int temp;
			//��ȡ�ļ���д��
			while ((temp=dataInputStream.read())!=-1) {
				dataOutputStream.write(temp);
			}
			System.out.println("���Ƴɹ�");
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
