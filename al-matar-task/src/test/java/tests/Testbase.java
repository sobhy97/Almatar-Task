package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.RegistrationPage;
import pages.SearchHotelPage;
import pages.SearchResultPage;
import pages.WorkflowPage;


public class Testbase {
	private WebDriver driver;

	private String url = "https://almatar.com/ar/";
	protected RegistrationPage registrationPage;
	protected SearchHotelPage searchHotelPage;
	protected SearchResultPage searchResultPage;
	protected WorkflowPage workflowpage;
	
	@BeforeClass
	public void setUp()
	{
		WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        registrationPage = new RegistrationPage(driver);
        searchHotelPage = new SearchHotelPage(driver);
        searchResultPage = new SearchResultPage(driver);
        workflowpage = new WorkflowPage(driver);
       
	}
	
	@AfterClass
	public void tearDown() throws InterruptedException
	{
		driver.quit();
	}

}
