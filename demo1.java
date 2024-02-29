package exception;

import java.io.FileNotFoundException;
import java.io.IOException;

public class demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			processfile("C:\\Users\\2377126\\Desktop\\gio.txt");
		} catch (FileNotFoundException ex) {
			System.out.println("File not found " + ex.getMessage());
		} catch (IOException ex) {
			System.out.println(" IOException " + ex.getMessage());
		} catch (IllegalArgumentException ex) {
			System.out.println(" Illegal Argument Exception " + ex.getMessage());
		}
	}

	private static void processfile(String fileName) throws FileNotFoundException, IOException {
		if (fileName == null || fileName.isEmpty()) {
			throw new FileNotFoundException(" File name is empty or null");
		}
		// now simulate IOExcepytion during the file processing after the opening the
		// file
		if (fileName.equals("example.txt")) {
			throw new IOException(" IOException occured during processing the file");

		}
//simulate another point of throwing a different exception
		if (fileName.length() > 200) {
			throw new IllegalArgumentException(" File name is too long to read for this process");
		}
		System.out.println(" Processing File " + fileName);
	}
}
