package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchHotelPage {
	
	private WebDriver driver;
	private By autoComplete = By.id("typeahead-http");
	private By list1 = By.xpath("/html/body/app-root/app-home/app-almatar-section[1]/section/div/app-almatar-search-forms/section/div/div/div/div/div/div/div/app-hotel-search/section/form/div/div/div[1]/div[3]/div/app-auto-complete/section/div/div/div/div[1]");
	private By searchIcon = By.xpath("//span[@class='icon-search']");
	
	public SearchHotelPage(WebDriver driver)
	{
		this.driver = driver;
	
	}
	
	public void navigateToSearchResults()
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(autoComplete).click();
		driver.findElement(list1).click();
		driver.findElement(searchIcon).click();
	}

}
