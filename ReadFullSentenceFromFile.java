package IO;

import java.io.FileInputStream;

public class ReadFullSentenceFromFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream fin = new FileInputStream("C:\\Users\\2377126\\Desktop\\try.txt");
			int i = 0;
			while ((i = fin.read()) != -1) { // when the sentence ends its -1 so it will stop before
				System.out.print((char) i);
			}
			fin.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
