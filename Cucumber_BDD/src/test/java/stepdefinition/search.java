package stepdefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class search {
	WebDriver driver;
	@Given("click on signin button")
	public void click_on_signin_button() {
		driver=new ChromeDriver();
		 driver.get("http://zero.webappsecurity.com");
	    
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	     driver.manage().window().maximize();  
	}

	@When("^enter inputs and then use keyboard enter key(.*)$")
	public void enter_inputs_and_then_use_keyboard_enter_key(String search1) {
		Pageclass pg=new Pageclass(driver);
		pg.search(search1);
		System.out.println(search1);
	}

	@Then("list of output related to input")
	public void list_of_output_related_to_input() {
		driver.close();
	    
	}


	}


