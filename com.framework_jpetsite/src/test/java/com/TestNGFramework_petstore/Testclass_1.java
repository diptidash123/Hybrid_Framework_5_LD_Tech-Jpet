package com.TestNGFramework_petstore;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POM_REGISTER.Resgistration_class;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Testclass_1 extends Resgistration_class
{

	public Testclass_1(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.navigate().to("https://petstore.octoperf.com/actions/Catalog.action");
		
		Resgistration_class p=new Resgistration_class(driver);
		p.registerpage_scenario_search();
		p.registerpage_scenario_clicktosearchbutton();
		p.backtosite();
		p.registerpage_scenario_clicktosignin();
		p.validateURL();
		p.validateTitle();
		p.linktoregister();
		p.userInfo();
//		driver.close();
		
		

	}

}
