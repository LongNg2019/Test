package com.Airbnb.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.TestBase;

public class HomePage extends TestBase {
	
	public static WebElement element= null;
	
	public static WebElement signUpButton() {
		 return element=driver.findElement(By.className("_lvb55za"));
	}
	
	public static WebElement searchBox() {
		return element=driver.findElement(By.name("query"));
	}
	
	public static boolean AirbnbLogo() {
		boolean element=driver.findElement(By.xpath("\"//*[@id=\\\"site-content\\\"]/div/div/div[1]/div[1]/div/div/div/div/div[1]/div/div/div/div/div/h3/div\")")).isDisplayed();
		return element;
	}
	
	public static WebElement logInButton() {
		return element=driver.findElement(By.className("_lvb55za"));
	}
	
	
	public String validateHomePageTitle() {
		return driver.getTitle();
	}
	

	}
	
	
	

