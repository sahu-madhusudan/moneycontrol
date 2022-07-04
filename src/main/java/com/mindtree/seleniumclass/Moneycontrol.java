package com.mindtree.seleniumclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Moneycontrol {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://Users//mindc1may361//eclipse-workspace//Project1//drivers//chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get(" https://www.moneycontrol.com/");
		
		
		driver.findElement(By.xpath("//button[@id='wzrk-cancel']")).click();

		
		WebElement ele=driver.findElement(By.xpath("//a[@title='Personal Finance']"));
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(ele));
		
		
		Actions action=new Actions(driver);
		action.moveToElement(ele).perform();
		
		driver.findElement(By.xpath("//a[@title='Income Tax Calculator']")).click();
		
		
		driver.findElement(By.xpath("//label[contains(text(),' With exemption')]"));
		driver.findElement(By.xpath("//label[contains(text(),' Without exemption')]"));
		driver.findElement(By.xpath("//input[@id='age']")).sendKeys("23");
		driver.findElement(By.xpath("//div[@class='inputrange']")).click();
		driver.findElement(By.xpath("//option[contains(text(),' Stay in Non Metro city')]"));
		driver.findElement(By.xpath("//a[@class='btn_common nextfrm MR10 calculateTax']")).click();
		driver.findElement(By.xpath("//input[@id='annual_salary']")).sendKeys("15000");
		driver.findElement(By.xpath("//input[@id='other_interest']")).sendKeys("15000");
		driver.findElement(By.xpath("//a[@class='btn_common nextfrm MR10 calculateTax']")).click();
		driver.findElement(By.xpath("//input[@id='tax_saving_investment']")).sendKeys("2000");
		driver.findElement(By.xpath("//a[@class='btn_common nextfrm MR10 calculateTax']")).click();
		
		System.out.println(findElement(By.xpath("//span[@id='display_tax']")).getText());
		
		
	
		
		}

	private static WebElement findElement(By xpath) {
		// TODO Auto-generated method stub
		return null;
	}

}
