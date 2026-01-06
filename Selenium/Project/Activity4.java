package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;

public class Activity4 {

    WebDriver driver;
    WebDriverWait wait;

    @BeforeMethod
    public void setUp() {
        
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("http://alchemy.hguy.co/crm");
    }


    @Test(dataProvider = "loginCreds")
    public void loginTest(String username, String password)
    {
        
            WebElement user = driver.findElement(By.id("user_name"));
            WebElement pwd = driver.findElement(By.id("username_password"));

            user.clear();
            pwd.clear();

            user.sendKeys(username);
            pwd.sendKeys(password);

            driver.findElement(By.id("bigbutton")).click();
            	  
            	  Assert.assertEquals(driver.getTitle(), "SuiteCRM");
            	  System.out.println("Login Succesful, Homepage verified");

    }

    @DataProvider(name="loginCreds")
    public Object[][] credentials()
    {

        Object[][] obj ={
                {"admin","pa$$w0rd"},
        };
        return obj;
    }


    @AfterClass
    public void tearDown()
    {
        driver.quit();
    }
}