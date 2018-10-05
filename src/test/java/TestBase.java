import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Configproperties;

public class TestBase {

    private WebDriver driver;
    private WebDriverWait wait;

    @Before
    public void init(){
        System.setProperty("webdriver.chrome.driver", Configproperties.getTestProperty("chromedriver"));
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver,10);

    }

    @Test
     public void searchGoogle() {
        driver.get("https://www.google.com.ua");
        WebElement webElement = driver.findElement(By.id("lst-ib"));
        webElement.sendKeys("CHI Software");
        webElement.sendKeys(Keys.ENTER);



    }

    @After
    public void stop(){
      driver.quit();
      driver = null;

    }

}
