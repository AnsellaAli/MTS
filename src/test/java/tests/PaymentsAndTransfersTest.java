package tests;

import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;
import pages.HomePage;
import pages.PaymentAndTransfers;

public class PaymentsAndTransfersTest extends BaseTest{

    @Test
    @DisplayName("")
    public void checkSearchSort(){
        HomePage homePage = new HomePage();
        homePage.openPage()
                .clickGoToPaymentAndTransfersPage();

        PaymentAndTransfers paymentAndTransfers = new PaymentAndTransfers();
        paymentAndTransfers.clickSearchInput()
                .enteringValues("связь")
                .checkSearchList();
    }

    @Test
    @DisplayName("")
    public void checkErrorText(){
        HomePage homePage = new HomePage();
        homePage.openPage()
                .clickGoToPaymentAndTransfersPage();

        PaymentAndTransfers paymentAndTransfers = new PaymentAndTransfers();
        paymentAndTransfers.clickSearchInput()
                .enteringValues("сумка")
                .checkErrorText();
    }

    @Test
    @DisplayName("")
    public void checkDeleteInput(){
        HomePage homePage = new HomePage();
        homePage.openPage()
                .clickGoToPaymentAndTransfersPage();

        PaymentAndTransfers paymentAndTransfers = new PaymentAndTransfers();
        paymentAndTransfers.clickSearchInput()
                .enteringValues("мобильный")
                .deleteSearch();
    }

}
