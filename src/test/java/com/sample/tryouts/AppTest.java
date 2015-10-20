package com.sample.tryouts;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Unit test for simple App.
 */


public class AppTest{ 

	static WebDriver dr = new FirefoxDriver();
	
	public static void main(String[] args) throws IOException {
	
	dr.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
	App.getURL(dr, "https://www.google.co.in/");
	App.getURLTitle(dr);
	App.getURLSize(dr);
	App.getScreenShot(dr, "/home/likewise-open/XEBIAINDIA/rgill/Documents/test.png");
	App.closeDriver(dr);
	}	

}
