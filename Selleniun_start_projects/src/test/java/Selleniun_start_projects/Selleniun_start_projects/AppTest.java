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

public class AppTest {

    static WebDriver browser;

    @Before
    public void setup() {

        
    	System.setProperty("webdriver.gecko.driver", "C:\\Users\\user\\Desktop\\geckodriver.exe");

        
        FirefoxOptions options = new FirefoxOptions();
        options.setBinary("C:\\Users\\user\\AppData\\Local\\Mozilla Firefox\\firefox.exe");  
       
        browser = new FirefoxDriver(options);
        browser.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        browser.get("https://testpages.eviltester.com/styled/apps/triangle/triangle001.html");
    }

    @Test
    public void Tests_1() {

        WebElement textBox = browser.findElement(By.id("side1"));
        textBox.sendKeys("5.0");
        textBox = browser.findElement(By.id("side2"));
        textBox.sendKeys("5.0");
        textBox = browser.findElement(By.id("side3"));
        textBox.sendKeys("5.0");

        String currentPage = browser.getCurrentUrl();
        browser.findElement(By.id("identify-triangle-action")).click();
        String newPage = browser.getCurrentUrl();
        assertEquals(currentPage, newPage);
    }
    @Test
    public void Tests_2() {

        WebElement textBox = browser.findElement(By.id("side1"));
        textBox.sendKeys("4.0");
        textBox = browser.findElement(By.id("side2"));
        textBox.sendKeys("3.0");
        textBox = browser.findElement(By.id("side3"));
        textBox.sendKeys("2.0");

        String currentPage = browser.getCurrentUrl();
        browser.findElement(By.id("identify-triangle-action")).click();
        String newPage = browser.getCurrentUrl();
        assertEquals(currentPage, newPage);
    }
   
    @Test
    public void Tests_3() {

        WebElement textBox = browser.findElement(By.id("side1"));
        textBox.sendKeys("2.0");
        textBox = browser.findElement(By.id("side2"));
        textBox.sendKeys("2.0");
        textBox = browser.findElement(By.id("side3"));
        textBox.sendKeys("4.0");

        String currentPage = browser.getCurrentUrl();
        browser.findElement(By.id("identify-triangle-action")).click();
        String newPage = browser.getCurrentUrl();
        assertEquals(currentPage, newPage);
    }
    @Test
    public void Tests_4() {

        WebElement textBox = browser.findElement(By.id("side1"));
        textBox.sendKeys("4.0");
        textBox = browser.findElement(By.id("side2"));
        textBox.sendKeys("6.0");
        textBox = browser.findElement(By.id("side3"));
        textBox.sendKeys("4.0");

        String currentPage = browser.getCurrentUrl();
        browser.findElement(By.id("identify-triangle-action")).click();
        String newPage = browser.getCurrentUrl();
        assertEquals(currentPage, newPage);
    }
    @Test
    public void Tests_5() {

        WebElement textBox = browser.findElement(By.id("side1"));
        textBox.sendKeys("3.0");
        textBox = browser.findElement(By.id("side2"));
        textBox.sendKeys("2.0");
        textBox = browser.findElement(By.id("side3"));
        textBox.sendKeys("1.0");

        String currentPage = browser.getCurrentUrl();
        browser.findElement(By.id("identify-triangle-action")).click();
        String newPage = browser.getCurrentUrl();
        assertEquals(currentPage, newPage);
    }
    @Test
    public void Tests_6() {

        WebElement textBox = browser.findElement(By.id("side1"));
        textBox.sendKeys("0.0");
        textBox = browser.findElement(By.id("side2"));
        textBox.sendKeys("10.0");
        textBox = browser.findElement(By.id("side3"));
        textBox.sendKeys("1.0");

        String currentPage = browser.getCurrentUrl();
        browser.findElement(By.id("identify-triangle-action")).click();
        String newPage = browser.getCurrentUrl();
        assertEquals(currentPage, newPage);
    }
    @Test
    public void Tests_7() {

        WebElement textBox = browser.findElement(By.id("side1"));
        textBox.sendKeys("3.0");
        textBox = browser.findElement(By.id("side2"));
        textBox.sendKeys("2.5");
        textBox = browser.findElement(By.id("side3"));
        textBox.sendKeys("2.5");

        String currentPage = browser.getCurrentUrl();
        browser.findElement(By.id("identify-triangle-action")).click();
        String newPage = browser.getCurrentUrl();
        assertEquals(currentPage, newPage);
    }
    @Test
    public void Tests_8() {

        WebElement textBox = browser.findElement(By.id("side1"));
        textBox.sendKeys("100.0");
        textBox = browser.findElement(By.id("side2"));
        textBox.sendKeys("30.0");
        textBox = browser.findElement(By.id("side3"));
        textBox.sendKeys("100.0");

        String currentPage = browser.getCurrentUrl();
        browser.findElement(By.id("identify-triangle-action")).click();
        String newPage = browser.getCurrentUrl();
        assertEquals(currentPage, newPage);
    }
  
}