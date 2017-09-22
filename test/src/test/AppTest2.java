package test;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AppTest2 {

public static class Driver {
	public static void main (String [] args ) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "/Users/deleu/Documents/selenium/chromedriver");
		
	    WebDriver driver = new ChromeDriver();
	    driver.get("http://toolsqa.wpengine.com/automation-practice-form/");
	    
	    WebElement element = driver.findElement(By.id("continents"));
	    Select oSelect = new Select(element);
	    oSelect.selectByIndex(1);
	    oSelect.selectByVisibleText("Africa");
	    
	    
	    List <WebElement> listOfCountries = oSelect.getOptions();
	    
	    int iSize = listOfCountries.size();
	    	
	    	for (int i = 0; i < iSize; i++ ){
	    		String name = listOfCountries.get(i).getText();
	    		System.out.println(name);
	    		if(name.equals("Africa")){
					oSelect.selectByIndex(i);
					break;
					}
				}
	    	
	    
		driver.quit();
		
	}
}
}


