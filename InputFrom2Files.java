package IO;
import java.io.*;
public class InputFrom2Files {

	public static void main(String[] args) throws Exception {
	FileInputStream input1 = new FileInputStream("C:\\Users\\2377126\\Desktop\\try.txt");
	FileInputStream input2 = new FileInputStream("C:\\Users\\2377126\\Desktop\\okkkkk.txt");
	SequenceInputStream inst = new SequenceInputStream(input1 , input2); // helps read many files
	int j;
	while ((j=inst.read())!=-1) {
		System.out.println((char)j);
	}
	inst.close();
	input1.close();
	input2.close();

	}

}
