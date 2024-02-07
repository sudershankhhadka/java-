package FIle_Handling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObjectTets {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		//deserialization
		ObjectInputStream  objFile = new ObjectInputStream(new FileInputStream("e://objectFile.txt"));
		User u = (User)objFile.readObject();
		System.out.println(u);
				
	}

}
