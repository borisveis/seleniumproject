import net.bytebuddy.asm.Advice;
import org.openqa.selenium.Keys;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import java.util.concurrent.TimeUnit;

public class SeleniumTest {
    Selenium s = new Selenium();

    @BeforeClass
    public void beforeclass() {


        System.out.println("this is before class");
    }

    @BeforeTest
    public void beforetest() {
        s.geturl("https://www.google.com/");
    }

    @Test
    public void test1() {
        Assert.assertEquals(1, 1);
    }

    @Test
    public void google() {
        System.out.println("this is the google test");
    }

    @Test
    public void googlesearch() {
        String pageoutput = s.searchgoogle("Boris Veis");
        Assert.assertTrue(pageoutput.contains("Boris Veis"));
    }
    @Test
    public void workdayokta(){
        String url="https://resourcecenter.workday.com/";
        s.geturl("https://resourcecenter.workday.com/");
        WebElement username = s.driver.findElement(By.id("email-sign-in-blackColor"));
username.sendKeys("abctest@gmail.com");
        WebElement password = s.driver.findElement(By.id("password-sign-in-blackColor"));
        password.sendKeys("password");
        password.sendKeys(Keys.ENTER);
        //Assert.assertTrue(pageoutput.contains("he credentials you entered do not match our records. Please try again."));
    }

    @AfterClass
    public void teardown() {
        s.quit();
    }
}


