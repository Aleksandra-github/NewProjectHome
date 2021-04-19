package NewProjectHomework;
import org.testng.annotations.Test;

public class SimpleTest {
    WebDriver driver;
    @Test
    public void checkMethod() {
        Sustem.setProperty("webdriver.chrom.driver", "C:\\Users\\admin\\Desktop\\driver\\chromedriver.exe");
        driver =  new ChromeDriver ();
        driver.get("http://151.80.70.42:3000/");
    }

}
