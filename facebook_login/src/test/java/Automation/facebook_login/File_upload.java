package Automation.facebook_login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class File_upload {
	public WebDriver driver;
	public void file_upload() {
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
			
		}
	@Test
	public void FileUpload() throws InterruptedException {
	driver.get("http://nervgh.github.io/pages/angular-file-upload/examples/simple/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//input[@multiple='']")).sendKeys("");
	Thread.sleep(2000);
    driver.findElement(By.xpath("//button[@ng-click=\"item.upload()\"]")).click();
	Thread.sleep(2000);
	driver.close();	
	}
	
	@Test
	public void AutoIT() throws InterruptedException {
	driver.get("https://smallpdf.com/pdf-converter");
	driver.manage().window().maximize();
	driver.findElement(By.linkText("Select PDF file")).click();
	Thread.sleep(2000);
	Runtime.getRuntime().exec("C:\\Program Files (x86)\\AutoIt3\\File_upload\\File upload");
	driver.close();
	}
	
}
	
	
					
	
	
	
	
	

}
