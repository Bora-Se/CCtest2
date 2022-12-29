   #US18 As a user, I would like to have a page where I can see the order details in order to follow the latest status of my orders.

  Feature: US1800- There should be a page where Order Details can be seen
     @1801
    Scenario: US1801- Test to reach the Order Details page

        Given Open browser go to url "myUrl"
        Then  User clicks on the login link, enters "mail" and "password" and logs in.
        Then  User clicks on dashboard link
        Then  User clicks My Order section on dashboard page
        Then  User verifies that the Order Details page is accessible
        Then  User closes the page
     # 1801- My Order sayfasindaki urun boardindan Order Details butonuna tiklayinca ilgili siparisin detay sayfasina gidildigi dogrulanmali.
     @1802
    Scenario: US_1802- Sections Test on Order Details page

        Given Open browser go to url "myUrl"
        Then  User clicks on the login link, enters "mail" and "password" and logs in.
        Then  User clicks on dashboard link
        Then  User clicks My Order section on dashboard page
        Then  User verifies that sections on the Order Details page appear
        Then  User closes the page

        #  1802- Order Details sayfasinda ilgili siparis ile ilgili, Order ID, Status, Order date,
        #  Order Amount, Package, Price, Est arrival date,TAX Amount bilgilerinin goruntulendigi dogrulanmali
     @1803
    Scenario: 1803- Visibility of Order Details

        Given Open browser go to url "myUrl"
        Then  User clicks on the login link, enters "mail" and "password" and logs in.
        Then  User clicks on dashboard link
        Then  User clicks My Order section on dashboard page
        Then  User verifies that sections, stages appear on the Order Details page
        Then  User closes the page

        # 1803- Order Details sayfasinda ilgili siparis süreci ile ilgili;
        # Pending, Processing, Shipped, Recieved, Delivered asamalari görünür oldugu dogrulanmali.
     @1804
    Scenario: 1804- Access to Order Details

        Given Open browser go to url "myUrl"
        Then  User clicks on the login link, enters "mail" and "password" and logs in.
        Then  User clicks on dashboard link
        Then  User clicks My Order section on dashboard page
        Then  User verifies that text about the order is visible on the Order Details page
        Then  User closes the page

        # 1804- Order Details sayfasinda; Pending, Processing, Shipped, Recieved, Delivered
        #  asamalarinin aciklamalarini iceren textlerin görünür oldugu dogrulanmali.

     @1805
    Scenario: 1805- Status of Cancel Order button

       Given Open browser go to url "myUrl"
       Then  User clicks on the login link, enters "mail" and "password" and logs in.
       Then  User clicks on dashboard link
       Then  User clicks My Order section on dashboard page
       Then  User verifies that the Cancel Order button on the Order Details page is available
       Then  User closes the page

     # 1805- My Order sayfasindaki Cancel Order butonunun Cancel sekmesine yönlendirme yaptigi dogrulanmali.

     @1806
     Scenario: 1806- Functions of Cancel Order button

       Given Open browser go to url "myUrl"
       Then  User clicks on the login link, enters "mail" and "password" and logs in.
       Then  User clicks on dashboard link
       Then  User clicks My Order section on dashboard page
       Then  User verifies that the Reason box and Send button are available when the Cancel Order button on the Order Details page is pressed
       Then  User closes the page

      # 1806- Cancel sekmesindeki Reason textbox'inin aktif oldugu ve send butonuna tiklaninca girilen order'in iptal edildigi dogrulanmali.

     @1807
     Scenario: 1807- Shipping, Billing and Payment information in Order Details



     # 1807- Order Details sayfasinda ürünle ilgili Shipping Info, Billing Info, Payment Info bilgilerine erisilebilir oldugu dogrulanmali