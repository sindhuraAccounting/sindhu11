package com.prac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Bacics {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sindhu\\Desktop\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://google.com");
		driver.findElement(By.linkText("Images")).click();
		String pgtitles=driver.getTitle();
		System.out.println("pgtitles");
		if(pgtitles.contains("Images"))
				{
			System.out.println("Test Pass");
				}else
					System.out.println("Test fail");

	}

}
