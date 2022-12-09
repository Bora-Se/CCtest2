package stepdefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;

public class AmazonStepDefinitions {

    AmazonPage amazonPage = new AmazonPage();

    @Then("Kullanici amazon arama kutusunda {string} arama yapar")
    public void kullanici_amazon_arama_kutusunda_arama_yapar(String istenenMeyve) {
    amazonPage.amazonAramaKutusu.sendKeys(istenenMeyve + Keys.ENTER);

    }
    @Then("Kullanici arattigi {string} test eder")
    public void kullanici_arattigi_test_eder(String testMeyve) {
        Assert.assertTrue(amazonPage.amazonAramaSonucuTest.getText().contains(testMeyve));

    }

}
