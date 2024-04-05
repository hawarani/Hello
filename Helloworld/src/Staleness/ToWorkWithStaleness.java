package Staleness;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWithStaleness {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://demowebshop.tricentis.com/login");
	driver.findElement(By.id("Email")).sendKeys("selenium4444@gmail.com");
	driver.findElement(By.id("Password")).sendKeys("xyzabc");
	WebElement login_btn = driver.findElement(By.cssSelector("input[value='Log in']"));
	login_btn.click();
	driver.get("https://demowebshop.tricentis.com/login");
	driver.findElement(By.id("Email")).sendKeys("selenium444@gmail.com");
	driver.findElement(By.id("Password")).sendKeys("xyzab");
	login_btn.click();
	Thread.sleep(2000);
	driver.quit();
}
}
