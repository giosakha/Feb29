package IO;
import java.io.*;
public class TafeFrom2FilesWriteIn1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileInputStream input1 = new FileInputStream("C:\\Users\\2377126\\Desktop\\try.txt");
		FileInputStream input2 = new FileInputStream("C:\\Users\\2377126\\Desktop\\okkkkk.txt");
		FileOutputStream out = new FileOutputStream("C:\\Users\\2377126\\Desktop\\zebi.txt");
		SequenceInputStream inst = new SequenceInputStream(input1 , input2); // helps read many files
		int j;
		int a=0;
		while ((j=inst.read())!=-1) {
			
		if (j!='a' || j != 'A') {
			out.write(j);
		}
	
		}
		System.out.println(a);
		inst.close();
		input1.close();
		input2.close();
		out.close();
	}

}
