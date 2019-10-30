package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Amazon_pf {
WebDriver driver;

	
	public void Amazonpf(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
		
	}
	@FindBy(how=How.XPATH,using="//*[@id=\"nav-link-accountList\"]/span[1]")
	private WebElement sign;
	@FindBy(how=How.XPATH,using="//input[@id='ap_email']")
	private WebElement Email;
	@FindBy(how=How.XPATH,using="//input[@id='continue']")
	private WebElement Continue;
	@FindBy(how=How.XPATH,using="/html/body")
	private WebElement Password;
	@FindBy(how=How.XPATH,using="//input[@id='signInSubmit']")
	private WebElement SignSubmit;
	@FindBy(how=How.XPATH,using="//span[@id='nav-your-amazon-text']")
	private WebElement pageValidation;
	@FindBy(how=How.XPATH,using="//input[@id='twotabsearchtextbox']")
	private WebElement Searchiphone;
	@FindBy(how=How.XPATH,using="//*[@id=\"nav-search\"]/form/div[2]/div/input")
	private WebElement clickSub1;
	@FindBy(how=How.XPATH,using="(//*[contains(@class,'a-spacing-top-mini')])[1]")
	private WebElement sortClick1;
	//@FindBy(how=How.XPATH,using="//span[@id='s-result-count']")
	//private WebElement totaliphone;
	@FindBy(how=How.XPATH,using="//span[@id='pagnNextString']")
	private WebElement nextPage;
	@FindBy(how=How.XPATH,using="//*[contains(text(),'Lux iPhone 7 Plus Classic in 18k Rose Gold - 256GB (black screen)')]")
	private WebElement addiphone;
	
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getSign() {
		return sign;
	}
	public WebElement getEmail() {
		return Email;
	}
	public WebElement getContinue() {
		return Continue;
	}
	public WebElement getPassword() {
		return Password;
	}
	public WebElement getSignSubmit() {
		return SignSubmit;
	}
	public WebElement getPageValidation() {
		return pageValidation;
	}
	public WebElement getSearchiphone() {
		return Searchiphone;
	}
	public WebElement getClickSub1() {
		return clickSub1;
	}
	public WebElement getSortClick1() {
		return sortClick1;
	}
	public WebElement getNextPage() {
		return nextPage;
	}
	public WebElement getAddiphone() {
		return addiphone;
	}
}

	
	
	
	
	
