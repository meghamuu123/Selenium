package POM;

import java.awt.AWTException;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic.Base_class;
import Generic.Utility_Methods;

public class Pom_Class extends Base_class
{
	@FindBy(id="firstName")
	private WebElement First_Name;
	
	@FindBy(id="lastName")
	private WebElement Last_Name;
	
	@FindBy(id="userEmail")
	private WebElement Mail;
	
	@FindBy(xpath="//label[.='Male']")
	private WebElement Gender;
	
	@FindBy(xpath="//input[@placeholder='Mobile Number']")
	private WebElement MobileNo;
	
	@FindBy(id="subjectscontainer")
	private WebElement Subject;
	
	@FindBy(xpath="//label[.='Sports']")
	private WebElement Hobbies;
	
	@FindBy(id="uploadPicture")
	private WebElement uploadPicture;
	
	@FindBy(id="currentAddress")
	private WebElement currentAddress;
	
	@FindBy(xpath="(//div[.='Select State'])[5]")
	private WebElement selectState;
	
	@FindBy(xpath="//div[@id='city']")
	private WebElement selectCity;
	
	
	@FindBy(id="dateOfBirthInput")
	private WebElement dob;
	
	@FindBy(xpath="//select[@class='react-datepicker__month-select']")
	private WebElement month;
	
	@FindBy(xpath="//select[@class='react-datepicker__year-select']")
	private WebElement year;
	
	@FindBy(xpath="//div[.='15']")
	private WebElement selectdate;
	
	public  Pom_Class(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void firstName(String first)
	{
		First_Name.sendKeys(first);
	}
	
	public void lastName(String last)
	{
		Last_Name.sendKeys(last);
	}
	
	public void mail(String email)
	{
		Mail.sendKeys(email);
	}
	
	public void genderRadio()
	{
		Gender.click();
	}
	
	public void mob(String mobile)
	{
		MobileNo.sendKeys(mobile);
	}
	
	public void dateofbirth()
	{
		dob.click();
	}
	
	public void monthdd()
	{
		Utility_Methods.Drop_Down(month).selectByValue("4");
	}
	
	public void yeardd()
	{
		Utility_Methods.Drop_Down(year).selectByValue("1995");
	}
	
	public void date()
	{
		selectdate.click();
	}
	
	public void hob()
	{
		Hobbies.click();
	}
	
	public void uploadPop()
	{
		uploadPicture.sendKeys(prop.getProperty("FILE"));
	}
	
	public void address(String add)
	{
		currentAddress.sendKeys(add);
	}
	
	public void state() throws InterruptedException, AWTException
	{
		selectState.click();
		Thread.sleep(2000);
		Utility_Methods.KeyBoardActions().keyPress(KeyEvent.VK_ENTER);
		Utility_Methods.KeyBoardActions().keyRelease(KeyEvent.VK_ENTER);
	}
	
	public void city() throws InterruptedException, AWTException
	{
		selectCity.click();
		Thread.sleep(2000);
		Utility_Methods.KeyBoardActions().keyPress(KeyEvent.VK_ENTER);
		Utility_Methods.KeyBoardActions().keyRelease(KeyEvent.VK_ENTER);
	}
	
}
