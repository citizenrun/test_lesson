package test;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AppTest3 {

public static class Driver {
	public static void main (String [] args ) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "/Users/deleu/Documents/selenium/chromedriver");
		
	    WebDriver driver = new ChromeDriver();
	    driver.get("http://toolsqa.wpengine.com/automation-practice-form/");
	    
	    WebElement element = driver.findElement(By.name("selenium_commands"));
	    Select oSelect = new Select(element);
	    oSelect.selectByIndex(0);
		Thread.sleep(2000);
	    oSelect.selectByVisibleText("Navigation Commands");
	    
		Thread.sleep(2000);
	    List <WebElement> listOfCountries = oSelect.getOptions();
	    
	    int iSize = listOfCountries.size();
	    	
	    	for (int i = 0; i < iSize; i++ ){
	    		String name = listOfCountries.get(i).getText();
	    			System.out.println(name);
	    		
			}
	    	Thread.sleep(2000);
	    oSelect.deselectAll();
		Thread.sleep(2000);
		driver.quit();
		
		}
	}
}


