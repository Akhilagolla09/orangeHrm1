package Testcases;

import org.testng.annotations.Test;

import Testcases.driver;
import Webpages.Homepage;

public class Hometest extends driver {

	@Test
	public void HomePage_test() throws InterruptedException {

		Homepage obj = new Homepage(driver);

 /*   	obj.Loginpage();
		obj.admin();
		obj.usermanagement();
		obj.user();
		obj.Add();
		obj.Add_User();
		obj.searchuser();
		obj.LOGOUT();            */
		
		
		
		obj.Loginpage1();
		obj.admin1();
		obj.job();
		obj.jobtitle();
		obj.paygrades();
		obj.Emp_status();
		obj.jobcategories();
		obj.workshifts();           
    	
		
    	obj.PIM();                
		
	    obj.LEAVE(); 
		
		obj.TIME();
		
		
		
	}
}
