package StepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class StepDefinition {

	WebDriver wb ;
	
	@Given("^the user Enter the Username and password$")
	public void the_user_Enter_the_Username_and_password(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rahul\\Selenium Drivers\\chromedriver.exe");
		wb=new ChromeDriver();
		WebDriver wb = new ChromeDriver();
		wb.manage().window().maximize();
		wb.manage().deleteAllCookies();
		wb.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		wb.get("https://www.freecrm.com");
		WebDriverWait w= new WebDriverWait(wb, 20);
		
		
	
	}

	@Then("^the user enter goes to the Deals>Products$")
	public void the_user_enter_goes_to_the_Deals_Products() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Given("^if there are any products the user deletes the products and creates the products$")
	public void if_there_are_any_products_the_user_deletes_the_products_and_creates_the_products(DataTable arg1)
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
		// E,K,V must be a scalar (String, Integer, Date, enum etc)
		throw new PendingException();
	}

}
