package pages;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class SearchResultPage {
	private WebDriver driver;
	private By selectOption = By.linkText("فيرمونت نايل سيتي");
	private By rooms = By.xpath("/html/body/app-root/app-single-hotel/div/app-hotel-info/div/div/div[1]/div/div[2]/div[2]/div/button");
	private By book = By.xpath("/html/body/app-root/app-single-hotel/div/div[2]/div/div/div[1]/div/div/div/div/div/div[4]/div/div[2]/app-rooms/div/div[1]/div[2]/div/div/div/div[2]/div/button/span");
	private By nickName = By.id("a920263db0dc-0");
	
	
	public SearchResultPage(WebDriver driver)
	{
		this.driver = driver;
	
	}
	
	public void viewSearchResults()
	{
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		List<WebElement> elements = driver.findElements(By.xpath("//div[@class='col-lg-9 col-xl-12 all-hotels']"));

		for (WebElement element : elements) {
		    System.out.println(element.getText());
			driver.findElement(selectOption).click();
//			Actions actions = new Actions(driver);
//			actions.keyDown(Keys.CONTROL).sendKeys("t").keyUp(Keys.CONTROL).perform();
//			ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
//			driver.switchTo().window(tabs.get(1));
//			driver.get("https://almatar.com/ar/hotels/rooms/cairo-fairmont-nile-city-82023/?checkIn=04%2F02%2F2024&checkOut=04%2F03%2F2024");
//			driver.findElement(rooms).click();
//			driver.findElement(book).click();
//			driver.findElement(nickName).click();


		   
		}
	}

}
