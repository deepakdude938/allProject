package actionRobotdemo;
import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.InputEvent;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class KeyboardAction {
	
	/**
	 * @param args
	 * @throws InterruptedException
	 * @throws AWTException
	 * @throws IOException
	 */
	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
	//	  driver.get("https://www.naukri.com/"); 
		 Thread.sleep(5000); 
	//	  Actions(driver); //
	//	  action.keyDown(Keys.TAB).keyUp(Keys.TAB).build().perform();
		 
		 
	//	 action.keyDown(Keys.ENTER).keyUp(Keys.ENTER).build().perform();
			
		
		  Robot robo=new Robot(); robo.mouseMove(300, 600);
		  robo.mousePress(InputEvent.BUTTON3_DOWN_MASK);
		  robo.mouseRelease(InputEvent.BUTTON3_DOWN_MASK); 
		  Dimension  d=Toolkit.getDefaultToolkit().getScreenSize();
		  Rectangle a= new Rectangle(d);
		  BufferedImage b=robo.createScreenCapture(a);
		  ImageIO.write(b, "png",new File("D://captumage.png")); 
		  System.out.println("1");
		  
		 
		
		  
		
		  TakesScreenshot d1=(TakesScreenshot)driver; File
		  sourceFile=d1.getScreenshotAs(OutputType.FILE); File file=new
		  File("D://sampla.png"); FileHandler.copy(sourceFile, file);
		  System.out.println("2");
		 
		  
		 
	}

}
