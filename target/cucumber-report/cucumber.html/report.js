$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("onlineshopping.feature");
formatter.feature({
  "line": 1,
  "name": "SignUp, Sign In and Purchase Product",
  "description": "",
  "id": "signup,-sign-in-and-purchase-product",
  "keyword": "Feature"
});
formatter.before({
  "duration": 13911205700,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "TC-003 Add product to Online Cart and checkout",
  "description": "",
  "id": "signup,-sign-in-and-purchase-product;tc-003-add-product-to-online-cart-and-checkout",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 13,
      "name": "@test"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "I am on the Sign In Page",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "Login using newly create credentials",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "I add below product to cart",
  "rows": [
    {
      "comments": [
        {
          "line": 18,
          "value": "#| category | subCategory    | name                        | model  | quantity |"
        }
      ],
      "cells": [
        "Dresses",
        "CASUAL DRESSES",
        "Printed Dress",
        "demo_3",
        "2"
      ],
      "line": 19
    },
    {
      "cells": [
        "Women",
        "TOPS",
        "Faded Short Sleeve T-shirts",
        "demo_1",
        "3"
      ],
      "line": 20
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I shall validate shopping cart as below",
  "rows": [
    {
      "comments": [
        {
          "line": 22,
          "value": "# | name                        | model        | quantity |"
        }
      ],
      "cells": [
        "Printed Dress",
        "SKU : demo_3",
        "2"
      ],
      "line": 23
    },
    {
      "cells": [
        "Faded Short Sleeve T-shirts",
        "SKU : demo_1",
        "3"
      ],
      "line": 24
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "I shall be able to Buy the product",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "I shall be able to Buy using cheque payment",
  "keyword": "And "
});
formatter.match({
  "location": "SigInSteps.iAmOnTheSignInPage()"
});
formatter.result({
  "duration": 11879486000,
  "status": "passed"
});
formatter.match({
  "location": "SigInSteps.loginUsingNewlyCreateCredentials()"
});
formatter.result({
  "duration": 17901780100,
  "status": "passed"
});
formatter.match({
  "location": "ProductSteps.iAddBelowProductToCart(DataTable)"
});
formatter.result({
  "duration": 62462868900,
  "status": "passed"
});
formatter.match({
  "location": "ProductSteps.iShallValidateShoppingCartAsBelow(DataTable)"
});
formatter.result({
  "duration": 124351700,
  "status": "passed"
});
formatter.match({
  "location": "ProductSteps.iShallBeAbleToBuyTheProduct()"
});
formatter.result({
  "duration": 3779654300,
  "status": "passed"
});
formatter.match({
  "location": "ProductSteps.iShallBeAbleToBuyUsingChequePayment()"
});
formatter.result({
  "duration": 6425886200,
  "status": "passed"
});
formatter.after({
  "duration": 606967100,
  "status": "passed"
});
});