package Activities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity1 {

    WebDriver driver;
    WebDriverWait wait;

    @BeforeClass
    public void setUp() {
       
        driver = new FirefoxDriver();
        driver.get("http://alchemy.hguy.co/crm");
    }

    @Test
    public void getWebsiteTitle(){

        String title = driver.getTitle();
        System.out.println(title);

        Assert.assertEquals("SuiteCRM", title);
    }

    @AfterClass
    public void tearDown()
    {
        driver.close();
    }
}