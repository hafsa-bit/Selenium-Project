package com.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebNavigation {
	public static void main(String [] arg) {
	WebDriverManager.chromedriver().setup();
	
	WebDriver driver= new ChromeDriver();
	try{

		   driver.get("https://www.selenium.dev/");
		   driver.manage().window().maximize();
		   Thread.sleep(3000);
		   driver.navigate().to("https://www.selenium.dev/downloads/");
		   Thread.sleep(3000);
		   driver.navigate().back();
		   Thread.sleep(3000);
		   driver.navigate().forward();
		   Thread.sleep(3000);
		   driver.navigate().refresh();

   }catch(Exception e){
		e.printStackTrace();
   }
  }
}