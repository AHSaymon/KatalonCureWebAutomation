package ActionClass;
import ModuleObject.loginPageObject;
import ModuleObject.logoutObject;
import ActionClass.loginFunctionalityTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class logoutFunctionalityTest {

    static WebDriver driver=null;
    public static void main(String[] args) throws InterruptedException {
        LogoutTest();
    }

    public static void LogoutTest() throws InterruptedException {
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

        Thread.sleep(5000);

        //logout Action
        logoutObject.menuToggleButton(driver).click();
        Thread.sleep(3000);
        logoutObject.logoutButton(driver).click();
    }
}
