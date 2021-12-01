import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CreatePurchaseTest extends BaseTest{

    @Test
    public void checkCreationOfPurchase() {

        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
        driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket")).click();
        driver.findElement(By.className("shopping_cart_link")).click();
        WebElement light = driver.findElement(By.linkText("Sauce Labs Bike Light"));
        WebElement jacket = driver.findElement(By.linkText("Sauce Labs Fleece Jacket"));

        assertEquals(light.getText(),"Sauce Labs Bike Light","Sauce Labs Bike Light is missing into the bin");
        assertEquals(jacket.getText(),"Sauce Labs Fleece Jacket","Sauce Labs Fleece Jacket is missing into the bin");
    }
}
