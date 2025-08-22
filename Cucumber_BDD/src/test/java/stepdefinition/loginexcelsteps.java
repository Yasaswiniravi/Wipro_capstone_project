package stepdefinition;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;

public class loginexcelsteps {
	WebDriver driver;

    @Given("user logs in with all usernames and passwords from excel")
    public void user_logs_in_with_all_usernames_and_passwords_from_excel() {
        String filePath = "src/test/resources/testdata/LoginData.xlsx";
        List<List<String>> sheetData = ExcelReader.getSheetData(filePath, "Sheet1");

        for (int i = 1; i < sheetData.size(); i++) {
            String username = sheetData.get(i).get(0);
            String password = sheetData.get(i).get(1);

            System.out.println("Login attempt " + i + ": " + username + " / " + password);

            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.get("http://zero.webappsecurity.com/login.html");

            driver.findElement(By.id("user_login")).sendKeys(username);
            driver.findElement(By.id("user_password")).sendKeys(password);
            driver.findElement(By.name("submit")).click();
            
//            String errormsg=driver.findElement(By.xpath("//*[@id=\"login_form\"]/div[1]")).getText();
//            System.out.println(errormsg);
            driver.quit();
        }
	}

}
