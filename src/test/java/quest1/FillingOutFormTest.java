package quest1;

import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class FillingOutFormTest extends BaseSeleniumTest {
    private final By inputSite = By.id("name1");
    // Кнопка ввода сайт

    private final By btnPereiti = By.xpath("//input[@id='submit1']");


    @Step("Заполнить форму «Сайт» и нажать на кнопку «Перейти»")
    public void clickBtnOrderUp() { // Метод нажатия на кнопку заказать верхняя
        WebElement element = driver.findElement(inputSite);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);

        element.click();
        element.sendKeys("topbicyle.ru");
        System.out.println(driver.getTitle());
        //element.sendKeys(Keys.ENTER);
        driver.findElement(btnPereiti).click();
        System.out.println(driver.getTitle());
    }

    @DisplayName("")
    @Test
    public void fillingFormTest() {
        clickBtnOrderUp();
        String title = driver.getTitle();
        Assertions.assertEquals("AndreyOlegovich.ru", driver.getTitle());
    }
}