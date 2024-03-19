# Ahmed Sobhy
### This Challenge covers the following :
* Excel sheet with the TC's.
* Automation Testing using [Selenium - Maven - Testng].


# Automation Testing 

This part is covering a list of automated test cases for Almatar website.

## Installation
I used Selenium.
### Preconditions for REST Assured: 
* Java.
* Eclipse.
* Maven.
* TestNG.
************** Please Run this project from TestSuie.xml file ***********

### Maven Dependency
```
        <dependency>
			<groupId>org.seleniumhq.selenium</groupId>
			<artifactId>selenium-java</artifactId>
			<version>3.141.59</version>
		</dependency>
		<dependency>
    	<groupId>io.github.bonigarcia</groupId>
    	<artifactId>webdrivermanager</artifactId>
    	<version>5.7.0</version>
		</dependency>
		        <dependency>
            <groupId>org.testng</groupId>
            <artifactId>testng</artifactId>
            <version>7.3.0</version>
            <scope>test</scope>
        </dependency>
```
Check the pom file.

### Code Snippet

```Java
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