package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import PageFactory.Amazon_pf;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Amazon_sd {
	WebDriver driver;
	Amazon_pf a;
	
	@Test(priority=1)
	@Given("^User able to open browser$")
	public void user_able_to_open_browser() throws Throwable {
		driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "com.Amazon_BDD\\Driver\\chromedriver.exe");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.amazon.com/");
		a = PageFactory.initElements(driver, Amazon_pf.class);
		
	}
	@Test(priority=2)
	@Given("^Login with valid credential$")
	public void login_with_valid_credential() throws Throwable {
		a.getSign().click();
		a.getEmail().sendKeys("philenthroap@gmail.com");
		a.getContinue().click();
		a.getPassword().sendKeys("123456789");
		a.getSignSubmit().click();
	  
	}
	@Test(priority=3)
	@Then("^Validate amazon home page$")
	public void validate_amazon_home_page() throws Throwable {
		if (a.getPageValidation().getText().contains("Ayaaz's Amazon.com")) {
			System.out.println("Validation passed");
		}else {System.out.println("Validation Failed");
		
		}
	    
	}
	@Test(priority=4)
	@Then("^Search iphone$")
	public void search_iphone() throws Throwable {
		a.getSearchiphone().sendKeys("iphone");
		a.getClickSub1().click();
		
	  
	}
	@Test(priority=5)
	@Then("^Sort iphone High to Low price$")
	public void sort_iphone_High_to_Low_price() throws Throwable {
		Select sel=new Select(a.getSortClick1());
		sel.selectByVisibleText("Price: High to Low");
	  
	}
	
	@Test(priority=6)
	@Then("Go to next page$")
	public void find_out_total_page_number_of_iphone() throws Throwable {
		a.getNextPage().click();
	}

	@Then("^Sort iphone Low to High price$")
	public void sort_iphone_Low_to_High_price() throws Throwable {
	 
	}

	@Then("^Find out highest and lowest price iphone X$")
	public void find_out_highest_and_lowest_price_iphone_X() throws Throwable {
	 
	}

	@Then("^Add one iphone in cart$")
	public void add_one_iphone_in_cart() throws Throwable {
		
	   
	}

	@Then("^Search HP laptop$")
	public void search_HP_laptop() throws Throwable {
	   
	}

	@Then("^Sort laptop High to Low price$")
	public void sort_laptop_High_to_Low_price() throws Throwable {
	   
	}

	@Then("^Find all laptop and total number display in page one$")
	public void find_all_laptop_and_total_number_display_in_page_one() throws Throwable {
	  
	}

	@Then("^Find out total page number of laptop$")
	public void find_out_total_page_number_of_laptop() throws Throwable {
	   
	}

	@Then("^Sort laptop Low to High price$")
	public void sort_laptop_Low_to_High_price() throws Throwable {
	 
	}

	@Then("^Find out highest and lowest price HP laptop$")
	public void find_out_highest_and_lowest_price_HP_laptop() throws Throwable {
	  
	}

	@Then("^Add one laptop in cart$")
	public void add_one_laptop_in_cart() throws Throwable {
	  
	}

	@Then("^Provide invalide payment information$")
	public void provide_invalide_payment_information() throws Throwable {
	   
	}

	@Then("^Validate payment failure$")
	public void validate_payment_failure() throws Throwable {
	 
	}

	@Then("^Close the browser$")
	public void close_the_browser() throws Throwable {
	  
	}



}
