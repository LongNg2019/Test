package com.Airbnb.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.TestBase;

public class SignupwithEmailPage extends TestBase {
	
	public static WebElement element= null;

	public static WebElement emailAddress(String string) {
		return element=driver.findElement(By.id("email-signup-email"));
	}
	
	public static WebElement firstNameBox(String string) {
		return element=driver.findElement(By.id("email-signup-user[first_name]"));
	}
	
	public static WebElement lastNameBox(String string) {
		return element=driver.findElement(By.id("email-signup-user[last_name]"));
	}
	
	public static WebElement createPassword() {
		return element=driver.findElement(By.id("email-signup-password"));	
	}
	
	public static WebElement birthdayMonth(String string) {
		return element=driver.findElement(By.id("email-signupuser[birthday_month]"));
	}
	
	public static WebElement birthdayDay(int i) {
		return element=driver.findElement(By.id("email-signupuser[birthday_day]"));
	}
	
	public static WebElement birthdayYear(int i) {
		return element=driver.findElement(By.id("email-signupuser[birthday_year]"));
	}
	
	public static WebElement submitButton() {
		return element=driver.findElement(By.className("_1o4htsfg"));
	}
}

