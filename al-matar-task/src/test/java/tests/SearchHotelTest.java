package tests;

import org.testng.annotations.Test;

public class SearchHotelTest extends Testbase  {
	
	@Test
	public void openLoginScreen()
	{
		searchHotelPage.navigateToSearchResults();
	}
	

}
