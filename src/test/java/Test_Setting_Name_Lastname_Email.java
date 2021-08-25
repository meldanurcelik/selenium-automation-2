import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test_Setting_Name_Lastname_Email extends BaseTest {

    @Test
    public void setName() {
        System.out.println("test method 1");
        PracticeFormPage practiceFormPage = new PracticeFormPage(driver);
        practiceFormPage.setName("Melda");
        Assertions.assertEquals("Melda", practiceFormPage.getName(), "First Name value is not correct!");
    }

    @Test
    public void setLastName() {
        System.out.println("test method 2");
        PracticeFormPage practiceFormPage = new PracticeFormPage(driver);
        practiceFormPage.setLastName("Çelik");
        Assertions.assertEquals("Çelik", practiceFormPage.getLastName(), "Last Name value is not correct!");
    }

    @Test
    public void setEmail() {
        System.out.println("test method 3");
        PracticeFormPage practiceFormPage = new PracticeFormPage(driver);
        practiceFormPage.setEmail("test@test.com");
        Assertions.assertEquals("test@test.com", practiceFormPage.getEmail(), "Email value is not correct!");
    }
}
