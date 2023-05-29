package quest1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class SecondElementItaly extends BaseSeleniumTest{
    private final By italy = By.cssSelector("a.march8:nth-of-type(1)");
    @Test
    public void italyTest() {
        WebElement element = driver.findElement(italy);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
        element.click();
        Assertions.assertTrue(driver.getTitle().contains("8 марта в Италии"));
    }
}
