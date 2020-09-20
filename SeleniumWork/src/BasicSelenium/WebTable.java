package BasicSelenium;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.bseindia.com/markets/Equity/equitysensexstream.html");
		List<WebElement> d=driver.findElements(By.xpath("/html/body/div[3]/div[2]/div[2]/table/tbody/tr[1]/td/table/tbody/tr/td[2]"));
		Iterator itr=d.iterator();
		System.out.println(d.size());
		int rowNum=1;
		while (itr.hasNext()) {
			WebElement p=(WebElement) itr.next();
			
			if(p.getText().equalsIgnoreCase("reliance")) {
	System.out.println("The value of Reliance is "+driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[2]/table/tbody/tr[1]/td/table/tbody/tr["+rowNum+"]/td[3]")).getText());

			}
			else
				rowNum++;
				
			
		}
	}

}
