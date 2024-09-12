import Pages.BasePage;
import Pages.FormFieldsPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.openqa.selenium.Keys;


import java.util.List;

public class FormFields_test extends Basetest
{
    @Test
    public void check_Form_Fields() throws InterruptedException
    {

        //BasePage.ScrollToFormFields(driver);
        Thread.sleep(1000);
        BasePage.FormFields(driver).click();
        FormFieldsPage.Name(driver).sendKeys("aboalahd TEST");
        BasePage.Smallscrolldown(driver);
        List<WebElement> elements =driver.findElements(By.name("fav_drink"));
        for(int i=0;i<elements.size();i++)
        {
            WebElement elem=elements.get(i);
            System.out.println(elements.get(i));
            elem.click();
            //kda msh mhtag a3ml click 3la kol locators bnfsy
        }
        FormFieldsPage.Color(driver).click();
        FormFieldsPage.Siblings(driver).click();
        FormFieldsPage.Option_Drob(driver).click();
        BasePage.Smallscrolldown(driver);
        FormFieldsPage.Mail(driver).sendKeys("hosam@mail.com");
        FormFieldsPage.Message(driver).sendKeys("Black is where everyone could hide");
        FormFieldsPage.Btn_Submit(driver).sendKeys(Keys.ENTER);
        driver.switchTo().alert().accept();
    }

}

