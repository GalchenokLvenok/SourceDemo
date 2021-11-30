import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class SearchDifferentLocatorsTest extends BaseTest{

    @Test
    public void searchLocators() {
        driver.get("https://www.saucedemo.com/");
        WebElement user_name = driver.findElement(By.id("user-name"));
        WebElement psw = driver.findElement(By.name("password"));
        WebElement className = driver.findElement(By.className("bot_column"));
        driver.findElement(By.tagName("h4"));

    }
}
