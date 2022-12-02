
Feature: US0101 Quality Demy
  @demy
  Scenario: Kullanici basarili bir sekilde giris yapabilmeli
// Dikkat-- asagida yazdigimiz test senaryolarinda stepdefinitions olusturduktan sonra degisiklik yapamayiz. Unig degerler
    Given Kullanici quality demy sayfasina gider
    When  Email ve password bilgilerini girerek giris yapmali
    Then  Basarili bir sekilde giris yaptigini test eder
    Then  Sayfayi kapatir