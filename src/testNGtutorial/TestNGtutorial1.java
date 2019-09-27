package testNGtutorial;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGtutorial1 {
	
	@BeforeSuite
	public void setUp(){
		System.out.println("Set up system property for Chrome");
	}
	
	@BeforeClass
	public void launchBrowser() {
		System.out.println("Launch chrome browser");
	}
	
	@BeforeTest
	public void login() {
		System.out.println("Log into google.com");
	}
	
	@BeforeMethod
	public void enterUrl() {
		System.out.println("Enter url");
	}
	
	@Test
	public void googleTitle() {
		System.out.println("Get title of google homepage");
	}
	
	@AfterMethod
	public void logout() {
		System.out.println("Log out from google.com");
	}
	
	@AfterTest
	public void deletecookies() {
		System.out.println("Delete all browser cookies");
	}
	
	@AfterClass
	public void closeBrowser() {
		System.out.println("Close the browser");
	}
	
	@AfterSuite
	public void generateReport() {
		System.out.println("Generate test report");
	}

}
