package com.tka.pfd.seleniumsec;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Landingpage {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage() .window() .maximize();
		driver.get("https://javabykiran.in/other/CC/");
		
		
		WebElement loginLink = driver.findElement(By.linkText("Login"));
		boolean isDisplay = loginLink.isDisplayed();
		
		if(isDisplay) {
			System.out.println("Test Case Pass");
		}	
		else {
			System.out.println("Test case Failed");
			
		}
		
		WebElement registerLink = driver.findElement(By.linkText("Register"));
		boolean isDisplay2  = registerLink.isDisplayed();
		if(isDisplay2) {
			System.out.println("TC pass");
		}
		else {
			System.out.println("TC failed");
		}
		
		
	// 	
		WebElement txtSearch = driver.findElement(By.name("search[keywords]"));
		boolean isEnable = txtSearch.isEnabled();
		
		if(isEnable) {
			System.out.println("Test case pass !! you are able to enter a value in asearch text");
		}
		else {
			System.out.println("Test case is failed !! you are not able to enter a value in search text");
		}
		
		
	}

}
