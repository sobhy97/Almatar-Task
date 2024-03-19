package tests;

import org.testng.annotations.Test;

public class WorkflowTest extends Testbase{
	
	@Test	
	public void workFlow()
	{
		searchHotelPage.navigateToSearchResults();
		searchResultPage.viewSearchResults();
		workflowpage.navigateToPaymentPage("Ahmed","Sobhy" , "test99@test.com","533111278");
	}


}
