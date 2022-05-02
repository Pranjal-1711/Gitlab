package Day1;
import org.openqa.selenium.chrome.ChromeDriver;



import org.openqa.selenium.*;
public class Selenium10 
{

	public static void main(String[] args)
	{

	System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\sid2k\\\\Desktop\\\\chromedriver_win32\\\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();

	driver.get("https://demo.guru99.com/test/facebook.html");
	WebElement email=driver.findElement(By.id("email"));
	WebElement password=driver.findElement(By.name("pass"));
	System.out.println("email id and password found ");
	
	email.sendKeys("singhpranjal179@gmail.com");
	password.sendKeys("12345");
	email.clear();
	password.clear();
	System.out.println("email and password are clear");
	

	WebElement c=driver.findElement(By.id("persist_box"));
	c.click();
	if(c.isSelected())
		System.out.println("Checkbox is toggeled on");
	else
		System.out.println("Checkbox is toggeled off");
	c.click();
	if(!c.isSelected())
		System.out.println("Checkbox is toggeled off");
	
	WebElement submit=driver.findElement(By.id("u_0_b"));
	System.out.println("Login Button Found");
	submit.click();
	System.out.println("Login Successful");

	
	 driver.quit();
	}} 

	