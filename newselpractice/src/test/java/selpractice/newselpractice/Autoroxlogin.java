package selpractice.newselpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Autoroxlogin {
	
	@Test()
	public void axlogin() {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://app.autorox.co");
		
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='userName_login']")).sendKeys("csteam");
		driver.findElement(By.xpath("//input[@id='password_login']")).sendKeys("Admin@12345");
		driver.findElement(By.xpath("//button[normalize-space()='Continue']")).click();
		driver.findElement(By.xpath("//img[@id='sideLogo_img']")).click();
		driver.findElement(By.xpath("//span[@class='sideBarTitle'][normalize-space()='Job Cards']")).click();
		
	}

}
