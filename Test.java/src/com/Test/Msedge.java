package com.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Msedge {

	public static void main(String[] args) {
		//set path of msedgedriver.exe path
	      System.setProperty("webdriver.edge.driver",
	         "E:\\javaExamples\\edgedriver_win64\\msedgedriver.exe");
	      //instance of EdgeDriver
	      WebDriver driver = new EdgeDriver();
	      //URL launch
	      driver.get("https://fb.com");

	}

}
