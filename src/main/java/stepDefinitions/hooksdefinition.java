package stepDefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;

public class hooksdefinition {
	
	@Before
	public void beforemethod()
	{
		System.out.println("this is global before method");
	}
	
	@After
	public void aftermethod()
	{
		System.out.println("this is global after method");
	}
	
	@Before("@first")
	public void beforemethod1()
	{
		System.out.println("thios is local before for first method");
	}
	
	@After("@first")
	public void aftermethod1()
	{
		System.out.println("this is local after for first method");
	}
	
	@ Before("@second")
	
public void beforemethod2()
{
		System.out.println("this is local befor for method2");
}
	
	@ After("@third")
	public void aftermethod2()
	{
		System.out.println("this is local after for 3rd method");
	}
	@Given("^first method$")
	public void first_method() throws Throwable {
	System.out.println("this is first method");
	   
	}

	@Given("^second method$")
	public void second_method() throws Throwable {
	    System.out.println("this is second method");
	}

	@Given("^third method$")
	public void third_method() throws Throwable {
    System.out.println("this is third method");
   

	}


}
