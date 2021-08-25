import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PracticeFormPage extends BasePage {

    private final By nameLocator = By.id("firstName");
    private final By lastNameLocator = By.id("lastName");
    private final By userEmailLocator = By.id("userEmail");

    private GenderSection genderSection;

    public PracticeFormPage(WebDriver driver) {
        super(driver);
        driver.get(baseUrl.concat("automation-practice-form"));
        genderSection = new GenderSection(driver);
    }

    public GenderSection genderSection() {
        return this.genderSection;
    }

    public void setName(String nameString) {
        type(nameLocator, nameString);
    }

    public void setLastName(String lastNameString) {
        type(lastNameLocator, lastNameString);
    }

    public void setEmail(String emailString) {
        type(userEmailLocator, emailString);
    }

    public String getName() {
        return find(nameLocator).getAttribute("value");
    }

    public String getLastName() {
        return find(lastNameLocator).getAttribute("value");
    }

    public String getEmail() {
        return find(userEmailLocator).getAttribute("value");
    }


}
