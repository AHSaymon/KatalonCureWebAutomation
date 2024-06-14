package ModuleObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MakeAppoinmentObject {
    private static WebElement element=null;
    //WebDriver driver=null;

    // hamburgerMenu button
    public static WebElement hospitalReadmissionCheckbox(WebDriver driver)
    {
        element=driver.findElement(By.id("chk_hospotal_readmission"));
        return element;
    }
    public static WebElement programTypeRadioBox(WebDriver driver)
    {
        element=driver.findElement(By.id("radio_program_medicaid"));
        return element;
    }

    public static WebElement visitDateButton(WebDriver driver)
    {
        element=driver.findElement(By.id("txt_visit_date"));
        return element;
    }

    public static WebElement commentTextBox(WebDriver driver)
    {
        element=driver.findElement(By.id("txt_comment"));
        return element;
    }

    public static WebElement bookBtn(WebDriver driver)
    {
        element=driver.findElement(By.id("btn-book-appointment"));
        return element;
    }
}
