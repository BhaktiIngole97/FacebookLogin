package Automation.facebook_login;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class action_class {
	
	public WebDriver driver;
	@BeforeMethod
	public void Actionclass() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		
	}
	@Test
	
	public void MoveToElement() throws InterruptedException {
		
		driver.get("https://jqueryui.com/droppable");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		WebElement srcFile =driver.findElement(By.id("draggable"));
		WebElement DownldFile =driver.findElement(By.id("drag here"));
	    Actions action = new Actions(driver);
	    action.moveToElement(srcFile).click().perform();
	    action.release(DownldFile).perform();
	}
	
	@Test
	public void contextClick() throws InterruptedException {
     driver.get("https://www.facebook.com/");
		
	 driver.manage().window().maximize();
	 Thread.sleep(2000);
	 WebElement phoneno = driver.findElement(By.xpath("//input[@id='email']"));
	 Actions actions = new Actions(driver);
	 actions.contextClick(phoneno).perform();
	 Thread.sleep(2000);
	 driver.close();
	}
	@Test
	
	public void DragAndDrop() throws InterruptedException {
    driver.get("https://jqueryui.com/droppable");
    driver.manage().window().maximize();
	Thread.sleep(2000);
	WebElement src = driver.findElement(By.cssSelector("#draggable"));
    Actions actions = new Actions(driver);
    Thread.sleep(2000);
    driver.close();
	}
	@Test
	
	public void google() {
	driver.get("https://WWW.google.com/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	WebElement search = driver.findElement(By.name("N"));
	Actions actions = new Actions(driver);
	actions.sendKeys("Automation").perform();
	Thread.sleep(2000);
	Action.keyDown(Keys.CONTROL).sendKeys("A").perform();
	Action.keyUp(Keys.CONTROL).perform();
	Thread.sleep(2000);
	Action.keyDown1(Keys.CONTROL).sendKeys("B").perform();
	Action.keyUp(Keys.CONTROL).perform();
	Thread.sleep(2000);
	Action.keyDown(Keys.CONTROL).sendKeys("T").perform();
	Action.keyUp(Keys.CONTROL).perform();
	Thread.sleep(2000);
	Action.sendKeys(Keys.ENTER).perform();
	Thread.sleep(2000);
	driver.close();
	}
	
	public void click() {
	driver.get("https://www.w3schools.com//");
	Actions action = new Actions(driver); 
	driver.manage().window().maximize();
	Thread.sleep(2000);
	WebElement src = driver.findElement(By.linkText("Learn to code"));
	Actions actions = new Actions(driver);
	actions.click().perform();
	Thread.sleep(2000);
    driver.close();
	}
	
	@Test
	public void doubleclick() {
		driver.get("https://www.javatpoint.com/primary-key-vs-foreign-key");
		Actions action = new Actions(driver); 
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement src = driver.findElement(By.linkText("sql"));
		Actions actions = new Actions(driver);
		actions.doubleClick().perform();
		Thread.sleep(2000);
	    driver.close();
		}

	
	
	
	
	
	
	
	
	
	
	
		
	}
	
	
	
	
	
	
	
    
		
	}
	



