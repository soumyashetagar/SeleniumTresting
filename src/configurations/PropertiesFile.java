package configurations;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Properties;

import test.FirstSeleniumTesting;

public class PropertiesFile {
	
	public static void main(String[] args) {
		readProperties();
		
	}
	public static void readProperties() {
		Properties pro = new Properties();
		try {
			InputStream input = new FileInputStream("C:\\Users\\so20094457\\eclipse-workspace\\SeleniumTesting\\src\\configurations\\config.properties");
			pro.load(input);
			System.out.println(pro.getProperty("browser"));
			FirstSeleniumTesting.browser = pro.getProperty("browser");
		
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
