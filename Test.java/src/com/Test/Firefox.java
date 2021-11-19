package com.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {

	public static void main(String[] args) {
		// Set the path of geckodriver with extension for windows
				System.setProperty("webdriver.gecko.driver", "E:\\javaExamples\\geckodriver-v0.30.0-win64\\geckodriver.exe");
				FirefoxDriver firefoxDriver = new FirefoxDriver();
				firefoxDriver.get("https://www.fb.com");
			
			

	}

}
