
Feature:

  Scenario:
  /*
      amazonPage.amazonAramaKutusu.sendKeys(ConfigReader.getProperty("amazonAramaKelimesi")+ Keys.ENTER);
      // sonuclarin arama yaptiginiz kelimeleri icerdigini test edin
      String expectedKelime=ConfigReader.getProperty("amazonAramaKelimesi");
      String actualAramaSonucu=amazonPage.aramasonucuElementi.getText();
      Assert.assertTrue(actualAramaSonucu.contains(expectedKelime));

      Faker faker=new Faker();
      FacebookPage facebook=new FacebookPage();
      facebook.cerezler.click();
      facebook.facebookEmail.sendKeys(faker.internet().emailAddress());
      facebook.facebookPassword.sendKeys(faker.internet().password());
      facebook.loginclick.click();
      Assert.assertTrue(facebook.facebooksifreDogrulama.isDisplayed());

  aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);


    SOFT ASSERT
    String expectedKelime="Amazon";
    String actualTitle=Driver.getDriver().getTitle();
    SoftAssert softAssert=new SoftAssert();
    softAssert.assertTrue(actualTitle.contains(expectedKelime),"baslik amazon icermiyor");
    String arananUrlKelime="wisequarter";
    String actualUrl= Driver.getDriver().getCurrentUrl();

    softAssert.assertTrue(actualUrl.contains(arananUrlKelime),"url wisequarter icermiyor");
    softAssert.assertAll();

-------------------------------  RELATIVE LOCATORS  --------------------------
  package day04_xpath;----public class C05_RelativeLocators {
  driver.get("https://www.diemol.com/selenium-4-demo/relative-locators-demo.html");

  // London un sagi ve Berlin in solu diye iki sekilde tarif edelim
  WebElement london= driver.findElement(By.id("pid5_price"));
  WebElement berlin= driver.findElement(By.id("pid7_price"));

  WebElement boston1= driver.findElement(RelativeLocator
  .with(By.tagName("p"))
  .toRightOf(london)
  .toLeftOf(berlin));

  System.out.println(boston1.getAttribute("id")); // pid6_price


  // Boston u, Toronto nun alti diyelim
  WebElement toronto= driver.findElement(By.id("pid2_price"));

  WebElement boston2= driver.findElement(RelativeLocator
  .with(By.className("ui-li-aside"))
  .below(toronto));

  System.out.println(boston2.getAttribute("id")); // pid6_price

  // Boston u, Mountie nin ustunde, amsterdam in oncesinde? diye tarif edelim
  WebElement mountie= driver.findElement(By.id("pid10_price"));
  WebElement amsterdam= driver.findElement(By.id("pid19_price"));

  WebElement boston3= driver.findElement(RelativeLocator
  .with(By.tagName("p"))
  .above(mountie));
  System.out.println(boston3.getAttribute("id")); // pid6_price
------------------------------------------------------------------------




    */