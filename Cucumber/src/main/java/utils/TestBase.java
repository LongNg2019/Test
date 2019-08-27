package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {

public static WebDriver driver;
public static Properties prop; 

public TestBase() {

try {
	prop= new Properties();
	FileInputStream fis=new FileInputStream(
	System.getProperty("C:\\Users\\12023\\eclipse-workspace\\Cucumber\\src\\main\\java\\testdatas\\credentials.properties"+
	"/Cucumber/src/main/java/testdatas/credentials.properties"));
			prop.load(fis);
}
	catch (FileNotFoundException e) {
	e.printStackTrace();
}	catch (IOException e) {
	e.printStackTrace();
}
}

public static void setUp() {
		String browser=prop.getProperty("browser");
		
		if (browser.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver","src/main/java/drivers/chromedriver.exe");
		 driver=new ChromeDriver();
		}else if(browser.equals("FF))")) {
			System.setProperty("webdriver.gecko.driver", "src/main/java/drivers/geckodriver.exe");
			driver=new FirefoxDriver();
		}
		 driver.manage().window().maximize();
		 driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 
		 driver.get(prop.getProperty("url"));
		}


 }
