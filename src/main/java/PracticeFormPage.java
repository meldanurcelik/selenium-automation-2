import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PracticeFormPage {

    private WebDriver driver;
    private final By firstName = By.id("firstName");
    private final By lastName = By.id("lastName");
    private final By userEmail = By.id("userEmail");

    public PracticeFormPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setName(String nameString) {
        WebElement nameSpace = driver.findElement(firstName);
        nameSpace.click();
        nameSpace.sendKeys(nameString);
    }

    public void setLastName(String lastNameString) {
        WebElement lastNameSpace = driver.findElement(lastName);
        lastNameSpace.click();
        lastNameSpace.sendKeys(lastNameString);
    }

    public void setEmail(String emailString) {
        WebElement emailSpace = driver.findElement(userEmail);
        emailSpace.click();
        emailSpace.sendKeys(emailString);
    }

    public String getName() {
        WebElement nameSpace = driver.findElement(firstName);
        return nameSpace.getAttribute("value");
    }

    public String getLastName() {
        WebElement nameSpace = driver.findElement(lastName);
        return nameSpace.getAttribute("value");
    }

    public String getEmail() {
        WebElement nameSpace = driver.findElement(userEmail);
        return nameSpace.getAttribute("value");
    }


}
