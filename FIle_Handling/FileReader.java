package FIle_Handling;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReader {
public static void main(String[] args) throws IOException {
	FileReader file = new FileReader("e://employee.txt");
	BufferedReader br = new BufferedReader(file);
	String line;
	while((line=br.readLine())!=null) {
		System.out.println(line);
	}
}
}
