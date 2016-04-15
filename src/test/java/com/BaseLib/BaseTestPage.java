package com.BaseLib;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.BaseLib.Genric;

public class BaseTestPage 
{
	public Genric genric;
	public ArrayList<String> Data;
	public String testcasename;
	public WebDriver driver;
	static public String Directorypath=System.getProperty("user.dir");// It will written the the directory of the project
	
	@BeforeClass
	public void Browser()
	{
		driver = new FirefoxDriver();
		driver.get("http://www.gmail.com/");
		driver.manage().window().maximize();
	}
	
	@BeforeMethod
	public void percondition()
	{
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Data =new ArrayList<String>();
		genric=new Genric();
	
	}
	
	@AfterMethod
	public void postconditon()
	{
	
	}
	
	@AfterClass
	public void close()
	{
		driver.quit();
	}
}
