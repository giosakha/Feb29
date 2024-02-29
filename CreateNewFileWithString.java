package IO;

import java.io.FileOutputStream;

public class CreateNewFileWithString {
///////writing string
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileOutputStream fout = new FileOutputStream("C:\\Users\\2377126\\Desktop\\try.txt");
			String s = "I like codung";
			byte b[] = s.getBytes(); // converting string into byte array
			fout.write(b);
			fout.close();
			System.out.println("Success...");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
