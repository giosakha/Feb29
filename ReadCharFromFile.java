package IO;

import java.io.FileInputStream;

public class ReadCharFromFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream fin = new FileInputStream("C:\\Users\\2377126\\Desktop\\try.txt");
			int i = fin.read();
			System.out.println((char) i);
			fin.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
