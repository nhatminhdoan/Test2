package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.HomePage;
import pageFactory.LoginPage;

public class LoginStep {
	WebDriver driver = null;
	LoginPage login;
	HomePage home;
	
	@Given("browser is open")
	public void browser_is_open() {
	 System.out.println("Inside Step - browser is open");
	 
	 String projectPath = System.getProperty("user.dir");
	 System.out.println("Project path is :"+projectPath);
	 
 	 System.setProperty("webdriver.chrome.driver",projectPath+"/src/test/resources/drivers/chromedriver.exe");
	 
	 driver = new ChromeDriver ();
	 driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
	 driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
	 //driver.manage().window().maximize();
	 }

	@And("user is on login page")
	public void user_is_on_login_page() {
	   driver.navigate().to("https://example.testproject.io/web/");
	}

	@When("^user enters (.*) and (.*)$")
	public void user_enters_username_and_password(String username, String password)  {
        login= new LoginPage(driver);
		
        login.enterUsername(username);
        login.enterPassword(password);
		
//	    driver.findElement(By.id("name")).sendKeys(username);
//	    driver.findElement(By.id("password")).sendKeys(password);
	
	}

	@And("user clicks on logins")
	public void user_clicks_on_logins() {
		
		login.clickOnLogin();
		
		//driver.findElement(By.id("login")).click();
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() throws InterruptedException {
		
		//home.checkLogOutIsDisplayed();
		//driver.findElement(By.id("logout")).isDisplayed();
		Thread.sleep(2000);
		
		driver.close();
		driver.quit();
	}

}
