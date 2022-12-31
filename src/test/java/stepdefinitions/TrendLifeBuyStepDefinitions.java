package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.TrendLifeBuyPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.security.Key;

public class TrendLifeBuyStepDefinitions    {

    TrendLifeBuyPage life=new TrendLifeBuyPage();
    Actions actions=new Actions(Driver.getDriver());

    // 1. ==================== LOGIN----> DASHBOARD   =======================>>>
    @Given("Open browser go to url {string}")
    public void open_browser_go_to_url(String url) {
        Driver.getDriver().get(ConfigReader.getProperty(url)); // Bu dinamik olan
        //  Driver.getDriver().get(ConfigReader.getProperty("myUrl2"));
        ReusableMethods.bekle(2);
    }
    @Then("User clicks on the login link, enters {string} and {string} and logs in.")
    public void user_clicks_on_the_login_link_enters_and_and_logs_in(String mail, String password) {

        life.loginLink.click();
        ReusableMethods.bekle(2);
        life.emailBox.sendKeys(ConfigReader.getProperty(mail));
        // life.emailBox.sendKeys(mail);
        life.passwordBox.sendKeys(ConfigReader.getProperty(password));
        //   life.passwordBox.sendKeys(password);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.bekle(2);
        life.signInButton.click();
    }
    @Then("User clicks on dashboard link")
    public void user_clicks_on_dashboard_link() {
        life.dashboardLink.click();
        ReusableMethods.bekle(3);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.bekle(3);
    }

    // ========================== ESKILER  ====================
    @Then("User clicks My Account section on dashbord page")
    public void user_clicks_my_account_section_on_dashbord_page() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.bekle(2);
        life.myAccountLink.click();}
    @Then("User verifies that the page is accessible")
    public void user_verifies_that_the_page_is_accessible() {
        String expected="https://trendlifebuy.com/profile";
        String actual=Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expected,actual);
        //   Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("/profile"));
    }
    @Then("Closes the page")
    public void closes_the_page() {
        Driver.closeDriver();
    }
    @Then("Verifies that the Basic Info tab contains First Name, Last Name,Email Address, Phone Number, Date of Birth, Description,Text Box")
    public void verifiesThatTheBasicInfoTabContainsFirstNameLastNameEmailAddressPhoneNumberDateOfBirthDescriptionTextBox() {
        Assert.assertTrue(life.firstnameBoxMyAccount.isDisplayed());}
    @Then("User clicks Purchase History section on dashboard page")
    public void user_clicks_purchase_history_section_on_dashboard_page() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.bekle(3);
        life.purchaseHistoryLink.click();}
    @Then("User verifies that Purchase History page is accessible")
    public void user_verifies_that_purchase_history_page_is_accessible() {
        String expected="https://trendlifebuy.com/my-purchase-histories";
        String actual= Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expected,actual);}
    @Then("User verifies that \\(These credentials do not match our records.) message appears in the corner")
    public void userVerifiesThatTheseCredentialsDoNotMatchOurRecordsMessageAppearsInTheCorner() {
        Assert.assertTrue(life.systemMessage.isDisplayed());}
    @Then("User closes the page")
    public void userClosesThePage() {Driver.closeDriver();}



    // 2. US18 ==================== MY ORDER   =======================>>>
    // 1801- My Order sayfasindaki urun boardindan Order Details butonuna tiklayinca ilgili siparisin detay sayfasina gidildigi dogrulanmali.

    @Then("User clicks My Order section on dashboard page")
    public void userClicksMyOrderSectionOnDashboardPage() {
        life.myOrderLink.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.bekle(3);

    }

    @Then("User verifies that the Order Details page is accessible")
    public void userVerifiesThatTheOrderDetailsPageIsAccessible() {
        life.orderDetailsButton.click();
        String expData="details";
        String requestData="https://trendlifebuy.com/my-purchase-order-details";
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(expData));
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(requestData));
        Assert.assertTrue(life.orderDetailsListBox.isEnabled());
        //Assert.assertTrue(life.orderDetailsBody.isDisplayed());
        //1801- My Order sayfasindaki urun boardindan Order Details butonuna tiklayinca,
        // ilgili siparisin detay sayfasina gidildigi dogrulanmali.
    }

    @Then("User verifies that sections on the Order Details page appear")
    public void userVerifiesThatSectionsOnTheOrderDetailsPageAppear() {
    //1802- On the Order Details page, it should be verified that the
    // Order ID, Status, Order date, Order Amount, Package, Price, Est arrival date, TAX Amount information is displayed.
        life.orderDetailsButton.click();
        ReusableMethods.bekle(2);
        Assert.assertTrue(life.detailsOrderID.isDisplayed());
        Assert.assertTrue(life.detailsStatus.isDisplayed());
        ReusableMethods.bekle(3);
        Assert.assertTrue(life.detailsOrderDate.isDisplayed());
        Assert.assertTrue(life.detailsOrderAmount.isDisplayed());
        Assert.assertTrue(life.detailsPackage.isDisplayed());
        Assert.assertTrue(life.detailsPrice.isDisplayed());
        Assert.assertTrue(life.detailsEstArrivalDate.isDisplayed());
        Assert.assertTrue(life.detailsTAXAmount.isDisplayed());
        //life.orderAssert();

    }

    @Then("User verifies that sections, stages appear on the Order Details page")
    public void userVerifiesThatSectionsStagesAppearOnTheOrderDetailsPage() {
        // 1803- Order Details sayfasinda ilgili siparis süreci ile ilgili;
        // Pending, Processing, Shipped, Recieved, Delivered asamalari görünür oldugu dogrulanmali.
        life.orderDetailsButton.click();
        ReusableMethods.bekle(2);
        Assert.assertTrue(life.detailsPending.isDisplayed());
        Assert.assertTrue(life.detailsProcessing.isDisplayed());
        Assert.assertTrue(life.detailsShipped.isDisplayed());
        Assert.assertTrue(life.detailsRecieved.isDisplayed());
        Assert.assertTrue(life.detailsDelivered.isDisplayed());

    }
    @Then("User verifies that text about the order is visible on the Order Details page")
    public void userVerifiesThatTextAboutTheOrderIsVisibleOnTheOrderDetailsPage() {
        // 1804- Order Details sayfasinda; Pending, Processing, Shipped, Recieved, Delivered
        //  asamalarinin aciklamalarini iceren textlerin görünür oldugu dogrulanmali.
        life.orderDetailsButton.click();
        Assert.assertTrue(life.detailsPendingText.isDisplayed());
        Assert.assertTrue(life.detailsProcessingText.isDisplayed());
        Assert.assertTrue(life.detailsShippedText.isDisplayed());
        Assert.assertTrue(life.detailsRecievedText.isDisplayed());
        Assert.assertTrue(life.detailsDeliveredText.isDisplayed());
    }

    @Then("User verifies that the Cancel Order button on the Order Details page is available")
    public void userVerifiesThatTheCancelOrderButtonOnTheOrderDetailsPageIsAvailable() {
        //1805- My Order sayfasindaki Cancel Order butonunun Cancel sekmesine yönlendirme yaptigi dogrulanmali.
        life.cancelOrderButton.click();
        Assert.assertTrue(life.selectCancelReasonTab.isDisplayed());
    }

    @Then("User verifies that the Reason box and Send button are available when the Cancel Order button on the Order Details page is pressed")
    public void userVerifiesThatTheReasonBoxAndSendButtonAreAvailableWhenTheCancelOrderButtonOnTheOrderDetailsPageIsPressed() {
        //1806- Cancel sekmesindeki Reason textbox'inin aktif oldugu ve send butonuna tiklaninca girilen order'in iptal edildigi dogrulanmali.
        life.cancelOrderButton.click();
        Assert.assertTrue(life.reasonBox.isEnabled());     // .isDisplayed da hata verdi
        Assert.assertTrue(life.sendButton.isEnabled());
        //life.cancelOrderButton3.click();
        //life.sendButton3.click();
        Assert.assertTrue(life.orderCancelledButton3.isDisplayed());
    }

    @Then("User verifies that the product has Shipping, Billing and Payment information on the Order Details page")
    public void userVerifiesThatTheProductHasShippingBillingAndPaymentInformationOnTheOrderDetailsPage() {
        //1807- Order Details sayfasinda ürünle ilgili Shipping Info, Billing Info, Payment Info bilgilerine erisilebilir oldugu dogrulanmali
        life.orderDetailsButton.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.bekle(2);
        Assert.assertTrue(life.detailsShippingInfo.isEnabled());
        Assert.assertTrue(life.detailsBillingInfo.isEnabled());
        Assert.assertTrue(life.detailsPaymentInfo.isEnabled());
        Assert.assertTrue(life.detailsShippingInfo.isDisplayed());
        Assert.assertTrue(life.detailsBillingInfo.isDisplayed());
        Assert.assertTrue(life.detailsPaymentInfo.isDisplayed());
    }

    // 3. US19 ==================== MY WALLET   =======================>>>
    // 1901- Dashboard sayfasinda bulunan side bar'daki My Wallet linkinin Wallet sayfasina yönlendirdigi dogrulanmali.
    @Then("User clicks My Wallet section on dashboard page")
    public void userClicksMyWalletSectionOnDashboardPage() {
        life.myWalletLink.click();
        ReusableMethods.bekle(2);
    }
    @Then("User verifies that the My Wallet link in the sidebar on the Dashboard page is accessible")
    public void userVerifiesThatTheMyWalletLinkInTheSidebarOnTheDashboardPageIsAccessible() {
        Assert.assertTrue(life.myWalletTitle.isDisplayed());
    }
    //1902-My Wallet sayfasinda Total Balance, Running Balance, Pending Balance boardlarinin görünür oldugu dogrulanmali.
    @Then("User verifies that balance statuses appear on My Wallet page")
    public void userVerifiesThatBalanceStatusesAppearOnMyWalletPage() {
        actions.sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).perform();
        Assert.assertTrue(life.myWalletTotalBalance.isDisplayed());
        Assert.assertTrue(life.myWalletRunningBalance.isDisplayed());
        Assert.assertTrue(life.myWalletPendingBalance.isDisplayed());
    }
        //1903- My Wallet sayfasinda Recharge Wallet butonunun görünür oldugu ve Recharge Amount sekmesine yönlendirdigi dogrulanmali.
    @Then("User verifies that the Top Up My Wallet button appears and works on the My Wallet page")
    public void userVerifiesThatTheTopUpMyWalletButtonAppearsAndWorksOnTheMyWalletPage() {
        actions.sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).perform();
        actions.sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).perform();
        ReusableMethods.bekle(2);

        Assert.assertTrue(life.myWalletRechargeWallet.isDisplayed());
        life.myWalletRechargeWallet.click();

        ReusableMethods.bekle(2);
        Assert.assertTrue(life.rechargeWalletRechargeAmountTab.isDisplayed());
    }
        //1904- Recharge Amount sekmesinde tutar girebilebilen bir TextBox'in oldugu dogrulanmali
    @Then("User verifies that there is a TextBox where the amount can be entered in the Recharge Amount tab")
    public void userVerifiesThatThereIsATextBoxWhereTheAmountCanBeEnteredInTheRechargeAmountTab() {
        actions.sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).perform();
        actions.sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).perform();
        ReusableMethods.bekle(2);

        life.myWalletRechargeWallet.click();
        ReusableMethods.bekle(2);

        Assert.assertTrue(life.enterRechargeAmountBox.isDisplayed());
    }
    //1905
    @Then("User verifies that the Cancel button on the Recharge Amount tab is visible and working, to cancel the operation")
    public void userVerifiesThatTheCancelButtonOnTheRechargeAmountTabIsVisibleAndWorkingToCancelTheOperation() {
        actions.sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).perform();
        actions.sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).perform();
        ReusableMethods.bekle(2);

        life.myWalletRechargeWallet.click();
        ReusableMethods.bekle(2);

        Assert.assertTrue(life.cancelButtonAmountBox.isDisplayed());
        ReusableMethods.bekle(2);

        life.cancelButtonAmountBox.click();
        ReusableMethods.bekle(2);

        Assert.assertFalse(life.cancelButtonAmountBox.isDisplayed());
    }
    //1906
    @Then("User verifies that the Add Fund button in the Recharge Amount tab is visible and working")
    public void userVerifiesThatTheAddFundButtonInTheRechargeAmountTabIsVisibleAndWorking() {

        actions.sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).perform();
        actions.sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).perform();
        ReusableMethods.bekle(2);

        life.myWalletRechargeWallet.click();
        ReusableMethods.bekle(2);

        Assert.assertTrue(life.addFundButton.isDisplayed());
        ReusableMethods.bekle(2);

        life.enterRechargeAmountBox.sendKeys("150");

        life.addFundButton.click();
        ReusableMethods.bekle(2);

        Assert.assertTrue(life.myWalletRechargeTitle.isDisplayed());

    }
    //1907- My Wallet sayfasinda Wallet Recharge History listesinde Date, Trx Id, Amount, Type, Payment Method, Status
    // sütunlarinin oldugu dogrulanmali
    @Then("User verifies that they have corresponding columns in the Wallet Upload History list on the My Wallet page")
    public void userVerifiesThatTheyHaveCorrespondingColumnsInTheWalletUploadHistoryListOnTheMyWalletPage() {
        actions.sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).perform();
        ReusableMethods.bekle(3);

        Assert.assertTrue(life.sutunWalletRechargeHistoryTitle.getText().contains("Date"));
        Assert.assertTrue(life.sutunWalletRechargeHistoryTitle.getText().contains("Trx Id"));
        Assert.assertTrue(life.sutunWalletRechargeHistoryTitle.getText().contains("Amount"));
        Assert.assertTrue(life.sutunWalletRechargeHistoryTitle.getText().contains("Type"));
        Assert.assertTrue(life.sutunWalletRechargeHistoryTitle.getText().contains("Payment Method"));
        Assert.assertTrue(life.sutunWalletRechargeHistoryTitle.getText().contains("Status"));

        // String expData1="Date";
        // String expData2="Trx Id";
        //String expData="Date, Trx Id, Amount, Type, Payment Method, Status";
        //Assert.assertTrue(life.sutunWalletRechargeHistoryTitle.getText().contains(expData1));
        //Assert.assertTrue(life.sutunWalletRechargeHistoryTitle.getText().contains(expData2));


        // Date   Trx Id   Amount  Type Payment Method Status
    }

    @Then("User verifies Wallet transactions in the Wallet Recharge History list on the My Wallet page")
    public void userVerifiesWalletTransactionsInTheWalletRechargeHistoryListOnTheMyWalletPage() {
        actions.sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).
                sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).perform();
        Assert.assertTrue(life.walletRechargeHistoryTitle.isEnabled());
        Assert.assertTrue(life.walletRechargeHistoryTab.isEnabled());
        //Assert.assertTrue(life.walletRechargeHistoryTitle.getText().contains("WalletRechargeHistory"));
        //Assert.assertTrue(life.sutunWalletRechargeHistoryTitle.getText().contains("WalletRechargeHistory"));
    }
    // ============================= US20- MY COUPON  ====================

    @Then("User clicks My Coupons section on dashboard page")
    public void userClicksMyCouponsSectionOnDashboardPage() {
        life.myCouponsLink.click();
    }
    @Then("User confirms that the My Coupon page is accessible")
    public void userConfirmsThatTheMyCouponPageIsAccessible() {
        //String expCouponsLink="coupons";
        //Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(expCouponsLink));
        String expLink="https://trendlifebuy.com/profile/coupons";
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(),expLink);
    }

    @Then("User verifies that the coupon code can be entered in the textBox in the Add Coupons section of the My Coupon page")
    public void userVerifiesThatTheCouponCodeCanBeEnteredInTheTextBoxInTheAddCouponsSectionOfTheMyCouponPage() {
        Assert.assertTrue(life.addCouponsCodeBox.isDisplayed());   //????

    }
    @Then("User verifies that the coupon code can be added with the Add Coupon button on the My Coupons page")
    public void userVerifiesThatTheCouponCodeCanBeAddedWithTheAddCouponButtonOnTheMyCouponsPage() {
        life.addCouponsCodeBox.sendKeys("1234");
        life.addCouponButton.click();
        //Assert.assertFalse(life.addCouponButton.isDisplayed()); ----???? 2002

    }

    @Then("User verifies which information the Collected Coupons list is listed")
    public void userVerifiesWhichInformationTheCollectedCouponsListIsListed() {
        Assert.assertTrue(life.collectedCouponsValue.isDisplayed());
        Assert.assertTrue(life.collectedCouponsName.isDisplayed());
        Assert.assertTrue(life.collectedCouponsCode.isDisplayed());
        Assert.assertTrue(life.collectedCouponsValidity.isDisplayed());
        Assert.assertTrue(life.collectedCouponsAction.isDisplayed());
    }
}




