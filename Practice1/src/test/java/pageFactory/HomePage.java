package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	@FindBy(id="logout")
	WebElement btn_logout;
	
	WebDriver driver;
	
	public HomePage (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void checkLogOutIsDisplayed() {
		btn_logout.isDisplayed();
	}
}
