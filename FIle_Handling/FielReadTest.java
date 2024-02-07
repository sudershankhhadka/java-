package FIle_Handling;

import java.io.FileInputStream;
import java.io.IOException;

public class FielReadTest {
	public static void main(String[] args) throws IOException {
		FileInputStream file = new FileInputStream("e://3pm.txt");
		int data;
		while((data=file.read())!=-1) {
			System.out.println((char)data);
		}
		
	}

}
