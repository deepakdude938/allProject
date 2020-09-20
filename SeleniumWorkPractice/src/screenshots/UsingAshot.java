package screenshots;
import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.imageio.ImageIO;

import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class UsingAshot {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		  driver.get("https://www.naukri.com");
		  Thread.sleep(5000);
		  
		 
		  String path=System.getProperty("user.dir"); 
		  File file=new  File(path+"/ashotScreen/"+getDate());
		  file.mkdirs();
		  
		  File file1=new File(file,"/screen_"+getDT()+".png");
		  
		
		  
		  AShot ashot=new AShot(); 
//		  Screenshot sc=ashot.takeScreenshot(driver);
		  Screenshot sc=ashot.shootingStrategy(ShootingStrategies
				  .viewportPasting(3000)).takeScreenshot(driver);
		  ImageIO.write(sc.getImage(), "png", file1);
		  
		 

	}

	private static String getDT() {
		LocalDateTime date=LocalDateTime.now()	;
		DateTimeFormatter d=DateTimeFormatter.ofPattern("HH_mm_ss");
		String format=date.format(d);
				return format;
	}

	private static String getDate() {
		LocalDateTime date=LocalDateTime.now();
		System.out.println(date);
		DateTimeFormatter d=DateTimeFormatter.ofPattern("yy_MM");
		String format=date.format(d);
		
		
		return format;
	}
	
	

}
