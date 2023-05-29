package quest1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class RenovationLinkTest extends BaseSeleniumTest {
    private final By renovation = By.xpath("//a[contains(.,'Renovation')]");

    @DisplayName("Кликнуть на первую ссылку с текстом «Renovation»")
    @Test
    public void firstLinkRenovationTest() {
        String textNoClick = driver.getTitle();
        driver.findElement(renovation).click();
        String textAftrClick = driver.getTitle();
        System.out.println(textAftrClick);
        Assertions.assertEquals("Ремонт квартир на Коста-дель-Соль", textAftrClick);
    }


}
