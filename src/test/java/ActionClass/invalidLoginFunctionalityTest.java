package ActionClass;

import ModuleObject.loginPageObject;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class invalidLoginFunctionalityTest {

    static WebDriver driver=null;
    public static void main(String[] args) {
        LoginPage();
    }

    public static void LoginPage()
    {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        //Project url
        driver.get("https://katalon-demo-cura.herokuapp.com/");

        driver.manage().window().maximize();
        loginPageObject.appointmentButton(driver).click();
        loginPageObject.UserNameBtn(driver).sendKeys("John Doe");
        loginPageObject.PasswordBtn(driver).sendKeys("ThisIsInvalidAPassword");
        loginPageObject.loginBtn(driver).click();
        WebElement errorMessage = driver.findElement(By.xpath("//p[contains(text(), 'Login failed!')]"));
        Assert.assertTrue(errorMessage.isDisplayed());
    }
}
