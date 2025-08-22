package stepdefinition;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class Loginstep {
	WebDriver driver;
	
	@Given("login page should be open in default browser")
	public void login_page_should_be_open_in_default_browser() {
		 driver=new ChromeDriver();
		 driver.get("http://zero.webappsecurity.com/login.html");
	    
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	     driver.manage().window().maximize();
	     
	}

	@When("^click on login button and enter (.*) and add (.*)$")
	public void click_on_login_button_and_enter__and_(String username1,String password1) {
		Pageclass pg=new Pageclass(driver);
		pg.login(username1, password1);

	}

	@And("^click on signin button check(.*)$")
	public void click_on_signin_button(String status) {
		//driver.findElement(By.name("submit")).click();
		System.out.println("status of test:"+ status);	  
	}

	@Then("login successfully and open home page")
	public void login_successfully_and_open_home_page() {
		driver.get("http://zero.webappsecurity.com/login.html");
		//System.out.println("pass");
	    driver.close();
	    	    
	    }

}