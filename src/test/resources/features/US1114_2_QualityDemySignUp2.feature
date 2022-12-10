Feature: US1115 Sign Up Testi
  @US1114-2
  Scenario Outline: Kullanici yanlis formatta bilgiler girdiginde uyelik hesabi olusturamamali
    Given Kullanici "myUrl" sayfasina gider
    Then Kullanici Quality Demy login sayfasinda sign up linkine tiklar
    Then Kullanici first name boxa "<istenen isim>" gonderir
    Then Kullanici last name boxa "<istenen soyisim>" gonderir
    Then Kullanici email boxa "<istenen mail>" gonderir
    Then Kullanici password boxa "<istenen password>" gonderir
    Then Kullanici Quality Demy sign up sayfasinda sign up butonuna tiklar
    Then Kullanici uye hesabi olusturamadigini test eder
    And Sayfayi kapatir
    Examples:
      |istenen isim| istenen soyisim | istenen mail | istenen password |
      | a  | bb | a@gmail.com  | Password12. |
      | aa | b | abd@gmail.com | Password12. |
      | aa | bb | ab@gmail     | Password12. |
      | aa | bb | ab@com       | Password12. |
      | aa | bb | abgmail      | Password12. |
      | aa | bb | ab@gmail@com | Password12. |
      | aa | bb | ab@gmailcom  | Password12. |
      | aa | bb | abcde@gmail.com     | 123456      |
      | aa | bb | abcdef@gmail.com    | Password12  |
      | aa | bb | abcdefg@gmail.com   | password12. |
      | aa | bb | abcdefgh@gmail.com  | Password.   |
      | aa | bb | abcdefghi@gmail.com | 123456.     |
      | aa | bb | abcdefghi@gmail.com | Pa12.       |
