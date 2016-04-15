package com.Script;


import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;

import com.BaseLib.BaseTestPage;
import com.Pom.LoginPo;

public class LoginTest extends BaseTestPage 
{
	LoginPo loginPO;
	
	@Test
	public void login1() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{try
	{
		loginPO=new LoginPo(driver);
		testcasename="Login23";
		Data=genric.ReadingData(testcasename);
		loginPO.deleteMessage(Data.get(0), Data.get(1));
//		loginPO.appConected(driver);
//		loginPO.changePassword(Data.get(1),Data.get(2),driver);
//		loginPO.logout(driver,Data.get(2));
		Thread.sleep(5000);
		genric.WriteData("Pass", testcasename,"");
	}
	catch(Exception e)
	{
		genric.WriteData("Fail", testcasename,e.toString());
	}
	}
	@Test(enabled=true)
	public void login2() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{try
	{
		loginPO=new LoginPo(driver);
		testcasename="Login24";
		Data=genric.ReadingData(testcasename);
		loginPO.deleteMessage(Data.get(0), Data.get(1));
		loginPO.appConected(driver);
		loginPO.changePassword(Data.get(1),Data.get(2),driver);
		loginPO.logout(driver,Data.get(2));
		genric.WriteData("Pass", testcasename,"");
		Thread.sleep(5000);
	}
	catch(Exception e)
	{
		genric.WriteData("Fail", testcasename,e.toString());
	}
	}
	@Test(enabled=false)
	public void login3() throws InterruptedException
	{
		loginPO=new LoginPo(driver);
		testcasename="Login11";
		Data=genric.ReadingData(testcasename);
		loginPO.deleteMessage(Data.get(0), Data.get(1));
		loginPO.appConected(driver);
		loginPO.changePassword(Data.get(1),Data.get(2),driver);
		loginPO.logout(driver,Data.get(2));
		Thread.sleep(5000);
	}
	@Test(enabled=false)
	public void login4() throws InterruptedException
	{
		loginPO=new LoginPo(driver);
		testcasename="Login12";
		Data=genric.ReadingData(testcasename);
		loginPO.deleteMessage(Data.get(0), Data.get(1));
		loginPO.appConected(driver);
		loginPO.changePassword(Data.get(1),Data.get(2),driver);
		loginPO.logout(driver,Data.get(2));
		Thread.sleep(5000);
	}
	@Test(enabled=false)
	public void login5() throws InterruptedException
	{
		loginPO=new LoginPo(driver);
		testcasename="Login13";
		Data=genric.ReadingData(testcasename);
		loginPO.deleteMessage(Data.get(0), Data.get(1));
		loginPO.appConected(driver);
		loginPO.changePassword(Data.get(1),Data.get(2),driver);
		loginPO.logout(driver,Data.get(2));
		Thread.sleep(5000);
	}
	@Test(enabled=false)
	public void login6() throws InterruptedException
	{
		loginPO=new LoginPo(driver);
		testcasename="Login14";
		Data=genric.ReadingData(testcasename);
		loginPO.deleteMessage(Data.get(0), Data.get(1));
		loginPO.appConected(driver);
		loginPO.changePassword(Data.get(1),Data.get(2),driver);
		loginPO.logout(driver,Data.get(2));
		Thread.sleep(5000);
	}
	@Test(enabled=false)
	public void login7() throws InterruptedException
	{
		loginPO=new LoginPo(driver);
		testcasename="Login15";
		Data=genric.ReadingData(testcasename);
		loginPO.deleteMessage(Data.get(0), Data.get(1));
		loginPO.appConected(driver);
		loginPO.changePassword(Data.get(1),Data.get(2),driver);
		loginPO.logout(driver,Data.get(2));
		Thread.sleep(5000);
	}
	@Test(enabled=false)
	public void login8() throws InterruptedException
	{
		loginPO=new LoginPo(driver);
		testcasename="Login16";
		Data=genric.ReadingData(testcasename);
		loginPO.deleteMessage(Data.get(0), Data.get(1));
		loginPO.appConected(driver);
		loginPO.changePassword(Data.get(1),Data.get(2),driver);
		loginPO.logout(driver,Data.get(2));
		Thread.sleep(5000);
	}
}
