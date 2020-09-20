import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class addBookJson {

	public static void main(String[] args) throws IOException {
		String path = "src\\test\\resources\\addBook.json";
		String payLoad = generateStringFromResource(path);
		
		String updatedPayLoad = String.format(payLoad, "ghy45","12345678");
		System.out.println(payLoad);
		System.out.println(updatedPayLoad);
		
	}
	
	 public static String generateStringFromResource(String path) throws IOException {
	        return new String(Files.readAllBytes(Paths.get(path)));

	}

}
