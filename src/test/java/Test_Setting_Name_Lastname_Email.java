import org.junit.jupiter.api.Test;

public class Test_Setting_Name_Lastname_Email extends BaseTest {

    @Test
    public void test_setName() {
        System.out.println("test method 1");
        practiceFormPage.setName("Melda");
    }

    @Test
    public void test_setLastName() {
        System.out.println("test method 2");
        practiceFormPage.setLastName("Çelik");
    }

    @Test
    public void test_setEmail() {
        System.out.println("test method 3");
        practiceFormPage.setEmail("test@test.com");
    }
}
