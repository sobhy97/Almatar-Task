package pages;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class RegistrationPage {
	private WebDriver driver;
	private By newAccount = By.xpath("//button[@class='fill-btn']");
	private By firstName = By.xpath("//input[@name='firstName']");
	private By lastName = By.xpath("//input[@name='lastName']");
	private By email = By.xpath("//input[@name='emailOrphone']");
	private By phoneNo = By.xpath("//input[@class='phone-number-input ng-untouched ng-pristine ng-invalid']");
	private By password = By.xpath("//input[@name='password']");
	private By policyBttn = By.xpath("//span[@class='checkmark']");
	private By signUpBtn = By.xpath("//button[@class='float-right btn btn-success']");
	private By assertMessage = By.linkText("+966 53 311 1278");

	
	

	public RegistrationPage(WebDriver driver)
	{
		this.driver = driver;
	
	}
	
	public void navigateToSignUpPage(String firstname ,String lastname,String pass,String mail , String phone )
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(newAccount).click();
		driver.findElement(firstName).sendKeys(firstname);
		driver.findElement(lastName).sendKeys(lastname);
		driver.findElement(password).sendKeys(pass);
		driver.findElement(email).sendKeys(mail);
		driver.findElement(phoneNo).sendKeys(phone);
		driver.findElement(policyBttn).click();
		driver.findElement(signUpBtn).click();
		List<WebElement> elements = driver.findElements(By.xpath("//div[@class='otp-container']"));

		for (WebElement element : elements) {
		    System.out.println(element.getText());
		    Assert.assertTrue(element.getText().contains("الرجاء إدخال OTP للتحقق من رقم هاتفك"),"Assertion is passed");
		   
		}		
		
	}

}
