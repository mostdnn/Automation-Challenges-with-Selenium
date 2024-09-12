import Pages.BasePage;
import Pages.GesturesPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class Gesturestest extends Basetest
{

    @Test (priority = 0)
    public void gesturesFun() throws InterruptedException
    {
        Thread.sleep(1000);
        //BasePage.ScrollToSliders(driver);
        BasePage.Gesture_BTN(driver).click();
      WebElement x=  GesturesPage.Move(driver);
        Actions actions = new Actions(driver);
        Thread.sleep(2000);
        // Example: Move element to a specific location (offset)
        actions.dragAndDropBy(  x, 120,0 ).perform();
        Thread.sleep(1000);


        //for (int i=0;i<25;i++)
        //{
          //  GesturesPage.Move(driver).;
       // }
        // String value= driver.findElement(By.id("value")).getText();
      //  Assert.assertEquals(value,"50");

    }
    @Test(priority = 1)
    public void GesturesFn2() throws InterruptedException
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));

        WebElement target=driver.findElement(By.id("div2"));
       String loc1= driver.findElement(By.id("div2")).getLocation().toString();
        String loc2= driver.findElement(By.id("div1")).getLocation().toString();


        int xloc2= driver.findElement(By.id("div2")).getLocation().getX();
        int yloc2= driver.findElement(By.id("div2")).getLocation().getY();

        int xloc1= driver.findElement(By.id("div1")).getLocation().getX();
        int yloc1= driver.findElement(By.id("div1")).getLocation().getY();
       int resx= xloc2-xloc1;
       int resy=yloc2-yloc1;

        System.out.println("location 1 :"+loc1);
        System.out.println("location 2 :"+loc2);
        System.out.println("sub is x" + resx);
        System.out.println("sub is y"+resy);

        wait.until(ExpectedConditions.visibilityOf(GesturesPage.dragMe(driver)));

        WebElement pic=GesturesPage.dragMe(driver);
        Actions actions = new Actions(driver);
        // Example: Move element to a specific location (offset)
       // actions.clickAndHold( GesturesPage.dragMe(driver)).clickAndHold().moveByOffset(10,0).release().perform();
       // actions.clickAndHold( GesturesPage.dragMe(driver)).dragAndDropBy(GesturesPage.dragMe(driver),100,0).release().perform();
        Thread.sleep(2000);
        System.out.println("pic loc  "+pic.getLocation().toString());

        actions.dragAndDropBy(pic,130, 0).perform();
       // actions.dragAndDrop(pic,target).perform();
        Thread.sleep(1000);

    }
    @Test(priority = 2)
    public void GesturesFn3() throws InterruptedException
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(2));

        Thread.sleep(3000);

        WebElement x= wait.until(ExpectedConditions.visibilityOf(GesturesPage.dragMab(driver)));
        Actions actions = new Actions(driver);
       // WebElement x =GesturesPage.dragMab(driver);
        Thread.sleep(2000);

        actions.dragAndDropBy(x,150,0).perform();


        Thread.sleep(1000);

    }

}
