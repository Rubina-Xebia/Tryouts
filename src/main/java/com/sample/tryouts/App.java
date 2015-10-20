package com.sample.tryouts;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void getURL(WebDriver dr, String url){
    	dr.get(url);	
    }
    
    public static void getURLTitle(WebDriver dr){
    	  	System.out.println("The title is " +dr.getTitle());
    }
    public static void getURLSize(WebDriver dr){
    	System.out.println("The title  size is "+dr.getTitle().length());
    }
    public static void getScreenShot(WebDriver dr,String fileWithPath) throws IOException{
    	TakesScreenshot screenshot=((TakesScreenshot)dr);
   // 	File sourceFile=screenshot.getScreenshotAs(OutputType.FILE);
    	File destinationFile=new File(fileWithPath);
   // 	FileUtils.copyFile(sourceFile, destinationFile);
    	FileUtils.copyFile(screenshot.getScreenshotAs(OutputType.FILE), destinationFile);
    }
    public static void closeDriver(WebDriver dr){
    	dr.close();
    }
}
