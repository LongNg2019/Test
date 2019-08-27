package com.Airbnb.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.TestBase;

public class SignupPage extends TestBase{

	public static WebElement element= null;
	
	public static WebElement signUpwithFb() {
		return element=driver.findElement(By.className("_jro6t0"));	
	}
	
	public static WebElement signUpwithGG() {
		return element=driver.findElement(By.className("_60obhnd"));
	}
	
	public static WebElement signUpwithEmail() {
		return element=driver.findElement(By.className("_rqfxvmb"));
	}
	
	
}

