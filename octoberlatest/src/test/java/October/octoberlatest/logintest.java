package October.octoberlatest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class logintest {
	@Test()
	public void loginTest() {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.autorox.co");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='userName_login']")).sendKeys("tester");
		driver.findElement(By.xpath("//input[@id='password_login']")).sendKeys("Admin@123");
		driver.findElement(By.xpath("//button[normalize-space()='Continue']")).click();
		 	  
		
	}
}
