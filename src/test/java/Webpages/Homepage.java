package Webpages;


import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homepage extends Baseclass {

	WebDriver driver;

	public Homepage(WebDriver driver) {
		this.driver = driver;
	}
	
	By username = By.xpath("//input[@name='username']");
	By password= By.xpath("//input[@name='password']");
	By login = By.xpath("//button[@type='submit']");
	By admin = By.xpath("//a[@href='/web/index.php/admin/viewAdminModule']");
	By usermanagement =By.xpath("//span[@class='oxd-topbar-body-nav-tab-item']");
	By user = By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[1]/ul/li/a");
	
//ADD
	By Add = By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div[2]/div[1]/button");
	By userrole = By.xpath("(//div[@class='oxd-select-text-input'])[1]");
	By role = By.xpath("(//div[@role='listbox']//child::div)[2]");
	By employeename =By.xpath("//input[@placeholder='Type for hints...']");
	By profilename = By.xpath("//p[@class='oxd-userdropdown-name']");
	By status = By.xpath("(//div[@class='oxd-select-text-input'])[2]");
	By role2 = By.xpath("(//div[@role='listbox']//child::div)[2]");
	By Username = By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]");
	By Password = By.xpath("(//input[@type='password'])[1]");
	By confirmpassword = By.xpath("(//input[@type='password'])[2]");
	By save =By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']");
//search user
	By username1=By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]");
	By userrole1=By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow']");
	By role3 =By.xpath("(//div[@role='listbox']//child::div)[2]");
	By employeename1 =By.xpath("//input[@placeholder='Type for hints...']");
	By status1=By.xpath("(//div[@class='oxd-select-text-input'])[2]");
	By role4 = By.xpath("(//div[@role='listbox']//child::div)[2]");
	By search=By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']");		
//logout
	By profile =By.xpath("//p[@class='oxd-userdropdown-name']");
	By logout =By.xpath("(//a[@role='menuitem'])[4]");                    
	
	
	By username11 = By.xpath("//input[@name='username']");
	By password1= By.xpath("//input[@name='password']");
	By login1 = By.xpath("//button[@type='submit']");
	By admin1 = By.xpath("//a[@href='/web/index.php/admin/viewAdminModule']");    
//jobtitle
	By job =By.xpath("(//span[@class='oxd-topbar-body-nav-tab-item'])[2]");
    By jobtitle=By.xpath("(//a[@role=\"menuitem\"])[1]");
	By add =By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']");
	By jobtitle1 = By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]");
	By jobdiscription =By.xpath("(//textarea[@class='oxd-textarea oxd-textarea--active oxd-textarea--resize-vertical'])[1]");
	By jobspecification =By.xpath("//div[@class='oxd-file-button']");
	By save1 = By.xpath("//button[@type='submit']");
//paygrades
	By paygrades = By.xpath("(//a[@role='menuitem'])[2]");
	By addpaygrades = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']");
	By payName = By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]");
	By paysave =By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']");
//Employement status
	By employment_status = By.xpath("(//a[@role='menuitem'])[3]");
	By add_empstatus =By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']");
	By empstatus_name=By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]");
	By save_empstatus = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']");
//jobcategories	
	By job_categories= By.xpath("(//a[@role='menuitem'])[4]");
	By jobcatg_add   = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']");
	By jobcatg_name = By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]");
    By save_jobcatg = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']");
    
//workshifts 
	By workshifts =By.xpath("(//a[@role='menuitem'])[5]");
	By add_workshift = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']");
	By name_workshift = By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]");
	
	By from_time =By.xpath("(//i[@class='oxd-icon bi-clock oxd-time-input--clock'])[1]");
	By hour =By.xpath("(//input[@class='oxd-input oxd-input--active oxd-time-hour-input-text'])[1]");
	By minutes =By.xpath("(//input[@class='oxd-input oxd-input--active oxd-time-minute-input-text'])[1]");
	By Am = By.xpath("(//div[@class='oxd-time-period-label'])[1]");
	
	By to_time =By.xpath("(//i[@class='oxd-icon bi-clock oxd-time-input--clock'])[2]");
	By hour1 = By.xpath("//input[@class='oxd-input oxd-input--active oxd-time-hour-input-text']");
	By minutes1= By.xpath("//input[@class='oxd-input oxd-input--active oxd-time-minute-input-text']");
    By Pm	= By.xpath("(//div[@class='oxd-time-period-label'])[2]");
//    By assignedemployees = By.xpath("//input[@placeholder='Type for hints...']");
    By saveW =By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']");
    
    By delete =By.xpath("(//i[@class='oxd-icon bi-trash'])[1]");
	By popup =By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin']");
	

	
//PIM
	By pim = By.xpath("(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[2]");
	By Employeelist = By.xpath("(//a[@class='oxd-topbar-body-nav-tab-item'])[1]");
	By EmpList_add= By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']");
//	By firstname = By.xpath("//input[@class='oxd-input oxd-input--active orangehrm-firstname']");
	By firstname = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[1]/div/div/div[2]/div[1]/div[2]/input");
	By middlename = By.xpath("//input[@class='oxd-input oxd-input--active orangehrm-middlename']");
	By lastname = By.xpath("//input[@class='oxd-input oxd-input--active orangehrm-lastname']");
	By empsave = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']");
	By nickname =By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]");
	
	By nationality =By.xpath("(//div[@clear='false'])[1]");
	By nation1 =By.xpath("(//div[@role='listbox']//child::div)[92]");
	By martial = By.xpath("(//div[@clear='false'])[2]");
	By Mstatus = By.xpath("(//div[@role='listbox']//child::div)[2]");
	By DOB =By.xpath("(//input[@class='oxd-input oxd-input--active'])[9]");
	By gender = By.xpath("(//span[@class='oxd-radio-input oxd-radio-input--active --label-right oxd-radio-input'])[2]");
	By elsave = By.xpath("(//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space'])[1]");
	
	By nameemp = By.xpath("(//input[@placeholder='Type for hints...'])[1]");
	By empID = By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]");
	By supervisor = By.xpath("(//input[@placeholder='Type for hints...'])[2]");
	By reset = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--ghost']");
	By checkbox = By.xpath("(//i[@class='oxd-icon bi-check oxd-checkbox-input-icon'])[3]");
	By delete1 = By.xpath("(//i[@class='oxd-icon bi-trash'])[2]");
	By cancel = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--text orangehrm-button-margin']");
	
//Leave
	By leave = By.xpath("(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[3]");
	By assignleave = By.xpath("(//a[@class='oxd-topbar-body-nav-tab-item'])[4]");
	By Empname =By.xpath("//input[@placeholder='Type for hints...']");
	By proname = By.xpath("//p[@class='oxd-userdropdown-name']");
	By leavetype = By.xpath("//div[@class='oxd-select-text-input']");
	By leavesselect = By.xpath("(//div[@role='listbox']//child::div)[5]");
	By fromdate = By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]");
	By fromdate1 = By.xpath("(//div[@class='oxd-calendar-dates-grid']//div)[position()=1]");
	By todate = By.xpath("(//input[@placeholder='yyyy-mm-dd'])[2]");
	By todate2 = By.xpath("(//div[@class='oxd-calendar-dates-grid']//div)[position()=6]");
	By comments = By.xpath("//textarea[@class='oxd-textarea oxd-textarea--active oxd-textarea--resize-vertical']");
	By Assign = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']");
	By ok = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-button-margin']");
	
//Time
	By time = By.xpath("(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[4]");
	By timesheet =By.xpath("(//span[@class='oxd-topbar-body-nav-tab-item'])[1]");
	By emptimesheet = By.xpath("(//a[@class='oxd-topbar-body-nav-tab-link'])[2]");
	By ename = By.xpath("//input[@placeholder='Type for hints...']");
	By NameP = By.xpath("//div[@class='oxd-autocomplete-option']");
//	By enamee = By.xpath("//input[@placeholder='Type for hints...']");
	By view = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']");
	By edit = By.xpath("(//button[@type='button'])[5]");
	By project = By.xpath("//input[@placeholder='Type for hints...']");
	By Activity = By.xpath("//div[@class='oxd-select-text-input']");
	By select = By.xpath("(//div[@role='listbox']//child::div)[6]");
	By day1 = By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]");
	By day2 = By.xpath("(//input[@class='oxd-input oxd-input--active'])[3]");
	By day3 = By.xpath("(//input[@class='oxd-input oxd-input--active'])[4]");
	By day4 = By.xpath("(//input[@class='oxd-input oxd-input--active'])[5]");
	By day5 = By.xpath("(//input[@class='oxd-input oxd-input--active'])[6]");
	By savetimesheet = By.xpath("//button[@type='submit']");
	
	

	
	
//LOGIN PAGE 
	public void Loginpage() throws InterruptedException {
//		 driver.switchTo().window(	
//			String parent_win = driver.getWindowHandle();     //parent win
//			
//			//store mutliple windows in set
//			
//			Set<String> set = driver.getWindowHandles();     
//			
//			//iterates through set of items (windows)
//			
//			Iterator<String> I = set.iterator();
//			
//		   while(I.hasNext()){
//				
//			   String child_win =I.next();
//			   
//			   if(!(parent_win.equals(child_win))) {
//				   
//				   driver.switchTo().window(child_win);
//			   }
//			   
//			})
		WebElement el = driver.findElement(username);
		sendkeysint(el, "Admin");
		Thread.sleep(2000);
		WebElement e2 = driver.findElement(password);
		sendkeysint(e2, "admin123");
		Thread.sleep(2000);
	
		WebElement ele = driver.findElement(login);
		clickMethod(ele);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}

//ADMIN
	public void admin() throws InterruptedException {
		WebElement ele1 = driver.findElement(admin);
		clickMethod(ele1);
		Thread.sleep(4000);
	}
	
	public void usermanagement() throws InterruptedException {
		WebElement ele2 = driver.findElement(usermanagement);
		clickMethod(ele2);
		Thread.sleep(2000);
	}
	
	public void user() throws InterruptedException {
		WebElement ele3 = driver.findElement(user);
		clickMethod(ele3);
		Thread.sleep(2000);
	}
	
//ADD USER
	public void Add() throws InterruptedException {
		WebElement ele4= driver.findElement(Add);
		clickMethod(ele4);
		Thread.sleep(2000);
	}
	
	public void Add_User() throws InterruptedException {
		WebElement ele5= driver.findElement(userrole);
		clickMethod(ele5);
		WebElement select = driver.findElement(role);
		clickMethod(select);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		
		WebElement ele6= driver.findElement(employeename);
		WebElement element= driver.findElement(profilename);
	    String s =element.getText();
		sendkeysint(ele6, s);
		Thread.sleep(3000);
	
		WebElement ele7= driver.findElement(status);    
		clickMethod(ele7);  
		WebElement select1 = driver.findElement(role2);
		clickMethod(select1);
		
		WebElement ele8= driver.findElement(Username);
		clickMethod(ele8);
		sendkeysint(ele8, "AkhilaGolla");
		Thread.sleep(3000);
		
		WebElement ele9= driver.findElement(Password);
		clickMethod(ele9);
		sendkeysint(ele9, "Akhila12345#");
		Thread.sleep(2000);
		
		WebElement ele10= driver.findElement(confirmpassword);
		clickMethod(ele10);
		sendkeysint(ele10, "Akhila12345#");
		Thread.sleep(4000);
		
		WebElement ele11 = driver.findElement(save);
		clickMethod(ele11);
		Thread.sleep(2000);	
	}
	
//SEARCH
	public void searchuser() throws InterruptedException {
		
		WebElement usermang = driver.findElement(usermanagement);
		clickMethod(usermang);
		Thread.sleep(1000);
		
		WebElement User = driver.findElement(user);
		clickMethod(User);
		Thread.sleep(1000);
		
		
		WebElement ele12=driver.findElement(username1);
		clickMethod(ele12);
		sendkeysint(ele12, "AkhilaGolla");
		Thread.sleep(2000);
		
		WebElement ele13= driver.findElement(userrole1);
		clickMethod(ele13);
		WebElement select3 = driver.findElement(role3);
		clickMethod(select3);
		Thread.sleep(2000);
		
		WebElement ele14= driver.findElement(employeename1);
		clickMethod(ele14);
		sendkeysint(ele14, "Paul Collings");
		Thread.sleep(2000);
		
		WebElement ele15= driver.findElement(status1);    
		clickMethod(ele15);
		WebElement select4 = driver.findElement(role4);
		clickMethod(select4);
	
		WebElement ele16 = driver.findElement(search);
		clickMethod(ele16);
		Thread.sleep(2000);
	}    
	
//LOGOUT
	public void LOGOUT() throws InterruptedException {
		WebElement ele17 = driver.findElement(profile);
		clickMethod(ele17);
		Thread.sleep(2000);
		
		WebElement ele18 = driver.findElement(logout);
		clickMethod(ele18);
		Thread.sleep(2000);
	}                                                                  
	

//LOGIN PAGE 
		public void Loginpage1()  {
			WebElement el = driver.findElement(username11);
			sendkeysint(el, "Admin");
			
		
			WebElement e2 = driver.findElement(password1);
			sendkeysint(e2, "admin123");
		
		
			WebElement e3 = driver.findElement(login1);
			clickMethod(e3);
		}	
//admin
		public void admin1()  {
			WebElement e4 = driver.findElement(admin1);
			clickMethod(e4);
		
		}
//job
		public void job() {
			WebElement e5 = driver.findElement(job);
			clickMethod(e5);
			
			
			WebElement e6 = driver.findElement(jobtitle);
			clickMethod(e6);
			
			
			WebElement e7 = driver.findElement(add);
			clickMethod(e7);
			
		}
		
		public void jobtitle() {
			WebElement e8 = driver.findElement(jobtitle1);
			sendkeysint(e8, "SoftwareAnalyst1");
		
		
			WebElement e9 = driver.findElement(jobdiscription);
			sendkeysint(e9, "analyst gathers, interprets, and uses complex data to develop actionable steps");
			
			WebElement save = driver.findElement(save1);
			clickMethod(save);
			
		}
		
		public void paygrades()  {
			WebElement job1 = driver.findElement(job);
			clickMethod(job1);
			
			
			WebElement pay = driver.findElement(paygrades);
			clickMethod(pay);
			    
			
			WebElement add_pay = driver.findElement(addpaygrades);
			clickMethod(add_pay);
			
			
			WebElement name_pay = driver.findElement(payName);
			clickMethod(name_pay);
			sendkeysint(name_pay, "Gradexyzabc");
			
			
			WebElement save_pay = driver.findElement(paysave);
			clickMethod(save_pay);
			   	
		}
		
		public void Emp_status() {
			WebElement job2 = driver.findElement(job);
			clickMethod(job2);
			
			
			WebElement employstatus = driver.findElement(employment_status);
			clickMethod(employstatus);
			     
		
			WebElement add_employstatus = driver.findElement(add_empstatus);
			clickMethod(add_employstatus);
			                   
			
			WebElement name_empstatus = driver.findElement(empstatus_name);
			clickMethod(name_empstatus);
			sendkeysint(name_empstatus, "parttime job");
			
			
			WebElement employstatus_save = driver.findElement(save_empstatus);
			clickMethod(employstatus_save);
			
		}
		
		public void jobcategories() throws InterruptedException {
			WebElement job3 = driver.findElement(job);
			clickMethod(job3);
			Thread.sleep(2000);
			
			WebElement jobcateg = driver.findElement(job_categories);
			clickMethod(jobcateg);             
			Thread.sleep(2000);     
		
			WebElement jobcateg_add = driver.findElement(jobcatg_add);
			clickMethod(jobcateg_add);             
			Thread.sleep(2000);
			
			WebElement name_jobcatg = driver.findElement(jobcatg_name);
			clickMethod(name_jobcatg);
			sendkeysint(name_jobcatg, "Arts");
			Thread.sleep(2000);
			
			WebElement jobcatg_save = driver.findElement(save_jobcatg);
			clickMethod(jobcatg_save);
			Thread.sleep(2000); 
		}
	
		public void workshifts() throws InterruptedException {
			WebElement job4 = driver.findElement(job);
			clickMethod(job4);
			Thread.sleep(1000);
			
			WebElement workshift = driver.findElement(workshifts);
			clickMethod(workshift);
			Thread.sleep(1000);
			
			WebElement Addshift = driver.findElement(add_workshift);
			Thread.sleep(1000);
			clickMethod(Addshift);
			//Thread.sleep(1000);
			
			WebElement Addshiftname = driver.findElement(name_workshift);
			clickMethod(Addshiftname);
			sendkeysint(Addshiftname, "NightShift1");
			Thread.sleep(1000);	 
			
			WebElement From_Time = driver.findElement(from_time);
			clickMethod(From_Time);
			Thread.sleep(1000);
			
			WebElement Hour = driver.findElement(hour);
			clickMethod(Hour);
			clearMethod(Hour);
			sendkeysint(Hour, "09");
			Thread.sleep(1000);
			
			WebElement Minutes = driver.findElement(minutes);
			clickMethod(Minutes);
			clearMethod(Minutes);
			sendkeysint(Minutes,"30");
			Thread.sleep(1000);
			
			WebElement am = driver.findElement(Am);
			clickMethod(am); 
			Thread.sleep(1000);
			
			
			WebElement To_Time = driver.findElement(to_time);
			clickMethod(To_Time);
			Thread.sleep(1000);
			
			WebElement Hour1 = driver.findElement(hour1);
			clickMethod(Hour1);
			clearMethod(Hour1);
			sendkeysint(Hour1,"05");
			Thread.sleep(1000);
			
			WebElement Minutes1 = driver.findElement(minutes1);
			clickMethod(Minutes1);
			clearMethod(Minutes1);
			sendkeysint(Minutes1,"30");
			Thread.sleep(1000);
			
			WebElement pm = driver.findElement(Pm);
			clickMethod(pm); 
			Thread.sleep(1000);
			
/*			WebElement assignEmp = driver.findElement(assignedemployees);
			clickMethod(assignEmp);
     		sendkeysint(assignEmp,"Paul Collings");    */
			                      
			
			WebElement SaveShift = driver.findElement(saveW);
			clickMethod(SaveShift); 
			Thread.sleep(1000);
			
			WebElement del = driver.findElement(delete);
			clickMethod(del); 
			Thread.sleep(1000);
			
			WebElement yes_del = driver.findElement(popup);
			clickMethod(yes_del); 
			Thread.sleep(1000);
		}                                                                                                                      
		
		
//pim
	public void PIM() throws InterruptedException  {
		WebElement Pim = driver.findElement(pim);
		clickMethod(Pim);
		Thread.sleep(2000);
		
		WebElement Emp_List = driver.findElement(Employeelist);       
		clickMethod(Emp_List);
		Thread.sleep(1000);
		
		WebElement Emp_add = driver.findElement(EmpList_add);        
		clickMethod(Emp_add);
		Thread.sleep(1000);
		
		WebElement fname= driver.findElement(firstname);
		clickMethod(fname);
		sendkeysint(fname, "akhila");
		
		WebElement mname= driver.findElement(middlename);
		clickMethod(mname);
		sendkeysint(mname, "manju");
		
		WebElement lname= driver.findElement(lastname);
		clickMethod(lname);
		sendkeysint(lname, "golla");
		
		
		WebElement emplsave= driver.findElement(empsave);
		clickMethod(emplsave);
		Thread.sleep(5000);
		
		WebElement nick= driver.findElement(nickname);
		clickMethod(nick);
		sendkeysint(nick,"akhii");
		Thread.sleep(2000);
		
		WebElement Nationality= driver.findElement(nationality);
		clickMethod(Nationality);
		WebElement Nation= driver.findElement(nation1);
		clickMethod(Nation);
		Thread.sleep(4000);
		
		WebElement martial_status= driver.findElement(martial);
		clickMethod(martial_status);
		WebElement statusM= driver.findElement(Mstatus);
		clickMethod( statusM);
		Thread.sleep(2000);
		
		WebElement birthdate= driver.findElement(DOB);
		clickMethod(birthdate);
		sendkeysint(birthdate,"2023-12-12");
		Thread.sleep(2000);
		
		WebElement Gender= driver.findElement(gender);
		clickMethod(Gender);
		Thread.sleep(2000);
		
		WebElement El_save= driver.findElement(elsave);
		clickMethod(El_save);
		Thread.sleep(2000);
		
		WebElement Emp_List1 = driver.findElement(Employeelist);       
		clickMethod(Emp_List1);
		Thread.sleep(1000);
		
		
		WebElement nameEmp= driver.findElement(nameemp);
		clickMethod(nameEmp);
		sendkeysint(nameEmp,"Aaliyah Haq");
		Thread.sleep(2000);
		
		WebElement IDEmp= driver.findElement(empID);
		clickMethod(IDEmp);
		sendkeysint(IDEmp,"0038");
		Thread.sleep(2000);
	
		WebElement supr_name= driver.findElement(supervisor);
		clickMethod(supr_name);
		sendkeysint(supr_name,"Odis  Adalwin");
		
		WebElement Reset= driver.findElement(reset);
		clickMethod(Reset);
		Thread.sleep(2000);
		
		WebElement checkBox= driver.findElement(checkbox);
		clickMethod(checkBox);
		Thread.sleep(2000);
		
		WebElement Delete= driver.findElement(delete1);
		clickMethod(Delete);
		Thread.sleep(2000);
		
		WebElement cancel_button= driver.findElement(cancel);
		clickMethod(cancel_button);
		Thread.sleep(2000);
		
		WebElement Reset1= driver.findElement(reset);
		clickMethod(Reset1);
		Thread.sleep(2000);
	}
	
	public void LEAVE() throws InterruptedException  {
		WebElement Leave = driver.findElement(leave);
		clickMethod(Leave);
		Thread.sleep(2000);
		
		WebElement AssignLeave = driver.findElement(assignleave);
		clickMethod(AssignLeave);
		Thread.sleep(2000);
		
		WebElement Ename= driver.findElement(Empname);
		WebElement Pname= driver.findElement(proname);
	    String s =Pname.getText();
		sendkeysint(Ename, s);
		Thread.sleep(1000);
		
	
/*		WebElement Ename= driver.findElement(Empname);
		clickMethod(Ename);
		sendkeysint(Ename,"Jolie Koepp");
		Thread.sleep(2000);                    */
		
		WebElement leav3 = driver.findElement(leavetype);
		clickMethod(leav3);
 
		WebElement leav4 = driver.findElement(leavesselect);
		clickMethod(leav4);
 
		WebElement from2 = driver.findElement(fromdate);
		clickMethod(from2);
		sendkeysint(from2, "2023-12-11");
		WebElement from3 = driver.findElement(fromdate1);
		clickMethod(from3);
 
		WebElement to2 = driver.findElement(todate);
		clickMethod(to2);
		WebElement to3 = driver.findElement(todate2);
		clickMethod(to3);

		WebElement comment= driver.findElement(comments);
		sendkeysint(comment,"required leave");
		Thread.sleep(2000);
		
		WebElement assign= driver.findElement(Assign);
		clickMethod(assign);
		Thread.sleep(2000); 
		
		WebElement OKK= driver.findElement(ok);
		clickMethod(OKK);
		Thread.sleep(2000);
		
	}
	
	public void TIME() throws InterruptedException  {
		WebElement Time = driver.findElement(time);
		clickMethod(Time);
		Thread.sleep(2000);
		
		WebElement Timesheet = driver.findElement(timesheet);
		clickMethod(Timesheet);
		Thread.sleep(2000);
		
		WebElement empTimesheet = driver.findElement(emptimesheet);
		clickMethod(empTimesheet);
		Thread.sleep(3000);
		
		WebElement eName = driver.findElement(ename);
		sendkeysint(eName, "Peter Parker MJ");
		Thread.sleep(3000);
		WebElement nameP= driver.findElement(NameP);
		clickMethod(nameP);                                                             
		
		
/*		WebElement empname = driver.findElement(enamee);
		sendkeysint(empname, "Charlie Carter");
		Thread.sleep(3000);
		empname.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);   */
 
		WebElement vew = driver.findElement(view);
		clickMethod(vew);
 
		WebElement Edit = driver.findElement(edit);
		clickMethod(Edit);
 
		WebElement proj = driver.findElement(project);
		clickMethod(proj);
		sendkeysint(proj, "Apache Software");
		Thread.sleep(2000);
		proj.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
 
		WebElement 	Act = driver.findElement(Activity);
		clickMethod(Act);
		WebElement sel = driver.findElement(select);
		clickMethod(sel);
 
		WebElement Day1 = driver.findElement(day1);
		clickMethod(Day1);
		sendkeysint(Day1, "9");
 
		WebElement Day2 = driver.findElement(day2);
		clickMethod(Day2);
		sendkeysint(Day2, "9");
 
		WebElement Day3 = driver.findElement(day3);
		clickMethod(Day3);
		sendkeysint(Day3, "9");
 
		WebElement Day4 = driver.findElement(day4);
		clickMethod(Day4);
		sendkeysint(Day4, "9");
 
		WebElement Day5 = driver.findElement(day5);
		clickMethod(Day5);
		sendkeysint(Day5, "9");
 
		WebElement save1= driver.findElement(savetimesheet);
		clickMethod(save1);
 
		
	}
		

}
