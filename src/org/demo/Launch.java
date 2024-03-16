package org.demo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Launch {

	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
	  //to set the property for browser
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\tamil\\eclipse-workspace\\BrowserLaunch\\Driver\\chromedriver.exe");
	  //initialize the Webdriver interface 
	  WebDriver driver = new ChromeDriver();
	  driver.navigate().to("https://www.amazon.in/");
	  driver.manage().window().maximize();
	  WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
	  searchBox.sendKeys("Iphone 15 pro max",Keys.ENTER);
	  //takesScreenshot 
	 
	 TakesScreenshot tk = (TakesScreenshot) driver;
	 File screenshotAs = tk.getScreenshotAs(OutputType.FILE);
	 System.out.println(screenshotAs);
	 File ss = new File ("C:\\Users\\tamil\\OneDrive\\Desktop\\output\\mobile.png");
	 FileUtils.copyFile(screenshotAs, ss);	
	}}
		
	
	 

                         