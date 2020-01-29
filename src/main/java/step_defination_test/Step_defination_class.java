package step_defination_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_defination_class {
	static WebDriver driver;
	@Given("user is on Home Page")
	public void user_is_on_Home_Page() {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://localhost:8083/TestMeApp");
	}

	@When("User Navigate to LogIn Page")
	public void user_Navigate_to_LogIn_Page() {
		driver.findElement(By.linkText("SignIn")).click();
	    
	}

	@When("User enters {string} and  {string}")
	public void user_enters_and(String username, String password) {
		driver.findElement(By.name("userName")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.name("Login")).click();
		driver.findElement(By.linkText("SignOut")).click();
	   
	}

	@Then("Message displayed Login Successful")
	public void message_displayed_Login_Successful() {
		System.out.println("Login Successfully");
	   
	}


}
