package Novem;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


public class NayaTest {
	WebDriver driver;
	
	
	@Test()
	public void nayaTesting() {
		
		 driver = new ChromeDriver();
		
		driver.get("https://app.autorox.co");
		driver.manage().window().maximize();
		
		
	  WebElement username = driver.findElement(By.xpath("//input[@id='userName_login']"));
	  WebElement Pswd = driver.findElement(By.xpath("//input[@id='password_login']"));
	 WebElement submit = driver.findElement(By.xpath("//button[normalize-space()='Continue']"));
	 
	 username.sendKeys("caraagytrial");
	 Pswd.sendKeys("$0z8VlBj");
	 submit.submit();
	 
	 System.out.println("The current page is : "+ driver.getTitle());
	 
	  WebElement Menu = driver.findElement(By.xpath("//img[@id='sideLogo_img']"));
	WebElement Parts = driver.findElement(By.xpath("//li[@id='partsOpen']//a[@href='#!']"));
	WebElement Stock = driver.findElement(By.xpath("//li[@id='partsOption3']//a"));
    
	Actions ac = new Actions(driver);
	ac.moveToElement(Menu).click().build().perform();
	ac.moveToElement(Parts).click().build().perform();
	ac.moveToElement(Stock).click().build().perform();
	
	 
		
	} 

}
