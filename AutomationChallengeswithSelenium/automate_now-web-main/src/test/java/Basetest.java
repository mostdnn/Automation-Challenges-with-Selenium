import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class Basetest
{
  protected static WebDriver driver;
    @BeforeSuite
    public void DeclareDriver() throws InterruptedException
    {
        WebDriverManager.firefoxdriver().setup();
        driver =new FirefoxDriver();
        driver.get("https://practice-automation.com/");
        driver.manage().window().maximize();
        Thread.sleep(500);
    }
    @BeforeClass
    public void Website() throws InterruptedException
    {
    }
    @BeforeMethod
    public void Home_Before() throws InterruptedException
    {
        Thread.sleep(1000);
    }
    @AfterMethod
    public void Home_After() throws InterruptedException
    {
        Thread.sleep(1000);
    }
    @AfterClass
    public void returntostart() throws InterruptedException
    {
        driver.get("https://practice-automation.com/");
        Thread.sleep(1000);
    }
    @AfterSuite
    public void Close() throws InterruptedException {
        Thread.sleep(2000);
        driver.close();
    }

}
