import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;

public class FileTest {
    public static void main(String[] args) throws IOException {
        File file = new File("e://hello.txt");
        System.out.println(file.isDirectory());
        System.out.println(file.exists());

        File dir = new File("e://Broadway");
        dir.mkdir();

        // To get all files from a directory
        String[] filenames = dir.list();
        System.out.println(Arrays.toString(filenames));

        // To return all files
        File[] files = dir.listFiles();

        if (files != null) {
            for (File f1 : files) {
                // Read content using Files.readString with explicit encoding
                String content = Files.readString(f1.toPath(), StandardCharsets.UTF_8);
                System.out.println(content);
            }
        }

        // For deleting a file
        Files.delete(Path.of(file.getAbsolutePath()));
    }
}
