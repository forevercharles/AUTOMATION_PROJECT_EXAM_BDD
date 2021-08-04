package steps;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.LoginPage;
import util.BrowserFactory;

public class LoginStepDef {
	WebDriver driver;
	LoginPage loginpage;
	
	@Before
	public void beforeRun() {
		driver = BrowserFactory.init();
		loginpage = PageFactory.initElements(driver, LoginPage.class);

	}
	
	@Given ("^User is on the TODO list page$")
	public void user_is_on_the_todo_list_page() {
		driver.get("http://techfios.com/test/101/");
	}
	
	@When("^User clicks on the set sky blue background button$")
	public void user_clicks_on_the_set_sky_blue_background_button() throws Throwable {
		loginpage.clickOnSkyBlueBackGround();
	}
	
	@When ("^User clicks on the set white background button$")
	public void user_clicks_on_the_set_white_background_button() {
		loginpage.clickOnWhiteBackGround();
	}

	@Then("^User should be able to see background change to sky blue$")
	public void user_should_be_able_to_see_background_change_to_sky_blue() throws Throwable {
	     loginpage.skyBlueBackGroundShows();
	     
	}

	@Then ("^User should be able to see background change to white$")
	public void user_should_be_able_to_see_background_change_to_white() {
		loginpage.whiteBackGroundShows();
	}
	
 	@After
	public void tearDown() {
		driver.close();
		driver.quit();
	}


}
