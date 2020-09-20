import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.given;

public class NewDemo{
	public static void main(String[] args) throws IOException{
		
		String path = "src\\test\\resources\\userPayload.json";
		String payLoad = generateStringFromResource(path);
		
		String updatedPayLoad = String.format(payLoad, "Peter","Parker","PeterSpider@gmail.com");
		System.out.println(payLoad);
		System.out.println(updatedPayLoad);
		
	}
	
	 public static String generateStringFromResource(String path) throws IOException {
	        return new String(Files.readAllBytes(Paths.get(path)));
	        
	        
	        
	    }

	}
		
	
