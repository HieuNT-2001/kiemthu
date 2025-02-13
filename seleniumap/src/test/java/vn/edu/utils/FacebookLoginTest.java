package vn.edu.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookLoginTest {

    WebDriver driver;

    @BeforeTest
    public void setUp() {
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
    }

    @Test
    public void testLogin() {
        driver.findElement(By.id("email")).sendKeys("null");
        driver.findElement(By.id("pass")).sendKeys("");
        driver.findElement(By.name("login")).click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement error = driver.findElement(By.cssSelector("div._9ay7"));
        Assert.assertTrue(error.isDisplayed(), error.getText());
    }

    @AfterTest
    public void tearDown() {
        driver.close();
    }

}
