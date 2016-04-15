package com.Pom;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class LoginPo 
{
	public LoginPo(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	String parent;
	
	@FindBy (id="Email")
	private WebElement eleEmailTxtBox;
	public WebElement getEleEmailTxtBox()
	{
		return eleEmailTxtBox;
	}
	
	@FindBy (id="next")
	private WebElement eleNextBtn;
	public WebElement getEleNextBtn()
	{
		return eleNextBtn;
	}
	
	@FindBy (id="Passwd")
	private WebElement elePasswordTxtBox;
	public WebElement getElePasswordTxtBox()
	{
		return elePasswordTxtBox;
	}
	
	@FindBy (id="signIn")
	private WebElement eleSignInBtn;
	public WebElement getEleSignInBtn()
	{
		return eleSignInBtn;
	}
	
	@FindBy (xpath="//span[@role='checkbox']")
	private WebElement eleCheckBox;
	public WebElement getEleCheckBox()
	{
		return eleCheckBox;
	}
	
	@FindBy (xpath="(//div[@data-tooltip='Select'])[2]")
	private WebElement eleCheckBox1;
	public WebElement getEleCheckBox1()
	{
		return eleCheckBox1;
	}
	
	@FindBy (xpath="//div [@class='ar9 T-I-J3 J-J5-Ji']")
	private WebElement eleDeletBtn;
	public WebElement getEleDeletBtn()
	{
		return eleDeletBtn;
	}
	
	@FindBy (xpath="//span[@class='CJ']")
	private WebElement eleMoreLnk;
	public WebElement getEleMoreLnk()
	{
		return eleMoreLnk;
	}
	
	@FindBy (xpath="//a[text()='Trash']")
	private WebElement eleTrashLnk;
	public WebElement getEleTrashLnk()
	{
		return eleTrashLnk;
	}
	
	@FindBy (xpath="//div[text()='Delete forever']")
	private WebElement eleDeleteForeverBtn;
	public WebElement getEleDeleteForeverBtn()
	{
		return eleDeleteForeverBtn;
	}
	
	@FindBy (xpath="//span [@class='gb_1a gbii']")
	private WebElement eleUserIconBtn;
	public WebElement getEleUserIconBtn()
	{
		return eleUserIconBtn;
	}
	
	@FindBy (xpath="//a[text()='My Account']")
	private WebElement eleMyAccountBtn;
	public WebElement getEleMyAccountBtn()
	{
		return eleMyAccountBtn;
	}
	
	@FindBy (id="i2")
	private WebElement elePersonalInfoLnk;
	public WebElement getElePersonalInfoLnk()
	{
		return elePersonalInfoLnk;
	}
	
	@FindBy (xpath="(//a[text()='Account overview'])[1]")
	private WebElement eleAccountOverviewLnk;
	public WebElement getEleAccountOverviewLnk()
	{
		return eleAccountOverviewLnk;
	}
	
	@FindBy (xpath="//a[text()='View Dashboard']")
	private WebElement eleViewDashboardLnk;
	public WebElement getEleViewDashboardLnk()
	{
		return eleViewDashboardLnk;
	}
	
	@FindBy (xpath="//a[text()='Change Password']")
	private WebElement eleChangePasswordLnk;
	public WebElement getEleChangePasswordLnk()
	{
		return eleChangePasswordLnk;
	}
	
	@FindBy (xpath="//div[text()='New password']/../input")
	private WebElement eleNewPasswordTxtFld;
	public WebElement getEleNewPasswordTxtFld()
	{
		return eleNewPasswordTxtFld;
	}
	
	@FindBy (xpath="//div[text()='Confirm new password']/../input")
	private WebElement eleConfirmPasswordTxtFld;
	public WebElement getEleConfirmPasswordTxtFld()
	{
		return eleConfirmPasswordTxtFld;
	}
	
	@FindBy (xpath="//span[text()='Change password']")
	private WebElement eleChangePasswordBtn;
	public WebElement getEleChangePasswordBtn()
	{
		return eleChangePasswordBtn;
	}
	
	@FindBy (xpath="(//span/b[text()='Your password changed'])[1]")
	private WebElement elePasswordChangeTxt;
	public WebElement getElePasswordChangeTxt()
	{
		return elePasswordChangeTxt;
	}
	
	@FindBy (xpath="//a[contains(text(),'Inbox')]")
	private WebElement eleInboxLnk;
	public WebElement getEleInboxLnk()
	{
		return eleInboxLnk;
	}
	
	@FindBy (id="gb_71")
	private WebElement eleSignOutBtn;
	public WebElement getEleSignOutBtn()
	{
		return eleSignOutBtn;
	}
	
	@FindBy (id="account-chooser-link")
	private WebElement eleAddAnotherAccLnk;
	public WebElement getEleAddAnotherAccLnk()
	{
		return eleAddAnotherAccLnk;
	}
	
	@FindBy (xpath="//a[text()='Remove']")
	private WebElement eleRemoveLnk;
	public WebElement getEleRemoveLnk()
	{
		return eleRemoveLnk;
	}
	
	@FindBy (xpath="//a[text()='Add account']")
	private WebElement eleAddAccLnk;
	public WebElement getEleAddAccLnk()
	{
		return eleAddAccLnk;
	}
	
	@FindBy (id="choose-account-0")
	private WebElement eleCloseBtn;
	public WebElement getEleCloseBtn()
	{
		return eleCloseBtn;
	}
	
	@FindBy (xpath="//a[text()='Done']")
	private WebElement eleDoneLnk;
	public WebElement getEleDoneLnk()
	{
		return eleDoneLnk;
	}
	
	@FindBy (xpath="(//a[text()='Connected apps & sites'])[2]")
	private WebElement eleConnectedAppLnk;
	public WebElement getEleConnectedAppLnk()
	{
		return eleConnectedAppLnk;
	}
	
	@FindBy (xpath="//a[text()='Manage apps']")
	private WebElement eleManageAppLnk;
	public WebElement getEleManageAppLnk()
	{
		return eleManageAppLnk;
	}
	
	@FindBy (xpath="//div [@class='vo zG']")
	private List<WebElement> eleConectedAppLst;
	public List<WebElement> getEleConectedAppLst()
	{
		return eleConectedAppLst;
	}
	
	@FindBy (xpath="//span[text()='Remove']")
	private WebElement eleRemoveBtn;
	public WebElement getEleRemoveBtn()
	{
		return eleRemoveBtn;
	}
	
	@FindBy (xpath="(//span[text()='OK'])[2]")
	private WebElement eleOkBtn;
	public WebElement getEleOkBtn()
	{
		return eleOkBtn;
	}
	
	public void deleteMessage(String userName, String password ) throws InterruptedException
	{
		getEleEmailTxtBox().sendKeys(userName);
		getEleNextBtn().click();
		getElePasswordTxtBox().sendKeys(password);
		getEleSignInBtn().click();
		getEleCheckBox().click();
		getEleDeletBtn().click();
		Thread.sleep(5000);
		getEleMoreLnk().click();
		getEleTrashLnk().click();
		getEleCheckBox1().click();
		getEleDeleteForeverBtn().click();
	
	}
	
	public void appConected(WebDriver driver) throws InterruptedException
	{
		getEleUserIconBtn().click();
		getEleMyAccountBtn().click();
		Set <String> set1=driver.getWindowHandles();
		//System.out.println(set1.size());
		Iterator <String> win1=set1.iterator();
		parent=win1.next();
		String child=win1.next();
		driver.switchTo().window(child);
//		getEleConnectedAppLnk().click();
//		getEleManageAppLnk().click();
//		if(getEleConectedAppLst().isEmpty())
//		{
//			System.out.println("No app connected");
//		}
//		else
//		{
//			for (int i=0;i<getEleConectedAppLst().size();i++)
//			{
//				getEleConectedAppLst().get(i).click();
//				getEleRemoveBtn().click();
//				getEleOkBtn().click();
//				Thread.sleep(4000);
//			}
//		}
	}
	
	public void changePassword(String oldPassword,String newPassword,WebDriver driver) throws InterruptedException
	{
		
		getEleUserIconBtn().click();
		getEleMyAccountBtn().click();
		getElePersonalInfoLnk().click();
		getEleAccountOverviewLnk().click();
		getEleViewDashboardLnk().click();
		getEleChangePasswordLnk().click();
		getElePasswordTxtBox().sendKeys(oldPassword);
		getEleSignInBtn().click();
		getEleNewPasswordTxtFld().sendKeys(newPassword);
		getEleConfirmPasswordTxtFld().sendKeys(newPassword);
		getEleChangePasswordBtn().click();
		Thread.sleep(5000);
		
		Thread.sleep(5000);
		
	}
	public void logout(WebDriver driver,String newPassword) throws InterruptedException
	{
		driver.close();
		Thread.sleep(5000);
		driver.switchTo().window(parent);
		getEleInboxLnk().click();
		if(getElePasswordChangeTxt().isDisplayed())
		{
			System.out.println(getElePasswordChangeTxt().getText());
		}
		getEleUserIconBtn().click();
		getEleSignOutBtn().click();
		getElePasswordTxtBox().sendKeys(newPassword);
		getEleSignInBtn().click();
		getEleUserIconBtn().click();
		getEleSignOutBtn().click();
		getEleAddAnotherAccLnk().click();
		getEleRemoveLnk().click();
		getEleCloseBtn().click();
		getEleDoneLnk().click();
		getEleAddAccLnk().click();
	}
}
