package FIle_Handling;

import java.io.FileWriter;
import java.io.IOException;

/*
 * a> FileWriter:Write File 
 * b> FileReader: Read File
 */
public class WriteDocFile {
	public static void main(String[] args) throws IOException {
		FileWriter file = new FileWriter("e://employee.txt",true);
		file.write("\n Name : Suderhsan KHadka\n City : Kathmandu  \n Age : 21");
		file.write("\n Its a good day");
		file.close();
		System.out.println("Success");
	}
}
