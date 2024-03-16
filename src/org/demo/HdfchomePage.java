package org.demo;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
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


public class HdfchomePage {
	private String customerId;
	private int password;
	public void setCustomerId(String input1) {
		if (input1.equals("Ram")) {
			customerId= "Ram is correct";
		}
		else if(input1.equals("Babu")) {
			customerId= "Babu is correct";
		}
		else if(input1.equals("Ravi")) {
			customerId= "Ravi is correct";
		}
		else {
			customerId="invalid userName";
		}
	}
	public void setPAssword (int pass1) {
		if(pass1==111 && customerId.equals("Ram username is correct")) {
			password=1;
		
		}
		else if (pass1==222 && customerId.equals("babu username is correct")) {
			password=2;
		}
		else if (pass1==333 && customerId.equals("Ravi username is correct")) {
			password=3;
		}
		else {
			password=0;
		}
		}
	public String getCustomerId() throws IOException{
		if(password==1) {
			Map<String, String> readDataFromDb = readDataFromDb();
			Set<Entry<String, String>> entrySet = readDataFromDb.entrySet();
			for  (Entry<String, String> entry : entrySet) {
				if(entry.getKey().equals("Ram")) {
					System.out.println(entry);
				}
				
			}
			return null;
		}
		else if (password==2) {
			Map<String, String> readDataFromDb = readDataFromDb();
			Set<Entry<String, String>> entrySet = readDataFromDb.entrySet();
			for  (Entry<String, String> entry : entrySet) {
				if(entry.getKey().equals("babu")) {
					System.out.println(entry);
				}
				
			}
			return null;
		}
			else if (password==3) {
				Map<String, String> readDataFromDb = readDataFromDb();
				Set<Entry<String, String>> entrySet = readDataFromDb.entrySet();
				for  (Entry<String, String> entry : entrySet) {
					if(entry.getKey().equals("Ravi")) {
						System.out.println(entry);
					}
					
				}
				return null;
			}
				else 
				{
					return "invalid user";
				}
	}
	
	public int password() {
		return 0;
	}
public Map<String,String> readDataFromDb() throws IOException  {
	File file = new File("C:\\Users\\tamil\\eclipse-workspace\\BrowserLaunch\\Database\\database.txt");
	List<String> readLines = FileUtils.readLines(file);
	Map<String, String> m = new LinkedHashMap();
	for (int i = 0; i < readLines.size(); i++) {
		String string = readLines.get(i);
		String[] split = string.split(",");
		m.put(split[0],split[2]);
		
	}
	return m;	

}	
			
		}
		
	

	
	


