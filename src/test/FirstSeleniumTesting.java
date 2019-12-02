package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import configurations.PropertiesFile;

public class FirstSeleniumTesting {
	
	public static String browser;
	 static WebDriver driver;
	
	
	
	public static void main(String[] args) {
		
		PropertiesFile.readProperties();
		SetBrowserConfig();
		runTest();
		
		
	}
	
	
	public static void SetBrowserConfig() {
		
		String location = System.getProperty("user.dir");
		
		if(browser.contains("Chrome")) {
		System.setProperty("webdriver.chrome.driver", location+"\\chromedriver\\chromedriver.exe");
		 driver = new ChromeDriver();
		}
		else {
		
		System.out.println("No firefox browser");
		
		}
		
		}
		
	
	public static void runTest() {
		
		
		driver.get("https://selenium.dev/");
		driver.quit();
		System.out.println("passed");
		
	}
		
	}


