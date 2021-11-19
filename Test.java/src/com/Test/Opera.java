package com.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;

public class Opera {

	public static void main(String[] args) {
		System.setProperty("webdriver.opera.driver", "E:\\javaExamples\\operadriver_win64\\operadriver.exe");
		WebDriver driver = new OperaDriver();
		driver.get("https://fb.com");


	}

}
