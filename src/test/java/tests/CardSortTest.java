package tests;

import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;
import pages.CardPage;
import pages.HomePage;

public class CardSortTest extends BaseTest {

    @Test
    @DisplayName("Проверка сортировки виртуальной карты")
    public void checkingSortVirtualCard() {
        HomePage homePage = new HomePage();
        homePage.openPage()
                .clickGoToCards();

        CardPage cardPage = new CardPage();
        cardPage.selectTab("Виртуальные")
                .checkNamesCardsContainsText("ВИРТУАЛЬНАЯ");
    }

 

}
