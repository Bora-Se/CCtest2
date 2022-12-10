package stepdefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import pages.AmazonPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class AmazonStepDefinitions {

    AmazonPage amazonPage = new AmazonPage();
    Actions actions = new Actions(Driver.getDriver());

    @Then("Kullanici amazon arama kutusunda {string} arama yapar")
    public void kullanici_amazon_arama_kutusunda_arama_yapar(String istenenMeyve) {
        amazonPage.amazonAramaKutusu.sendKeys(istenenMeyve + Keys.ENTER);

    }

    @Then("Kullanici arattigi {string} test eder")
    public void kullanici_arattigi_test_eder(String testMeyve) {
        Assert.assertTrue(amazonPage.amazonAramaSonucuTest.getText().contains(testMeyve));

    }

    @Then("Kullanici arama kutusundaki drop down menusunden {string} secer")
    public void kullaniciAramaKutusundakiDropDownMenusundenSecer(String istenilenMenu) {
        Select select = new Select(amazonPage.dropDownMenu);
        select.selectByVisibleText(istenilenMenu);

    }

    @Then("Kullanici dil bolumune gider ve change butonuna tiklar")
    public void kullanici_dil_bolumune_gider_ve_change_butonuna_tiklar() {

        //actions.moveToElement(amazonPage.languageSection).click(amazonPage.changeButtonChangeLanguage).perform();
        amazonPage.languageSection.click();

    }
    @Then("Kullanici Ayarlar kisminda para birimi olarak Turk Lirasini secer")
    public void kullanici_ayarlar_kisminda_para_birimi_olarak_turk_lirasini_secer() {
        amazonPage.selectCurrencyDrop.click();
        ReusableMethods.bekle(2);
        actions.sendKeys(Keys.END).click(amazonPage.tryBirimi).perform();

    }
    @Then("Kullanici yapilan degisikleri kaydeder")
    public void kullanici_yapilan_degisikleri_kaydeder() {
        amazonPage.saveChangesButton.click();
    }
    @Then("Kullanici urunlerin para birimi olarak Turk Lirasi oldugunu test eder")
    public void kullanici_urunlerin_para_birimi_olarak_turk_lirasi_oldugunu_test_eder() {
        Assert.assertTrue(amazonPage.paraBirimiTest.getText().contains("TRY"));
    }


    @Then("Kullanici sayfanin alt kismindan para birimi butonuna tiklar")
    public void kullaniciSayfaninAltKismindanParaBirimiButonunaTiklar() {
        actions.sendKeys(Keys.END).perform();
        amazonPage.usdButton.click();

    }

}