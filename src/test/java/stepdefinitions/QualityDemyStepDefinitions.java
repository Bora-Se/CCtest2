package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.QualityDemyPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class QualityDemyStepDefinitions {

    QualityDemyPage demyPage = new QualityDemyPage();

    @Given("Kullanici quality demy sayfasina gider")
    public void kullanici_quality_demy_sayfasina_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("myUrl"));
        ReusableMethods.bekle(2);
        demyPage.acceptCookies.click();

    }

    @When("Email ve password bilgilerini girerek giris yapmali")
    public void email_ve_password_bilgilerini_girerek_giris_yapmali() {
        demyPage.loginLink.click();
        demyPage.emailBox.sendKeys(ConfigReader.getProperty("myGecerliEmailInsBora"));
        demyPage.passwordBox.sendKeys(ConfigReader.getProperty("myGecerliPasswordInsBora"));
        demyPage.loginButton.click();

    }

    @Then("Basarili bir sekilde giris yaptigini test eder")
    public void basarili_bir_sekilde_giris_yaptigini_test_eder() {
        Assert.assertTrue(demyPage.demyPicture.isDisplayed());

    }

    @Then("Sayfayi kapatir")
    public void sayfayi_kapatir() {
        Driver.closeDriver();
    }

    @Then("Kullanici Quality Signup linkine tiklar")
    public void kullanici_quality_signup_linkine_tiklar() {
    demyPage.signUpLink.click();

    }

    @Then("Kullanici {string} e ismini yazar")
    public void kullanici_e_ismini_yazar(String string) {
    demyPage.firstNameBox.sendKeys(ConfigReader.getProperty("bora"));

    }

    @Then("Kullanici {string} e soyadini yazar")
    public void kullanici_e_soyadini_yazar(String string) {
    demyPage.lastNameBox.sendKeys(ConfigReader.getProperty("sverige"));

    }

}