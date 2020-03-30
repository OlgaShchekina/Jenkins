import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestJenkins1 {
    private WebDriver driver;

    @BeforeAll
    static void oneTimeSetup() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    void setUp() {
        driver = new ChromeDriver();
    }

    @Test
    void hiSchool() {
        System.out.println("Hi, School");
        driver.get("https://pasv.us/en");
        String welcome = driver.findElement(By.cssSelector(".t480__title.t-title.t-title_xs.t-margin_auto")).getText();
        assertEquals("We teach programming\nand QA", welcome);

    }
//    @Test
//    void failure()
//    {
//        assertEquals(1,1+1);
//    }
    @AfterEach
    public void tearDown()
    {
        driver.quit();
    }

}


