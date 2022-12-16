package Automation.facebook_login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SignUp {
	public WebDriver driver;
	@Test
	public void Sign_Up() {
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("ingolebhakti@gmail.com");
		
		WebElement password=driver.findElement(By.name("pass"));
		password.sendKeys("bhakti123");
		password.clear();
		
		WebElement LogIn=driver.findElement(By.id("loginbutton"));
		LogIn.click();
		
		WebElement Fpwd=driver.findElement(By.linkText("Forgotten password?"));
		Fpwd.click();
		
		WebElement forpwd=driver.findElement(By.partialLinkText("Forgotten password?"));
		forpwd.click();
		
		WebElement emailId=driver.findElement(By.xpath("//input[@name='email']"));
		emailId.sendKeys("ingolebhakti@gmail.com");
		
		WebElement loginpage=driver.findElement(By.xpath("//a[@text='Create New Account/']"));
		loginpage.click();
		
		WebElement signuppage=driver.findElement(By.xpath("//a[@contains='Create New Account/']"));
		signuppage.click();
		
		WebElement signup=driver.findElement(By.xpath("//a[text()='Create New Account']"));
		signup.click();
		
		WebElement login=driver.findElement(By.xpath("//a[contains(text(),'Create New Account']"));
		login.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	

}
}
