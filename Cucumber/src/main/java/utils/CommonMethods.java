package utils;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//Ctrl+O will give all the methods that are present in the class

public class CommonMethods extends TestBase {
	
	public static WebDriver driver;
	
	public static void setUp(String browser,String url) {
		browser.equalsIgnoreCase("chrome"); {
		System.setProperty("webdriver.chrome.driver","src/main/java/drivers/chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get(url);
		 driver.manage().window().maximize(); }//fullscreen for Mac
		 
		 
		//}else if(browser.equalsIgnoreCase("Firefox")) {
		//	System.setProperty("webdriver.gecko.driver","C://geckodriver.exe");
		// driver.new FirefoxDriver();
		}
	//else {
		//System.out.println("Browser is wrong");}
	
	public static void selectValueFromDD(WebElement element) {
		Select select = new Select(element);
		List<WebElement>options=select.getOptions();
		for (WebElement option:options) {
			String optionText=option.getText();
			if(optionText.equals(option)) {
				select.selectByVisibleText(optionText);
				break;
			}else {
				System.out.println("option with text "+option+" is not available");
			}
		}
	}
		
	public static void selectValueFromDD(WebElement element, int index) {
		Select select= new Select(element);
		List<WebElement>options=select.getOptions();
		if(options.size()>index) {//check to make sure the index selected is less than the size
		select.selectByIndex(index);
		}else {
			System.out.println("Invalid index has been passed");
		}
	}
	public static void sendText(WebElement element) {
		element.clear();
		element.sendKeys();		
	}

	/*Method will accept alert
	 * @throws NoAlertPresentException when alert is not present
	 */
	
	public static void acceptAlert() {
		try {
			Alert alert=driver.switchTo().alert();
			alert.accept();
		} catch (NoAlertPresentException e) {
			System.out.println("Alert was not present");
		}
				
	}	
		
	public static void dismissAlert() {
		try {
			Alert alert=driver.switchTo().alert();
			alert.dismiss();
		} catch (NoAlertPresentException e) {
			System.out.println("Alert was not present");
		}
	}
	
	/*Method will get test of an alert
	 * @throws NoAlertPresentException if alert is not present
	 * @return String text
	 */
	
	public static String getAlertText() {
		try {
			Alert alert=driver.switchTo().alert();
			return alert.getText();
		} catch (NoAlertPresentException e) {
			System.out.println("Alert was not present");
			return null;
		}
	}
		
	/*This method will switch control to the specified frame
	 * @param frame id or frame name
	 */
	public static void switchToFrame(String idOrName) {
	try {
		driver.switchTo().frame(idOrName);
	}catch(NoSuchFrameException e) {
		System.out.println("Frame is not present");
	}
}
	public static void switchToFrame(WebElement element) {
		try {
			driver.switchTo().frame(element);
		}catch(NoSuchFrameException e) {
			System.out.println("Frame is not present");
}
	}
	
	public static void switchToFrame(int index) {
		try {
			driver.switchTo().frame(index);
		}catch(NoSuchFrameException e) {
			System.out.println("Frame is not present");
	
}
	}
	
	
	public static void click(WebElement element) {
	element.click();
	
	
}
		
	}


