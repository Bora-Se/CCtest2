package stepdefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.QualityDemyPage;

public class QualityDemySignupStepDefinitions2 {
    QualityDemyPage demyPage= new QualityDemyPage();
    @Then("Kullanici Quality Demy login sayfasinda sign up linkine tiklar")
    public void kullanici_quality_demy_login_sayfasinda_sign_up_linkine_tiklar() {
        demyPage.acceptCookies.click();
        demyPage.signupLink.click();
    }
    @Then("Kullanici first name boxa {string} gonderir")
    public void kullanici_first_name_boxa_gonderir(String isim) {
        demyPage.firstnameBox.sendKeys(isim);
    }
    @Then("Kullanici last name boxa {string} gonderir")
    public void kullanici_last_name_boxa_gonderir(String soyisim) {
        demyPage.lastnameBox.sendKeys(soyisim);
    }
    @Then("Kullanici email boxa {string} gonderir")
    public void kullanici_email_boxa_gonderir(String email) {
        demyPage.signupEmailBox.sendKeys(email);
    }
    @Then("Kullanici password boxa {string} gonderir")
    public void kullanici_password_boxa_gonderir(String password) {
        demyPage.signupPasswordBox.sendKeys(password);
    }
    @Then("Kullanici Quality Demy sign up sayfasinda sign up butonuna tiklar")
    public void kullanici_quality_demy_sign_up_sayfasinda_sign_up_butonuna_tiklar() {
        demyPage.signupButton.click();
    }
    @Then("Kullanici uye hesabi olusturamadigini test eder")
    public void kullanici_uye_hesabi_olusturamadigini_test_eder() {
        Assert.assertTrue(demyPage.hataMesaji.isDisplayed());
        System.out.println(demyPage.hataMesaji.getText());
    }
}