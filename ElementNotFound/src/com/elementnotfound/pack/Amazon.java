package com.elementnotfound.pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Amazon {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://Drivers//chromedriver_win32//chromedriver.exe");
		//System.setProperty("","");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		Select drofdm = new Select(driver.findElement(By.className("")));
		
	}

}
