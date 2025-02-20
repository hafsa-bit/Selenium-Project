package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.JavascriptExecutor;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WeAutomation {
	public static void main(String [] arg) {
		//System.setProperty("webdriver.chrome.driver", "D:/ChromeDriver/chrome-win64/chrome.exe");
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		try{
			//driver.get("https://testingfunda.com/");
			   driver.get("https://www.google.com");

	            // 2️⃣ Locate the search box
			   Thread.sleep(4000);
	            WebElement searchBox = driver.findElement(By.name("q"));

	            // 3️⃣ Enter search query
	            searchBox.sendKeys("Selenium WebDriver tutorial");

	            // 4️⃣ Submit the search (simulating Enter key)
	            searchBox.submit();

	            // Wait a few seconds (Optional: just for seeing the result)
	            Thread.sleep(3000);
		
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

}
