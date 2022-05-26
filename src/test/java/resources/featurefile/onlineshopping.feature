Feature: SignUp, Sign In and Purchase Product

  Scenario: TC-001 Create New User/SignUp
    Given I am on home page
    Then Navigate to SignUp page
    And create an account with random username

  Scenario: TC-002 Sign In with newly created user credentials
    Given I am on the Sign In Page
    When Login using newly create credentials
    Then I shall verify the address information in my address section

  @test
  Scenario: TC-003 Add product to Online Cart and checkout
    Given I am on the Sign In Page
    When Login using newly create credentials
    And I add below product to cart
      | category | subCategory    | name                        | model  | quantity |
      | Dresses  | CASUAL DRESSES | Printed Dress               | demo_3 | 2        |
      | Women    | TOPS           | Faded Short Sleeve T-shirts | demo_1 | 3        |
    Then I shall validate shopping cart as below
     # | name                        | model        | quantity |
      | Printed Dress               | SKU : demo_3 | 2 |
      | Faded Short Sleeve T-shirts | SKU : demo_1 | 3 |
    Then I shall be able to Buy the product
    And I shall be able to Buy using cheque payment

  Scenario: TC-004 Contact customer service for the previous successful order
    Given I am on the Sign In Page
    When Login using newly create credentials
    And I am on the contact page
    Then I send refund request to customer care for previous order