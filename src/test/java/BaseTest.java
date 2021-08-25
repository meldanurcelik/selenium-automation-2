import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BaseTest {

    protected WebDriver driver;


    @BeforeAll //her şeyden önce bunu çalıştır
    public void setUp() {
        System.out.println("Setup method initiated!");
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
    }

    @BeforeEach
    public void beforeMethod(){
        driver = new ChromeDriver();
    }

    @AfterEach
    public void afterMethod(){
        driver.quit();
    }

    @AfterAll
    public void tearDown() {
        //driver.quit();
        System.out.println("Test finished!");
    }
}
