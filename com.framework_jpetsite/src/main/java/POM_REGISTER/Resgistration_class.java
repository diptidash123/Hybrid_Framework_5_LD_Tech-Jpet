package POM_REGISTER;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Resgistration_class {
	
	//scenario-1 Do the registration for the user/customer
	
	WebDriver driver;
	
	//Declaration
	@FindBy (xpath = "//input[@name=\"keyword\"]")
	private WebElement searchBox;
	
	@FindBy (xpath = "//input[@name=\"searchProducts\"]")
	private WebElement searchbutton;
	
	@FindBy (xpath = "//a[text()='Sign In']")
	private WebElement signin;
	
	@FindBy (xpath = "//a[text()='Register Now!']")
	private WebElement Registerlink;
	
	@FindBy (xpath = "//input[@name=\"username\"]")
	private WebElement userID;
	
	@FindBy(xpath = "//input[@name=\"password\"]")
	private WebElement newpassword;
	
	@FindBy (xpath = "//input[@name=\"repeatedPassword\"]")
	private WebElement repeatpassword;
	
	@FindBy(xpath = "//input[@name=\"account.listOption\"]")
	private WebElement checkbox;
	
	@FindBy(xpath = "//input[@name=\"newAccount\"]")
	private WebElement savebutton;
	
	
	
	//initialization
	public Resgistration_class(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	//utilization
	public void registerpage_scenario_search() throws InterruptedException
	{
		searchBox.sendKeys("Fish");
		Thread.sleep(5000);
		
	}
	public void registerpage_scenario_clicktosearchbutton() throws InterruptedException 
	{
		searchbutton.click();
		Thread.sleep(5000);
		System.out.println("click to search button is successfull");
	}
	public void backtosite() throws InterruptedException
	{
		driver.navigate().back();
		Thread.sleep(5000);
	}
	public void registerpage_scenario_clicktosignin() throws InterruptedException 
	{
		signin.click();
		Thread.sleep(5000);
		System.out.println("user should redirected to another webpage");
	}
	public void validateURL()
	{
	  String actualurl="https://petstore.octoperf.com/action";
	  String expectedurl=driver.getCurrentUrl();
	  if (expectedurl.equals(actualurl))
	  {
		System.out.println("The url is validated correct and succesfully");
      }
	  else 
	  {
		System.out.println("url is not validated correct and unsuccessfully");
	  }
	}
	  public void validateTitle()
	  {
	  String actualtitle="JPetStore Demo";
	  String expectetitle=driver.getTitle();
	  if (expectetitle.equals(actualtitle))
	  {
		System.out.println("The title is validated correct and succesfully");
      }
	  else {
		System.out.println("title is not validated correct and unsuccessfully");
	  }
	  }
	  
	  public void linktoregister()
	  {
//		  Registerlink.click();
//		  try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//			System.out.println("user is redirected to anothe rpage: Registration web page");
//		}
		  System.out.println("Hello selenium");
	  }
	  public void userInfo() throws InterruptedException
	  {
		  userID.clear();
		  userID.sendKeys("Demoselenium");
		  Thread.sleep(3000);
		  newpassword.clear();
		  Thread.sleep(3000);
		  newpassword.sendKeys("Demoselenium@938");
		  Thread.sleep(3000);
		  repeatpassword.clear();
		  Thread.sleep(3000);
		  repeatpassword.sendKeys("Demoselenium@938");
		  Thread.sleep(3000);
		  checkbox.click();
		  Thread.sleep(3000);
		  savebutton.click();
	  }
	}
