package com.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) {
		//Creating a driver object referencing WebDriver interface
        WebDriver driver;
        
        //Setting the webdriver.chrome.driver property to its executable's location
        System.setProperty("webdriver.chrome.driver", "E:\\javaExamples\\chromedriver_win32\\chromedriver.exe");
	
        //Instantiating driver object
        driver = new ChromeDriver();
        
        //Using get() method to open a webpage
        driver.get("https://artoftesting.com");
        
        //Closing the browser
        driver.quit();
 

	}

}
