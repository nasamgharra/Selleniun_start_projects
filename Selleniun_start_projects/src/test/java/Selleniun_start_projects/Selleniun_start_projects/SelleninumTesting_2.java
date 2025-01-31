package Selleniun_start_projects.Selleniun_start_projects;

import static org.junit.Assert.assertEquals;


import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class SelleninumTesting_2 {
	
	static WebDriver  browser;
	 
	 @Before
	  public void setup() {
		 
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\user\\Desktop\\geckodriver.exe");

	        
	        FirefoxOptions options = new FirefoxOptions();
	        options.setBinary("C:\\Users\\user\\AppData\\Local\\Mozilla Firefox\\firefox.exe");  
	       
	        browser = new FirefoxDriver(options);
	        browser.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	        browser.get("https://testpages.eviltester.com/styled/apps/7charval/simple7charvalidation.html");
	    }

		
	
	
	 @Test
	 public void TestCase_1() {
	     WebElement textBox = browser.findElement(By.name("characters"));
	     textBox.sendKeys("1236547");
	     String currentPage = browser.getCurrentUrl();
	     browser.findElement(By.name("validate")).click();
	     String newPage = browser.getCurrentUrl();
	     assertEquals(currentPage, newPage);
	 }

	 @Test
	 public void TestCase_2() {
	     WebElement textBox = browser.findElement(By.name("characters"));
	     textBox.sendKeys("Bc1@#");
	     String currentPage = browser.getCurrentUrl();
	     browser.findElement(By.name("validate")).click();
	     String newPage = browser.getCurrentUrl();
	     assertEquals(currentPage, newPage);
	 }

	 @Test
	 public void TestCase_3() {
	     WebElement textBox = browser.findElement(By.name("characters"));
	     textBox.sendKeys("cfv45");
	     String currentPage = browser.getCurrentUrl();
	     browser.findElement(By.name("validate")).click();
	     String newPage = browser.getCurrentUrl();
	     assertEquals(currentPage, newPage);
	 }

	 @Test
	 public void TestCase_4() {
	     WebElement textBox = browser.findElement(By.name("characters"));
	     textBox.sendKeys("SDR324#");
	     String currentPage = browser.getCurrentUrl();
	     browser.findElement(By.name("validate")).click();
	     String newPage = browser.getCurrentUrl();
	     assertEquals(currentPage, newPage);
	 }

	 @Test
	 public void TestCase_5() {
	     WebElement textBox = browser.findElement(By.name("characters"));
	     textBox.sendKeys("Sdr324#");
	     String currentPage = browser.getCurrentUrl();
	     browser.findElement(By.name("validate")).click();
	     String newPage = browser.getCurrentUrl();
	     assertEquals(currentPage, newPage);
	 }

	 @Test
	 public void TestCase_6() {
	     WebElement textBox = browser.findElement(By.name("characters"));
	     textBox.sendKeys("*45*RE");
	     String currentPage = browser.getCurrentUrl();
	     browser.findElement(By.name("validate")).click();
	     String newPage = browser.getCurrentUrl();
	     assertEquals(currentPage, newPage);
	 }

	 @Test
	 public void TestCase_7() {
	     WebElement textBox = browser.findElement(By.name("characters"));
	     textBox.sendKeys("ASDF435");
	     String currentPage = browser.getCurrentUrl();
	     browser.findElement(By.name("validate")).click();
	     String newPage = browser.getCurrentUrl();
	     assertEquals(currentPage, newPage);
	 }

	 @Test
	 public void TestCase_8() {
	     WebElement textBox = browser.findElement(By.name("characters"));
	     textBox.sendKeys("ACE$ert");
	     String currentPage = browser.getCurrentUrl();
	     browser.findElement(By.name("validate")).click();
	     String newPage = browser.getCurrentUrl();
	     assertEquals(currentPage, newPage);
	 }

	 @Test
	 public void TestCase_9() {
	     WebElement textBox = browser.findElement(By.name("characters"));
	     textBox.sendKeys("S34g6^^");
	     String currentPage = browser.getCurrentUrl();
	     browser.findElement(By.name("validate")).click();
	     String newPage = browser.getCurrentUrl();
	     assertEquals(currentPage, newPage);
	 }

	 @Test
	 public void TestCase_10() {
	     WebElement textBox = browser.findElement(By.name("characters"));
	     textBox.sendKeys("ghd%ghd");
	     String currentPage = browser.getCurrentUrl();
	     browser.findElement(By.name("validate")).click();
	     String newPage = browser.getCurrentUrl();
	     assertEquals(currentPage, newPage);
	 }

}