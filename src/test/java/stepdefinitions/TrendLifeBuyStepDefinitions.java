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

    @Given("Open browser go to url {string}")
    public void open_browser_go_to_url(String url) {
        Driver.getDriver().get(ConfigReader.getProperty(url)); // Bu dinamik olan
        //  Driver.getDriver().get(ConfigReader.getProperty("myUrl2"));
        ReusableMethods.bekle(2);
    }
    @Then("User clicks on the login link, enters {string} and {string} and logs in.")
    public void user_clicks_on_the_login_link_enters_and_and_logs_in(String mail, String password) {
        ReusableMethods.bekle(2);
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
        Assert.assertTrue(life.detailsPending.isDisplayed());
        Assert.assertTrue(life.detailsProcessing.isDisplayed());
        Assert.assertTrue(life.detailsShipped.isDisplayed());
        Assert.assertTrue(life.detailsRecieved.isDisplayed());
        Assert.assertTrue(life.detailsDelivered.isDisplayed());

    }

    @Then("User clicks My Account section on dashbord page")
    public void user_clicks_my_account_section_on_dashbord_page() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.bekle(2);
        life.myAccountLink.click();

    }
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
        Assert.assertTrue(life.firstnameBoxMyAccount.isDisplayed());


    }
    @Then("User clicks Purchase History section on dashboard page")
    public void user_clicks_purchase_history_section_on_dashboard_page() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.bekle(3);
        life.purchaseHistoryLink.click();

    }
    @Then("User verifies that Purchase History page is accessible")
    public void user_verifies_that_purchase_history_page_is_accessible() {
        String expected="https://trendlifebuy.com/my-purchase-histories";
        String actual= Driver.getDriver().getCurrentUrl();

        Assert.assertEquals(expected,actual);

    }

    @Then("User verifies that \\(These credentials do not match our records.) message appears in the corner")
    public void userVerifiesThatTheseCredentialsDoNotMatchOurRecordsMessageAppearsInTheCorner() {
        Assert.assertTrue(life.systemMessage.isDisplayed());
    }






    @Then("User closes the page")
    public void userClosesThePage() {
        //Driver.closeDriver();
    }



}