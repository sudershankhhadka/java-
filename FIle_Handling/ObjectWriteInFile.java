package FIle_Handling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectWriteInFile {
	/*
	 * a> ObjectOutputStream --> write object
	 * b> ObjectInputStream --> read object
	 */
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		//Serialization
		ObjectOutputStream objFile = new ObjectOutputStream(new FileOutputStream("e://objectfile.txt"));
		User u = new User(1,"Sudershan","Khadka");
		objFile.writeObject(u);
		objFile.close();
		System.out.println("Success");
	}

}
