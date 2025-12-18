package com.tka.pfd.seleniumsec;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Registerpage {
	
	public static void main(String[] args) {
		
		
	
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://javabykiran.in/other/CC/");
			
			
			WebElement registerLink = driver.findElement(By.linkText("Register"));
			boolean isDisplay2 = registerLink.isDisplayed();
			registerLink.click();
			WebElement title = driver.findElement(By.cssSelector("#title"));
			title.sendKeys("Register");
			WebElement firstName = driver.findElement(By.xpath("//*[@id=\'first_name\']"));
			firstName.sendKeys("Suraj");
			
			WebElement lastName = driver.findElement(By.id("last_name"));
			lastName.sendKeys("Guldhe");
			
			WebElement email = driver.findElement(By.name("email"));
			email.sendKeys("suraj@gmail.com");
			
			WebElement phone = driver.findElement(By.id("phone"));
			phone.sendKeys("5245788282");
			
			WebElement mobile = driver.findElement(By.id("mobile"));
			mobile.sendKeys("1236547890");

			WebElement password = driver.findElement(By.id("password"));
			password.sendKeys("suraj@21");

			WebElement confirmPassword = driver.findElement(By.id("passconf"));
			confirmPassword.sendKeys("suraj@21");

			WebElement checkbox = driver.findElement(By.id("terms"));
			boolean display1 = checkbox.isDisplayed();
			checkbox.click();
			
			WebElement checkbox2 = driver.findElement(By.id("mailing"));
			boolean display2 = checkbox2.isDisplayed();
			checkbox2.click();
			
			WebElement checkbox3 = driver.findElement(By.id("register_submit"));
			boolean display3 = checkbox3.isDisplayed();
			checkbox3.click();
			
			
			
			if (display3) {
				System.out.println("Test Case pass");
			} else {
				System.out.println("TC failed");
			}

	}

}
