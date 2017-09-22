package test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppTest4 {

public static class Driver {
	public static void main (String [] args ) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "/Users/deleu/Documents/selenium/chromedriver");
		
	    WebDriver driver = new ChromeDriver();
	    driver.get("http://toolsqa.wpengine.com/automation-practice-table/");
	    
	    String dubai = null;
	    dubai = driver.findElement(By
	    		.xpath(".//*[@id='content']/table/tbody/tr[1]/td[2]"))
	    		.getText();
	    System.out.println(dubai);
	    String sRow = "1";
		String sCol = "2";
		
	 String sCellValue = driver.findElement(By
			 .xpath(".//*[@id='content']/table/tbody/tr["+sRow+"]/td["+sCol+"]")).getText();
	 System.out.println(sCellValue);
	 Thread.sleep(2000);
	 driver.findElement(By.xpath(".//*[@id='content']/table/tbody/tr[1]/td[6]/a")).click();        
		System.out.println("Link has been clicked otherwise an exception would have thrown");
		Thread.sleep(2000);	 
	 String sRowValue = "Clock Tower Hotel";
	 
		//First loop will find the 'ClOCK TWER HOTEL' in the first column
		for (int i=1;i<=5;i++){
			String sValue = null;
			sValue = driver.findElement(By.xpath(".//*[@id='content']/table/tbody/tr["+i+"]/th")).getText();
			if(sValue.equalsIgnoreCase(sRowValue)){
				
				// If the sValue match with the description, it will initiate one more inner loop for all the columns of 'i' row 
				for (int j=1;j<=5;j++){
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


