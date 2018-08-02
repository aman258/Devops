package skeleton;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class Login {
	private WebDriver driver;

	@Given("^user is on the login page of newtours$")
	public void user_is_on_the_login_page_of_newtours() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver","C:\\\\pratiksha\\\\browserdrivers\\\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("http://newtours.demoaut.com/");
	   
	}

	@When("^user provides the correct credentials in newtours$")
	public void user_provides_the_correct_credentials_in_newtours() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 driver.findElement(By.name("userName")).sendKeys("mercury");
		    driver.findElement(By.name("password")).sendKeys("mercury");
		    driver.findElement(By.name("login")).click();
	    
	}

	@Then("^user rendered to newtours home page$")
	public void user_rendered_to_newtours_home_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //Assert.assertEquals("Find a flight",driver.getTitle());
	}
	
	

}
