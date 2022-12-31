
  @US20
  Feature: US20
    @US2001
    Scenario: 2001

      Given Open browser go to url "myUrl"
      Then  User clicks on the login link, enters "mail" and "password" and logs in.
      Then  User clicks on dashboard link
      Then  User clicks My Coupons section on dashboard page
      Then  User confirms that the My Coupon page is accessible
      Then  User closes the page

       # My Coupon sayfasinin erisilebilir oldugu dogrulanmali
    @US2002
    Scenario: 2002

      Given Open browser go to url "myUrl"
      Then  User clicks on the login link, enters "mail" and "password" and logs in.
      Then  User clicks on dashboard link
      Then  User clicks My Coupons section on dashboard page
      Then  User verifies that the coupon code can be entered in the textBox in the Add Coupons section of the My Coupon page
      Then  User closes the page

       # My Coupon sayfasindaki Add Coupons bölümündeki textBox'a kupon kodunun girilebilir oldugu dogrulanmali
    @US2003
    Scenario: 2003

      Given Open browser go to url "myUrl"
      Then  User clicks on the login link, enters "mail" and "password" and logs in.
      Then  User clicks on dashboard link
      Then  User clicks My Coupons section on dashboard page
      Then  User verifies that the coupon code can be added with the Add Coupon button on the My Coupons page
      Then  User closes the page

       # My Coupon sayfasindaki Add Coupons bölümündeki Add Coupon butonu ile textBox'a girilen kupon kodunun eklenebildigi dogrulanmli
    @US2004
    Scenario: 2004

      Given Open browser go to url "myUrl"
      Then  User clicks on the login link, enters "mail" and "password" and logs in.
      Then  User clicks on dashboard link
      Then  User clicks My Coupons section on dashboard page
      Then  User verifies which information the Collected Coupons list is listed
      Then  User closes the page

       # Collected Coupons listesinde toplanan kuponlar Coupon Value, Store Name, Coupon Code, Validity, Action
         # bilgilerine gore listelendigi dogrulanmali
