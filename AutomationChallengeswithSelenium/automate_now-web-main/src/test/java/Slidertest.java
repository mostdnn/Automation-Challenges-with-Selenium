import Pages.BasePage;
import Pages.SliderPage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Slidertest extends Basetest
{

   @Test
    public void Slider() throws InterruptedException
   {
       //driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
       Thread.sleep(1000);
       //BasePage.ScrollToSliders(driver);
        BasePage.Sliders(driver).click();
       for (int i=0;i<25;i++)
       {
           SliderPage.Slider(driver).sendKeys(Keys.ARROW_RIGHT);
       }
      String value= driver.findElement(By.id("value")).getText();
       Assert.assertEquals(value,"50");

    }
}
