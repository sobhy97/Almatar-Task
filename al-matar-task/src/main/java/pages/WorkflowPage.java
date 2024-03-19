package pages;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkflowPage {
	
	private WebDriver driver;
	private By rooms = By.xpath("/html/body/app-root/app-single-hotel/div/app-hotel-info/div/div/div[1]/div/div[2]/div[2]/div/button");
	private By book = By.xpath("/html/body/app-root/app-single-hotel/div/div[2]/div/div/div[1]/div/div/div/div/div/div[4]/div/div[2]/app-rooms/div/div[1]/div[3]/div/div/div/div[2]/div/button");
	private By searchIcon = By.xpath("/html/body/app-root/app-shared-layout/div/div[3]/div/div[1]/div[3]/app-add-details/div/div/app-booking-form/form/div[1]/app-fields/div/div[1]/div/div/app-full-name/div/div[2]/ng-select/div");
	private By nickName = By.xpath("/html/body/app-root/app-shared-layout/div/div[3]/div/div[1]/div[3]/app-add-details/div/div/app-booking-form/form/div[1]/app-fields/div/div[1]/div/div/app-full-name/div/div[2]/ng-select/ng-dropdown-panel/div/div[2]/div[1]");
	private By firstName = By.xpath("/html/body/app-root/app-shared-layout/div/div[3]/div/div[1]/div[3]/app-add-details/div/div/app-booking-form/form/div[1]/app-fields/div/div[1]/div/div/app-full-name/div/div[3]/input");
	private By lastName = By.xpath("/html/body/app-root/app-shared-layout/div/div[3]/div/div[1]/div[3]/app-add-details/div/div/app-booking-form/form/div[1]/app-fields/div/div[1]/div/div/app-full-name/div/div[4]/input");
	private By email = By.xpath("/html/body/app-root/app-shared-layout/div/div[3]/div/div[1]/div[3]/app-add-details/div/div/app-booking-form/form/div[1]/app-fields/div/div[2]/div/div[2]/input");
	private By phone = By.xpath("//input[@class='phone-number-input ng-pristine ng-invalid ng-touched']");
	private By day = By.xpath("/html/body/app-root/app-shared-layout/div/div[3]/div/div[1]/div[3]/app-add-details/div/div/app-booking-form/form/div[1]/app-fields/div/div[4]/div/div[2]/app-almatar-datepicker/div/div[1]/ng-select/div/div/div[2]");
	private By day2 = By.xpath("/html/body/app-root/app-shared-layout/div/div[3]/div/div[1]/div[3]/app-add-details/div/div/app-booking-form/form/div[1]/app-fields/div/div[4]/div/div[2]/app-almatar-datepicker/div/div[1]/ng-select/ng-dropdown-panel/div/div[2]/div[1]");
	private By month = By.xpath("/html/body/app-root/app-shared-layout/div/div[3]/div/div[1]/div[3]/app-add-details/div/div/app-booking-form/form/div[1]/app-fields/div/div[4]/div/div[2]/app-almatar-datepicker/div/div[2]/ng-select/div/div/div[2]");
	private By month2 = By.xpath("/html/body/app-root/app-shared-layout/div/div[3]/div/div[1]/div[3]/app-add-details/div/div/app-booking-form/form/div[1]/app-fields/div/div[4]/div/div[2]/app-almatar-datepicker/div/div[2]/ng-select/ng-dropdown-panel/div/div[2]/div[1]");
	private By year = By.xpath("/html/body/app-root/app-shared-layout/div/div[3]/div/div[1]/div[3]/app-add-details/div/div/app-booking-form/form/div[1]/app-fields/div/div[4]/div/div[2]/app-almatar-datepicker/div/div[3]/ng-select/div/div/div[2]");
	private By year2 = By.xpath("/html/body/app-root/app-shared-layout/div/div[3]/div/div[1]/div[3]/app-add-details/div/div/app-booking-form/form/div[1]/app-fields/div/div[4]/div/div[2]/app-almatar-datepicker/div/div[3]/ng-select/ng-dropdown-panel/div/div[2]/div[1]");
	private By submit = By.xpath("//button[@class='btn btn-success btn-book']");

	public WorkflowPage(WebDriver driver)
	{
		this.driver = driver;
	
	}
	
	public void navigateToPaymentPage(String fName , String lName , String mail,String phoneNo)
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Actions actions = new Actions(driver);
		actions.keyDown(Keys.CONTROL).sendKeys("t").keyUp(Keys.CONTROL).perform();
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		driver.get("https://almatar.com/ar/hotels/rooms/cairo-fairmont-nile-city-82023/?checkIn=04%2F02%2F2024&checkOut=04%2F03%2F2024");
		driver.findElement(rooms).click();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.findElement(book).click();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.findElement(searchIcon).click();
		driver.findElement(nickName).click();
		driver.findElement(firstName).sendKeys(fName);
		driver.findElement(lastName).sendKeys(lName);
		driver.findElement(email).sendKeys(mail);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(phone).sendKeys(phoneNo);
		driver.findElement(day).click();
		driver.findElement(day2).click();
		driver.findElement(month).click();
		driver.findElement(month2).click();
		driver.findElement(year).click();
		driver.findElement(year2).click();
		driver.findElement(submit).click();


		}

}
