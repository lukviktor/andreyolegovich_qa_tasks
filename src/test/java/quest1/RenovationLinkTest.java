package quest1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class RenovationLinkTest extends BaseSeleniumTest {
    private final By renovation = By.linkText("Renovation");

    @DisplayName("Кликнуть на первую ссылку с текстом «Renovation»")
    @Test
    public void firstLinkRenovationTest() {
        driver.findElement(renovation).click();
        String textAftrClick = driver.getTitle();
        Assertions.assertEquals("Ремонт квартир на Коста-дель-Соль", textAftrClick);
    }


}
