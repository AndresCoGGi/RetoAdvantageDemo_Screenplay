package com.tcs.certificacion.appadvantagedemo.util.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MyDriver {
	
	private static WebDriver driver;
	
	public static MyDriver web() {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\1583443\\git\\Semillero\\Documentos Semillero\\Selenium\\ChromeDriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito","--start-maximized","--disable-infobars");
		driver=new ChromeDriver(options);
		return new MyDriver();
	}
	
	public WebDriver enLaPagina(String url) {
		driver.get(url);
		return driver;
	}

}
