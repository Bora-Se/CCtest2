#US18 As a user, I would like to have a page where I can see the order details in order to follow the latest status of my orders.
#1802- Sections on the Order Details page must be seen
#1803- Must be tested to see Order Details
#1804- Access to Order Details
#1805- Cancel Order button should work
#1806- Functions of Cancel Order button should be used
#1807- Shipping, invoice and payment information should be accessed in the Order Details.

  Feature: US18- There should be a page where Order Details can be seen
@1801
    Scenario: 1801- Order Details page must be reached

    Given Open browser go to url "myUrl"
    Then  User clicks on the login link, enters "mail" and "password" and logs in.
    Then  User clicks on dashboard link
    Then  User clicks My Order section on dashboard page
    Then  User verifies that the Order Details page is accessible
    Then  User closes the page

