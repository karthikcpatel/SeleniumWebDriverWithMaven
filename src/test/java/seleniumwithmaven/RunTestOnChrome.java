package seleniumwithmaven;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RunTestOnChrome {
    WebDriver driver;

    @BeforeMethod
    public void beforeMethod() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    public void test() {
        driver.get("https://www.google.com");
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Kartik Chetan Patel");
        driver.manage().window().maximize();
        System.out.println("Hello! This is from Kartik Patel");
        System.out.println("Hello! This is from Vaishali Jadhav");
    }

    @AfterMethod
    public void afterMethod() {
        driver.close();
    }
}