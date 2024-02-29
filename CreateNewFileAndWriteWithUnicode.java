package IO;

import java.io.FileOutputStream;

public class CreateNewFileAndWriteWithUnicode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileOutputStream fout = new FileOutputStream("C:\\Users\\2377126\\Desktop\\try.txt"); // fout = file out
																									// //path of any
																								/// file is the same
																								// just change the
																									// name
			fout.write(65);
			fout.close();
			System.out.println("Success... ");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
