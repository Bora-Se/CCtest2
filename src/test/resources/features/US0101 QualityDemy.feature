
Feature: US0101 Quality Demy
  @demy
  Scenario: Kullanici basarili bir sekilde giris yapabilmeli

    Given Kullanici quality demy sayfasina gider
    When  Email ve password bilgilerini girerek giris yapmali
    Then  Basarili bir sekilde giris yaptigini test eder
    Then  Sayfayi kapatir