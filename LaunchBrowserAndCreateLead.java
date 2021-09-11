package week2.day1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowserAndCreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 2. Enter UserName and Password
		 * 
		 * 3. Click on Login Button
		 * 
		 * 4. Click on CRM/SFA Link
		 * 
		 * 5. Click on Leads Button
		 * 
		 * 6. Click on create Lead Button
		 * 
		 * 7. Enter all the text fields in CreateLead page
		 ** 
		 * Note 1. Donot work on Parent Account Field 2.Enter the Birthdate using
		 * SendKeys
		 * 
		 * 8. Enter all the text fields in contact information
		 * 
		 * 9. Enter all the text fields in primary address
		 * 
		 * 10. Get the Firstname and print it
		 * 
		 * 11. Click on create Lead Button
		 * 
		 * 12. Get and Verify the Title of the resulting Page(View Lead)
		 */
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		String title = driver.getTitle();
		System.out.println("the title of url is " +title);
		//driver.close();
		System.out.println("The program ends");
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("demosalesmanager");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("crmsfa");
		WebElement login = driver.findElement(By.className("decorativeSubmit"));
		login.click();
		String title2 = driver.getTitle();
		System.out.println("The tile after login is "+title2);
		WebElement crmlink= driver.findElement(By.linkText("CRM/SFA"));
		crmlink.click();
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("HTC Global Services");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Deepikaa");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Senthilnathan");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Sai");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Naruto");
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("09/15/21");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Testing the webpage");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Dept1");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("100000");
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("10000");
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("2345");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("This role helps to guide other team members and make the project to success");
		driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("FBN");
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("Note the important points here");
		System.out.println("The Contact informtion starts");
		WebElement phoneCountryCode = driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode"));
		phoneCountryCode.clear();
		phoneCountryCode.sendKeys("123");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9876546789");
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("2345");
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("3456");
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Ashif");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("deepikaa95senthilnatahn@gmail.com");
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("http://leaftaps.com/opentaps/control/main");
		System.out.println("The Primary Address starts");
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Sai");
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("mala");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("2771 Deer Haven Drive");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Street 456");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Greenville");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("456789");
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("4567");
		WebElement createLeadbtn = driver.findElement(By.className("smallSubmit"));
		createLeadbtn.click();
		String Present = driver.getTitle();
		System.out.println(Present);
		System.out.println("Created a New Lead");
		

	}

}
