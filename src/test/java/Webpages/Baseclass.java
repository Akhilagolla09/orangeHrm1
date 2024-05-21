package Webpages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Testcases.driver;

public class Baseclass extends driver{

	
	public void sendkeysint(WebElement m,String s) {
		m.sendKeys(s);
	}

	public void getText(WebElement e1) {
		String s=e1.getText();
		System.out.println(s);
	}
	
	public void clickMethod(WebElement m) {
		m.click();
	}

	public void clearMethod(WebElement m) {
		m.clear();
	}
	
	
	
}
