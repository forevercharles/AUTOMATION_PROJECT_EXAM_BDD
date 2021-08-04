package page;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	

// identify the web elements
	@FindBy(how = How.XPATH, using = "//button[@type='button' and @onclick='myFunctionSky()']") WebElement SKYBLUE_BACKGROUND_BUTTON;
	@FindBy(how = How.XPATH, using = "//button[@type='button' and @onclick='myFunctionWhite()']") WebElement WHITE_BACKGROUND;

// interactive methods
	public void clickOnSkyBlueBackGround() {
		SKYBLUE_BACKGROUND_BUTTON.click();
	}
	
	public void clickOnWhiteBackGround() {
		WHITE_BACKGROUND.click();
	}
		
	public void skyBlueBackGroundShows() {
		Assert.assertTrue("sky blue background does not show", SKYBLUE_BACKGROUND_BUTTON.isDisplayed());
	}
	
	public void whiteBackGroundShows() {
		Assert.assertTrue("white background does not show", WHITE_BACKGROUND.isDisplayed());
	}

}