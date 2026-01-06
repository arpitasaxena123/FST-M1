package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity3 {
    WebDriver driver;
    WebDriverWait wait;

    @BeforeClass
    public void setUp() {
        
        driver = new FirefoxDriver();
        driver.get("http://alchemy.hguy.co/crm");
    }

    @Test
    public void getCopyrightText()
    {
        String copyright = driver.findElement(By.id("admin_options")).getText();
        System.out.println(copyright);
    }

    @AfterClass
    public void tearDown()
    {
        driver.close();
    }
}