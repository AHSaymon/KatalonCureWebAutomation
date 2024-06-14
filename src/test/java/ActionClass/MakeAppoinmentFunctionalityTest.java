package ActionClass;
import ModuleObject.MakeAppoinmentObject;
import ActionClass.loginFunctionalityTest;
import ModuleObject.loginPageObject;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import static ActionClass.loginFunctionalityTest.LoginPage;

public class MakeAppoinmentFunctionalityTest {

    static WebDriver driver=null;
    public static void main(String[] args) {
        makeAppointmentPageTest();
    }

    public static void makeAppointmentPageTest()
    {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        //Project url
        driver.get("https://katalon-demo-cura.herokuapp.com/");

        driver.manage().window().maximize();

        //login Page
        loginPageObject.appointmentButton(driver).click();
        loginPageObject.UserNameBtn(driver).sendKeys("John Doe");
        loginPageObject.PasswordBtn(driver).sendKeys("ThisIsNotAPassword");
        loginPageObject.loginBtn(driver).click();

        //BookingPage
        Select facility=new Select(driver.findElement(By.id("combo_facility")));
        facility.selectByVisibleText("Tokyo CURA Healthcare Center");
        MakeAppoinmentObject.hospitalReadmissionCheckbox(driver).click();
        MakeAppoinmentObject.programTypeRadioBox(driver).click();
        MakeAppoinmentObject.visitDateButton(driver).sendKeys("27/06/2024");
        MakeAppoinmentObject.commentTextBox(driver).sendKeys("Sinus Issue");
        MakeAppoinmentObject.bookBtn(driver).click();

    }

}
