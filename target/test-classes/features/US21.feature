
  @US21
  Feature: US21 Refund&Dispute page and functions test
    @US2101
    Scenario: 2101 Accessibility test of Refund & Dispute page

      Given Open browser go to url "userUrl"
      Then  User clicks on the login link, enters "boramail" and "password" and logs in.
      Then  User clicks on dashboard link
      Then  User clicks My section on dashboard page
      Then  User
      Then  User closes the page
       # Refund & Dispute sayfasinin erisilebilir oldugu dogrulanmali

    @US2102
    Scenario: 2102 Visibility test of the products to be returned in Refund List

      Given Open browser go to url "userUrl"
      Then  User clicks on the login link, enters "boramail" and "password" and logs in.
      Then  User clicks on dashboard link
      Then  UUser clicks My section on dashboard page
      Then  User
      Then  User closes the page
       # Acilan sayfada Refund List'te iade islemi baslatilan ürünlerin görüntülendigi dogrulanmali

    @US2103
    Scenario: 2103 Visibility test of the information of the products to be returned in the Refund List

      Given Open browser go to url "userUrl"
      Then  User clicks on the login link, enters "boramail" and "password" and logs in.
      Then  User clicks on dashboard link
      Then  User clicks My section on dashboard page
      Then  User
      Then  User closes the page
       # Refund List'te Order ID, Order Date, Status, Request Sent Date, Order Amount, Refund Method ve Shipping Method bilgilerinin görünür oldugu dogrulanmali

    @US2101
    Scenario: 2104 Visibility test of tracking of products in Refund List with View Details button

      Given Open browser go to url "userUrl"
      Then  User clicks on the login link, enters "boramail" and "password" and logs in.
      Then  User clicks on dashboard link
      Then  User clicks My section on dashboard page
      Then  User
      Then  User closes the page
       # View Details butonu ile acilan details sayfasinda iade istemi acilan siparisin güncel durumunun görüntülenebildigi dogrulanmali

    @US2105
    Scenario: 2105 Start, Processing and Complete status test on the opened details page

      Given Open browser go to url "userUrl"
      Then  User clicks on the login link, enters "boramail" and "password" and logs in.
      Then  User clicks on dashboard link
      Then  User clicks My section on dashboard page
      Then  User
      Then  User closes the page
       # Acilan details sayfada Start, Processing ve Complete durumlarindan en az birinin aktif oldugu dogrulanmali

    @US2106
    Scenario: 2106 Test of Start, Processing and Complete Texts on the opened details page

      Given Open browser go to url "userUrl"
      Then  User clicks on the login link, enters "boramail" and "password" and logs in.
      Then  User clicks on dashboard link
      Then  User clicks My section on dashboard page
      Then  User
      Then  User closes the page
       # Acilan details sayfada Start, Processing ve Complete durumlarinin aciklamalarini iceren Text'lerin görünür oldugu dogrulanmali

    @US2107
    Scenario: 2107 Visibility test of Pick Up Info information on the opened details page

      Given Open browser go to url "userUrl"
      Then  User clicks on the login link, enters "boramail" and "password" and logs in.
      Then  User clicks on dashboard link
      Then  User clicks My section on dashboard page
      Then  User
      Then  User closes the page
       # Acilan details sayfasinda Pick Up Info bilgilerinin görüntülendigi dogrulanmali
