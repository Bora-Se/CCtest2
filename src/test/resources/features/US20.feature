
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

      My Coupon sayfasindaki Add Coupons bölümündeki textBox'a kupon kodunun girilebilir oldugu dogrulanmali
    @US2003
    Scenario: 2003

      My Coupon sayfasindaki Add Coupons bölümündeki Add Coupon butonu ile textBox'a girilen kupon kodunun eklenebildigi dogrulanmli
    @US2004
    Scenario: 2004


      Collected Coupons listesinde toplanan kuponlar Coupon Value, Store Name, Coupon Code, Validity, Action bilgilerine gore listelendigi dogrulanmali
