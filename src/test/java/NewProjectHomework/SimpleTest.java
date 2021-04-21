package NewProjectHomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import java.util.UUID;
import org.testng.annotations.AfterClass;



public class SimpleTest {
    WebDriver driver;
    @Test
    public void checkMethod() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://151.80.70.42:3000/");
        driver.findElement(By.cssSelector(".mdi-content-add")).click();
        driver.findElement(By.cssSelector("div.main-content #icon_telephone")).clear();
        driver.findElement(By.cssSelector("input[id=\"icon_prefix\"]")).clear();
        driver.findElement(By.cssSelector("input[id=\"icon_prefix\"]")).sendKeys(UUID.randomUUID().toString());
        long timeInMillis = System.currentTimeMillis() % 1000000000000L;
        driver.findElement(By.cssSelector("div.main-content #icon_telephone")).sendKeys(((Long) timeInMillis).toString());
        driver.findElement(By.cssSelector("div.col.s9 a.save-btn")).click();


    }
        @AfterClass
                public void afterAll() {
        driver.quit();

    }

}
