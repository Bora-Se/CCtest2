
@US18
  Feature: US19 Wallet to be used in shopping and its functions
    @US1902
    Scenario: 1901 My Wallet link on the Dashboard page
      Given Open browser go to url "myUrl"
      Then  User clicks on the login link, enters "mail" and "password" and logs in.
      Then  User clicks on dashboard link
      Then  User clicks My Wallet section on dashboard page
      Then  User verifies that the My Wallet link in the sidebar on the Dashboard page is accessible
      Then  User closes the page

      #Dashboard sayfasinda bulunan side bar'daki My Wallet linkinin Wallet sayfasina yönlendirdigi dogrulanmali

    @US1902
    Scenario: 1902 Total Balance, Running Balance, Pending Balance sections on My Wallet page

      My Wallet sayfasinda Total Balance, Running Balance, Pending Balance boardlarinin görünür oldugu dogrulanmali.
    @US1903
    Scenario: 1903 Recharge Wallet button on My Wallet page

      My Wallet sayfasinda Recharge Wallet butonunun görünür oldugu ve Recharge Amount sekmesine yönlendirdigi dogrulanmali.
    @US1904
    Scenario: 1904 TextBox in Recharge Amount tab


      Recharge Amount sekmesinde tutar girebilebilen bir TextBox'in oldugu dogrulanmali
    @US1905
    Scenario: 1905 Cancel button in Recharge Amount tab

      Islemi iptal etmek icin Recharge Amount sekmesindeki Cancel butonunun görünür oldugu ve iptal islemini yapabildigi dogrulanmali.
    @US1906
    Scenario: 1906 TextBox and Add Fund button on Recharge Amount tab


      Recharge Amount sekmesindeki TextBox'a girilen tutari Wallet'a eklemek icin Add Fund butonunun görünür oldugu ve ilgili sayfaya yönlendirdigi dogrulanmali
    @US1907
    Scenario: 1907 In the Wallet Recharge History list on the My Wallet page, Date, Trx Id, Amount, Type, Payment Method, Status columns



      My Wallet sayfasinda Wallet Recharge History listesinde Date, Trx Id, Amount, Type, Payment Method, Status sütunlarinin oldugu dogrulanmali
    @US1908
    Scenario: 1908 Wallet transactions listed in Wallet Recharge History on My Wallet



      My Wallet sayfasinda Wallet Recharge History listesinde Cüzdan hareketlerinin varligi dogrulanmali



