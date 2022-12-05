Feature: US1114 Quality Sign Up Pozitif Test
  @US1114
  Scenario: Kullanici dogru bilgileri girince sayfaya girmeli

    Given Kullanici quality demy sayfasina gider
    Then Kullanici Quality Signup linkine tiklar
    Then Kullanici "firstName" e ismini yazar
    Then Kullanici "lastName" e soyadini yazar
    When  Email ve password bilgilerini girerek giris yapmali
    Then  Basarili bir sekilde giris yaptigini test eder
    Then  Sayfayi kapatir