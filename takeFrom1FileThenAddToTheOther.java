package IO;

import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class takeFrom1FileThenAddToTheOther {

	public static void main(String[] args) throws IOException {

		FileInputStream in = null;
		FileOutputStream out = null;
		try {
			in = new FileInputStream("C:\\Users\\2377126\\Desktop\\hellooo.txt");
			out = new FileOutputStream("C:\\Users\\2377126\\Desktop\\nffff.txt");
			int i = 0;
			while(((i = in.read()) != -1)&& i!='a' && i!='A')  {
			
					
					
						out.write(i);
					
				
			}
		} finally {
			if (in != null) {
				in.close();
			}
			if (out != null) {
				out.close();
			}
		}
	}

}
