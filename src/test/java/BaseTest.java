import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

public class BaseTest {
    @BeforeAll //her şeyden önce bunu çalıştır
    public static void setUp() {
        System.out.println("Setup method initiated");
    }

    @AfterAll
    public static void tearDown() {
        System.out.println("Test finished!");
    }
}
