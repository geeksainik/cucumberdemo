package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginStepDefinition {
	
	WebDriver driver;
	Scenario s;
	
	@Given("^User is already on login page$")
	public void user_is_already_on_login_page() {
		System.setProperty("webdriver.chrome.driver","E:\\myworkspace_selenium\\software\\chromedriver\\chromedriver.exe");
	 driver = new ChromeDriver();
	 driver.get("https://www.freecrm.com/index.html");
	    
	}
	@When("^title of login page is Free CRM$")
	public void title_of_login_page_is_Free_CRM() {
		String title = driver.getTitle();
	 System.out.println(title);
	 Assert.assertEquals("#1 Free CRM for Any Business: Online Customer Relationship Software", title);
	
		}
	@Then("^User enter \"(.*)\" & \"(.*)\"$")
	public void user_enter_Username_Password(String username,String passwrd) {
		
			 driver.findElement(By.name("username")).sendKeys(username);
			 driver.findElement(By.name("password")).sendKeys(passwrd);
	    
	}
	
	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button()  {
		
		WebElement loginBtn =
			 driver.findElement(By.xpath("//input[@type='submit']"));				 
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", loginBtn);
	    
	}
	
   @Then("^user is on home page$")
	 public void user_is_on_hopme_page(){
	 String title = driver.getTitle();
	 System.out.println("Home Page title ::"+ title);	 
	 Assert.assertEquals("CRMPRO", title);
	 }
	@And("^close the site$")
	public void close_the_site()
	{
		driver.close();
	}	
	
	@Given("^test method$")
	public void test_method()
	{
		System.out.println("This is tag method1");
	}
	
	@Given("^some method$")
	public void some_method()
	{
		System.out.println("this is tag method2");
	}
}