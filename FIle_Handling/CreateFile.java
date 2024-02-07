package FIle_Handling;

import java.io.FileOutputStream;
import java.io.IOException;

/*
 * a> FileOutputStream : file write
 * b>FileInputStream : read file
 */
public class CreateFile {
	public static void main(String[] args) throws IOException {
		FileOutputStream file = new FileOutputStream("e://3pm.txt");
		file.write("Hello Sudershan KHadka".getBytes());
		file.close();
		System.out.println("File Created Successfully");
	}
}
