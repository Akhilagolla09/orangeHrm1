package Testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class driver {

  
	static WebDriver driver;
	
	
	@BeforeSuite
	public void openBrowser() {
		
//		EdgeOptions options = new EdgeOptions();
//		options.addArguments("--remote-allow-origins=*");
//		 driver = new EdgeDriver();
		
//		System.setProperty("webdriver.edge.driver","C:\\Users\\GOAKHILA\\eclipse-workspace\\orangeHrm1\\msedgedriver.exe");
	
		WebDriverManager.chromedriver().setup();
		driver = new EdgeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}
	@AfterSuite
	public void closeBrowser() {
		if(driver != null) {
			driver.quit();
		}
	}		
}
