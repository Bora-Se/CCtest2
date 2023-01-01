
  Feature: Siteye Admin girisi
    @US21Admin
    Scenario: Test US21 icin

      Given Open browser go to url "AdminUrl"
      Then  Admin enters an "adminMail", a "password" and then clicks sign in link on admin page to login