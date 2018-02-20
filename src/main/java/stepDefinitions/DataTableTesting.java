package stepDefinitions;

import java.util.List;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DataTableTesting {
	
	@When("^user enter home page$")
	public void user_enter_home_page()  {
		
System.out.println("User is on home page");
	    
	}

	@Then("^we have to enter username and password$")
	public void we_have_to_enter_username_and_password(DataTable sampledata)
	{
		
		List<List<String>> data =sampledata.raw();
		System.out.println(data.get(0).get(0));
		System.out.println(data.get(0).get(1));
	   
	}

	@Then("^clicks on login button$")
	public void clicks_on_login_button()  {
	   	}

    @Given("^tag method$")
    public void tagmethod()
    {
    	System.out.println("this another tag from differnt class");
    }
	

}
