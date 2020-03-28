import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestJenkins2 {
    private WebDriver driver;

    @BeforeAll
    static void oneTimeSetup() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    void setUp() {
        String os = System.getProperty("os.name");
        System.out.println("OS name: "+ os);
        driver = new ChromeDriver();
    }

    @Test
    void test() {
        System.out.println("Hi, Selenium");
       driver.get("https://www.selenium.dev/");
        System.out.println("The title of the page: "+ driver.getTitle());
    }
    @AfterEach
    public void tearDown()
    {
        driver.quit();
    }

}
