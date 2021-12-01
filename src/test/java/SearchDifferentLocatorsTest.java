import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class SearchDifferentLocatorsTest extends BaseTest{

    @Test
    public void searchLocators() {
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.className("bot_column"));
        driver.findElement(By.tagName("h4"));

        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.name("password")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//input[@value='Login']")).click();
        driver.findElement(By.partialLinkText("Twitter"));
        driver.findElement(By.linkText("Twitter"));
        driver.findElement(By.xpath("//button[text()='Open Menu']"));
        driver.findElement(By.xpath("//option[contains(@value,'hil')]"));
        driver.findElement(By.xpath("//span[contains(text(),'Name')]"));
        driver.findElement(By.xpath("//select[@class='product_sort_container']//ancestor::span"));
        driver.findElement(By.xpath("//div[@class='inventory_item_label']//following::a[@id='item_2_img_link']"));
        driver.findElement(By.xpath("//div[@class='right_component']//parent::div"));

        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        driver.findElement(By.className("shopping_cart_link")).click();
        driver.findElement(By.xpath("//button[@id='checkout' and text()='Checkout']"));
        driver.findElement(By.cssSelector("#continue-shopping")).click();
        driver.findElement(By.cssSelector(".page_wrapper"));
        driver.findElement(By.cssSelector(".btn.btn_secondary.btn_small.btn_inventory"));
        driver.findElement(By.cssSelector(".page_wrapper .primary_header"));
        driver.findElement(By.cssSelector("option"));
        driver.findElement(By.cssSelector("select.product_sort_container"));
        driver.findElement(By.cssSelector("[value='az']"));
        driver.findElement(By.cssSelector("[alt~='Light']"));
        driver.findElement(By.cssSelector("a[href^='https']"));
        driver.findElement(By.cssSelector("a[href$='.com/saucelabs']"));
        driver.findElement(By.cssSelector("a[href*='facebook']"));

    }
}
