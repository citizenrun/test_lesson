package test;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppTest {

public static class Driver {
	public static void main (String [] args ) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "/Users/deleu/Documents/selenium/chromedriver");
	    WebDriver driver = new ChromeDriver();
		//driver = new FirefoxDriver();
		
		
	    driver.get("http://toolsqa.wpengine.com/automation-practice-form/");
	    List<WebElement>  rBtn_sex = driver.findElements(By.name("sex"));
	    
	    // Create a boolean variable which will hold the value (True/False)
	    
	    boolean bValue = false;
	    
	    // This statement will return True, in case of first Radio button is selected
	    
	    bValue = rBtn_sex.get(0).isSelected();
	    
	    // This will check that if the bValue is True means if the first radio button is selected
	    
	    if(bValue == true){
	    
	   	// This will select Second radio button, if the first radio button is selected by default
	    
	    	rBtn_sex.get(1).click();
	    
	    }else{
	    
	   	// If the first radio button is not selected by default, the first will be selected
	    
	    	rBtn_sex.get(0).click();
	    
	    }
	    WebElement  rBtn_year = driver.findElement(By.id("exp-2"));
	    rBtn_year.click();
	    
	    List<WebElement>  rBtn_prof = driver.findElements(By.name("profession"));
	    
	    int iSize = rBtn_prof.size();
	    	System.out.println(iSize);
	    	for (int i = 0; i < iSize; i++ ){
	    		String sValue = rBtn_prof.get(i).getAttribute("value");
	    		if (sValue.equalsIgnoreCase("Automation Tester")){
	    			rBtn_prof.get(i).click();
				// This will take the execution out of for loop
				break;
				}
	    	}
	    WebElement oCheckBox = driver.findElement(By.cssSelector("input[value='Selenium IDE']"));
	    oCheckBox.click();
	    
		driver.quit();
		
	}
}
}


