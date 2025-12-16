package com.tka.pfd.seleniumfirst;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javaday2 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.manage() .window() .maximize();
		
		WebElement username = driver.findElement(By.cssSelector("#loginForm > div.html-div.x14z9mp.xat24cr.x1lziwak.xexx8yu.xyri2b.x18d9i69.x1c1uobl.x9f619.xjbqb8w.x78zum5.x15mokao.x1ga7v0g.x16uus16.xbiv7yw.xqui205.x1n2onr6.x1plvlek.xryxfnj.x1c4vz4f.x2lah0s.xdt5ytf.xqjyukv.x1qjc9v5.x1oa3qoh.x1nhvcw1 > div:nth-child(1) > div > label > input"));
		username.sendKeys("suraj_ur_st");
		
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("insta@284");
		
		WebElement clickbutton = driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[1]/div[3]"));
		clickbutton.click();
		 
		String actualTitle = driver.getTitle();
		String expectedTitle = "Welcome To Instagram";
		
		if(actualTitle.equals(expectedTitle))
		{
			System.out.println("Test Case Pass");
		}else
		{
			System.out.println("Test Case Failed");
		}	
		
	}

}
