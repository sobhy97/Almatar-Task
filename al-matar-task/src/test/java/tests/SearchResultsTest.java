package tests;

import org.testng.annotations.Test;

public class SearchResultsTest extends Testbase {
	
	@Test	
	public void selectFromSearchResults()
	{
		searchHotelPage.navigateToSearchResults();
		searchResultPage.viewSearchResults();
	}


}
