package screenshots;
import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.imageio.ImageIO;

import org.openqa.selenium.chrome.ChromeDriver;

public class UsingRobot {

	public static void screenshotUsingRobot() {
		String path=System.getProperty("user.dir");
	File f=new File(path+"/screenshots/"+getDate());
	f.mkdirs();
		
		 File file=new File(f,"/screenshot_"+getDateAndTime()+".png");
		 try {
			 Robot  robo=new Robot();
			 Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
		     Rectangle a= new Rectangle(d); 
		     BufferedImage b=robo.createScreenCapture(a);
		     ImageIO.write(b,"png",file); 
		  } 
		 catch(AWTException e) {
			  System.err.println("unable to take screenshot");
			  e.printStackTrace();
		  }
		 catch(IOException e) {
			 System.err.println("unable");
			 e.printStackTrace();
		 }
		  
		 

}

	private static String getDateAndTime() {
		LocalDateTime now=LocalDateTime.now();
		DateTimeFormatter date=DateTimeFormatter.ofPattern("yyyy_MM_dd_HHmmss");
		String format=now.format(date);
		return format;
	}

	private static String getDate() {
		LocalDateTime now=LocalDateTime.now();
		DateTimeFormatter date=DateTimeFormatter.ofPattern("yyyy_MM_dd");
		String format=now.format(date);
		return format;
	}
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		screenshotUsingRobot();
		
	}
}