import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Selenium {

    private String chromewebdriverpath = "/opt/homebrew/bin/chromedriver";
    //System.setProperty("webdriver.chrome.driver", "/opt/homebrew/bin/chromedriver");
    public WebDriver driver = new ChromeDriver();
    public String pageoutput;

    public String geturl(String url) {
        driver.get(url);
        return driver.toString();

    }

    public String searchgoogle(String searchstring) {

        WebElement searchInput = driver.findElement(By.name("q"));
        searchInput.sendKeys(searchstring);
        searchInput.submit();
        WebElement l = driver.findElement(By.tagName("body"));
        String pageoutput= l.getText();
        return pageoutput;
    }


    public void quit() {
        driver.quit();

    }
//    public String gesearchString(){
//    WebElement searchstring=driver.findElement(By.id("fprsl"));
//    return;searchstring.toString();
}
