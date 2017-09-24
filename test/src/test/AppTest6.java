package test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AppTest6 {
	public static void main (String [] args ) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "/Users/deleu/Documents/selenium/chromedriver");
	    WebDriver driver = new ChromeDriver();
		//driver = new FirefoxDriver();
	    
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.get("http://toolsqa.wpengine.com/automation-practice-switch-windows/");
		
	    
	    WebElement button = driver.findElement(By.id("timingAlert"));
	    button.click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        Alert myAlert = wait.until(ExpectedConditions.alertIsPresent());
        myAlert.accept();
        driver.close();

		}
	}
