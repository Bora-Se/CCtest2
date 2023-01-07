
  Feature: Siteye Admin girisi
    @US5201
    Scenario: Test US52 icin

      Given Open browser go to url "AdminUrl"
      Then  Admin enters an "adminBoraMail", a "password" and then clicks sign in link on admin page to login
