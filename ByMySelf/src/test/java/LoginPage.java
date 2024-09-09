import org.example.sources;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginPage {
    public WebDriver driver;
    @BeforeTest
    public void openbrowser(){
        String chromepath = System.getProperty("user.dir") + "\\src\\main\\resources\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromepath);
        driver=new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
        driver.manage().window().maximize();


    }
    @Test(priority = 1)
    public void validData() throws InterruptedException {
    sources sourc=new sources(driver);
    sourc.LoginSteps("khaled","eletriby","Test1234");
    Thread.sleep(50000);
    }
    @AfterTest
    public void closebrowser(){
        driver.quit();
    }
}
