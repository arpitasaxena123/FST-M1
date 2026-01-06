package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity2 {

    WebDriver driver;
    WebDriverWait wait;

    @BeforeClass
    public void setUp() {
        
        driver = new FirefoxDriver();
        driver.get("http://alchemy.hguy.co/crm");
    }

    @Test
    public void getImageUrl()
    {
        WebElement img = driver.findElement(By.tagName("img"));
        String src = img.getAttribute("src");
        System.out.println(src);
    }

    @AfterClass
    public void tearDown()
    {
        driver.close();
    }
}

