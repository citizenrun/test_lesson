package test;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppTest5 {

public static class Driver {
	public static void main (String [] args ) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "/Users/deleu/Documents/selenium/chromedriver");
		
	    WebDriver driver = new ChromeDriver();
	    driver.get("http://toolsqa.wpengine.com/automation-practice-table/");
	    
	    WebElement element = driver.findElement(By.xpath("//*[@id='content']/table"));
	    
		 List<WebElement> rows = element.findElements(By.xpath(".//tr"));
		 List<WebElement> cols = element.findElements(By.xpath(".//tr[1]/td"));
		 System.out.println(rows.size());
		 System.out.println(cols.size());
	 String sRowValue = "Clock Tower Hotel";
	 
	 
	 
		//First loop will find the 'ClOCK TWER HOTEL' in the first column
		for (int i=1;i<=cols.size();i++){
			String sValue = null;
			sValue = driver.findElement(By.xpath(".//*[@id='content']/table/tbody/tr["+i+"]/th")).getText();
			if(sValue.equalsIgnoreCase(sRowValue)){
				
				// If the sValue match with the description, it will initiate one more inner loop for all the columns of 'i' row 
				for (int j=1;j<=rows.size();j++){
					String sColumnValue= driver.findElement(By.xpath("//*[@id='content']/table/tbody/tr["+i+"]/td["+j+"]")).getText();
					System.out.println(sColumnValue);
				}
			break;
		}
	}
Thread.sleep(2000);
driver.close();
		
		}
	}
}


