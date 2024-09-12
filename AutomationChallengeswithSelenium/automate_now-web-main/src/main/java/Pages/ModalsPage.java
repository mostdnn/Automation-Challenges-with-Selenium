package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ModalsPage
{
    static  By  simplemodal_btn= By.id("simpleModal");
    static  By formmodal_btn=By.id("formModal");
    static By Simplepopup_assertion=By.id("pum_popup_title_1318");
   static By close_simple =By.cssSelector("button[aria-label='Close']");


   static By formname_txt=By.id("g1051-name");
    static By formemail_txt=By.id("g1051-email");
    static By formmessage_txt=By.name("g1051-message");
    static By formsubmit_btn=By.className("pushbutton-wide");


    static public WebElement Simple_modal_BTN(WebDriver driver) throws InterruptedException {
        WebElement Simple_modal_BTN= driver.findElement(simplemodal_btn);
        return Simple_modal_BTN;
    }

    static public WebElement SimplePopUp_Assertion(WebDriver driver)
    {
        WebElement SimplePopUp_Assertion= driver.findElement(Simplepopup_assertion);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", SimplePopUp_Assertion);
        return SimplePopUp_Assertion;
    }
    static public WebElement SimplePopUp_Close(WebDriver driver)
    {
        WebElement SimplePopUp_Close= driver.findElements(close_simple).get(1);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", SimplePopUp_Close);
        return SimplePopUp_Close;
    }
    static public WebElement Form_modal(WebDriver driver)
    {
        WebElement Form_modal= driver.findElement(formmodal_btn);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Form_modal);
        return Form_modal;
    }

    static public WebElement Form_Email(WebDriver driver)
    {
        WebElement Form_Email= driver.findElement(formemail_txt);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",Form_Email );
        return Form_Email;
    }
    static public WebElement Form_Message(WebDriver driver)
    {
        WebElement Form_Message= driver.findElement(formmessage_txt);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Form_Message);
        return Form_Message;
    }
    static public WebElement Form_Submit(WebDriver driver)
    {
        WebElement Form_Submit= driver.findElement(formsubmit_btn);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",Form_Submit );
        return Form_Submit;
    }
    static public WebElement Form_Name(WebDriver driver)
    {
        WebElement Form_Name= driver.findElement(formname_txt);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",Form_Name );
        return Form_Name;
    }

}
