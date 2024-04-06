package pagepkg;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pagecls {
	WebDriver driver;
	
	@FindBy(xpath="/html/body/div[2]/header/nav/div[1]/div/div/div[2]/div[2]/div/div[1]/button")
	WebElement smiley;
	@FindBy(xpath="//*[@id=\"sign-in-form\"]/div[4]/a")
	WebElement signup;
	
	@FindBy(xpath="//*[@id=\"registration-form-fname\"]")
	WebElement firstname;
	
	@FindBy(xpath="//*[@id=\"registration-form-lname\"]")
	WebElement lastname;
	@FindBy(xpath="//*[@id=\"registration-form-email\"]")
	WebElement email;
	@FindBy(xpath="//*[@id=\"registration-form-email-confirm\"]")
	WebElement confirmemail;
	@FindBy(xpath="//*[@id=\"registration-form-password\"]")
	WebElement password ;
	
	@FindBy(xpath="//*[@id=\"registration-form-password-confirm\"]")
	WebElement confirmpassword ;
	@FindBy(xpath="//*[@id=\"maincontent\"]/div/section/div/div[2]/div/div/form/div[6]/label")
	WebElement checkbox;
	
	@FindBy(xpath="//*[@id=\"maincontent\"]/div/section/div/div[2]/div/div/form/button")
	WebElement createaccount;
	
	@FindBy(xpath="/html/body/div[2]/header/nav/div[1]/div/div/div[2]/div[2]/div/div[1]/button")
	WebElement smileyagin;
	
	@FindBy(id="login-form-email")
	WebElement loginfirstname;
	
	@FindBy(id="login-form-password")
	WebElement loginpaswd;
	
	@FindBy(name="login-form-submit")
	WebElement signin;
	
	@FindBy(xpath="//*[@id=\"maincontent\"]/div/div[1]/div/a")
	WebElement signout;
	
	
	@FindBy(xpath="/html/body/div[2]/header/nav/div[1]/div/div/div[2]/div[2]/div/button")
	WebElement search;
	@FindBy(xpath="//*[@id=\"search-overlay\"]/div/div[1]/div[1]/div[2]/div[1]/form/input[1]")
	WebElement searchtype;
	@FindBy(name="reset-button")
	WebElement clear;
	@FindBy(xpath="//*[@id=\"search-overlay\"]/div/div[1]/div[1]/div[1]/div/button")
	WebElement close;
	@FindBy(xpath="//*[@id=\"bestsellers-makeup\"]/span")
	WebElement bestsellers;
	@FindBy(xpath="//*[@id=\"face\"]/span")
	WebElement face;
	@FindBy(xpath="//*[@id=\"gifts-and-value-sets\"]/span")
    WebElement giftset;	
	@FindBy(xpath="//*[@id=\"product-search-results\"]/div[2]/div[1]/button[1]")
	WebElement filter;
	@FindBy(xpath="//*[@id=\"refinement-price\"]/ul/li[2]/button/i")
	WebElement price;
	@FindBy(xpath="//*[@id=\"maincontent\"]/div[2]/div[2]/div/div/div/div[3]/button[3]/span")
	WebElement seeresult;
	@FindBy(xpath="//*[@id=\"product-search-results\"]/div[2]/div[3]/div[1]/button")
	WebElement sort;
	@FindBy(name="sort-order")
	WebElement sortorder;
	@FindBy(xpath="//*[@id=\"product-search-results\"]/div[4]/div/div/div[3]/div/div/div[1]/a/div[4]/picture/img")
	WebElement product1;
	@FindBy(id="pdp-add-cart-toggle-btn")
	WebElement addtobag;
	@FindBy(xpath="//*[@id=\"product-search-results\"]/div[4]/div/div/div[2]/div/div/div[1]/a[1]/div[4]/picture/img")
	WebElement product2;
	@FindBy(xpath="/html/body/div[2]/header/nav/div[1]/div/div/div[2]/div[2]/div/div[4]/div[3]/div/div[2]/div/div[2]/div[1]/div/div/div/div[2]/div[1]/div/div[2]/button")
	WebElement remove;
	@FindBy(xpath="//*[@id=\"pdp-add-cart-toggle-btn\"]")
	WebElement addtobag2;
	@FindBy(xpath="/html/body/div[2]/header/nav/div[1]/div/div/div[2]/div[2]/div/div[4]/div[3]/div/div[2]/div/div[4]/div[4]/div/a")
	WebElement viewmybag;
    @FindBy(xpath="/html/body/div[2]/header/nav/div[1]/div/div/div[2]/div[1]/div/div/a[1]/span")
	WebElement stores;
	@FindBy(xpath="/html/body/div[2]/header/nav/div[1]/div/div/div[2]/div[1]/div/div/a[2]/span")
	WebElement appoinment;
	@FindBy(xpath="/html/body/div[2]/header/nav/div[1]/div/div/div[1]/a/img[1]")
	WebElement benefitlast;
	
	
	
	
	public Pagecls(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public void setvalues(String UserName,String password)
	{
		loginfirstname.sendKeys(UserName);
		loginpaswd.sendKeys(password);
		
		
	}
	
	public void smileyclick()
	{
		smiley.click();
	}
	
	public void signupclick()
	{
		signup.click();
		firstname.sendKeys("linda");
		lastname.sendKeys("antony");
		email.sendKeys("lindaantony11@gmail.com");
		confirmemail.sendKeys("lindaantony11@gmail.com");
		password.sendKeys("Linda123*");
		confirmpassword.sendKeys("Linda123*");
		checkbox.click();
		createaccount.click();
	}
	public void loginclick()
	{
		smileyagin.click();
		
	}
	public void signinclick()
	{
		signin.click();
		
	}
	public void emailclearclick()
	{
		loginfirstname.clear();
	}public void pswdclearclick()
	{
		loginpaswd.clear();
		
	}
	public void signout()
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		signout.click();
	}
	public void searching()
	{
		search.click();
		searchtype.sendKeys("lakme");
		clear.click();
		close.click();
	}
	public void headings()
	{
	    bestsellers.click();
	    face.click();;
		giftset.click();
	}
	public void filter()
	{
		filter.click();
		price.click();
		seeresult.click();
	}
	public void sorting()
	{
		sort.click();		
		sortorder.click();
	}
	public void cart()
	{
		product1.click();
		addtobag.click();
		driver.navigate().back();
        product2.click();
	    addtobag2.click();
		remove.click();
		viewmybag.click();
	}
	public void task()
	{
		stores.click();
		appoinment.click();
	}
	public void backtohome()
	{
		benefitlast.click();
		
	}
	
		
	}

		
		
	