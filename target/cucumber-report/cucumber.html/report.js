$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("onlineshopping.feature");
formatter.feature({
  "line": 1,
  "name": "SignUp, Sign In and Purchase Product",
  "description": "",
  "id": "signup,-sign-in-and-purchase-product",
  "keyword": "Feature"
});
formatter.before({
  "duration": 7367532200,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "TC-003 Add product to Online Cart and checkout",
  "description": "",
  "id": "signup,-sign-in-and-purchase-product;tc-003-add-product-to-online-cart-and-checkout",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 14,
      "name": "@test"
    }
  ]
});
formatter.step({
  "line": 16,
  "name": "I am on the Sign In Page",
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "Login using newly create credentials",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "I add below product to cart",
  "rows": [
    {
      "cells": [
        "category",
        "subCategory",
        "name",
        "model",
        "quantity"
      ],
      "line": 19
    },
    {
      "cells": [
        "Dresses",
        "CASUAL DRESSES",
        "Printed Dress",
        "demo_3",
        "2"
      ],
      "line": 20
    },
    {
      "cells": [
        "Women",
        "TOPS",
        "Faded Short Sleeve T-shirts",
        "demo_1",
        "3"
      ],
      "line": 21
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "I shall validate shopping cart as below",
  "rows": [
    {
      "comments": [
        {
          "line": 23,
          "value": "# | name                        | model        | quantity |"
        }
      ],
      "cells": [
        "Printed Dress",
        "SKU : demo_3",
        "2"
      ],
      "line": 24
    },
    {
      "cells": [
        "Faded Short Sleeve T-shirts",
        "SKU : demo_1",
        "3"
      ],
      "line": 25
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "I shall be able to Buy the product",
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "I shall be able to Buy using cheque payment",
  "keyword": "And "
});
formatter.match({
  "location": "SigInSteps.iAmOnTheSignInPage()"
});
formatter.result({
  "duration": 3310249400,
  "status": "passed"
});
formatter.match({
  "location": "SigInSteps.loginUsingNewlyCreateCredentials()"
});
formatter.result({
  "duration": 2531037600,
  "status": "passed"
});
formatter.match({
  "location": "ProductSteps.iAddBelowProductToCart(DataTable)"
});
formatter.result({
  "duration": 11203802900,
  "status": "passed"
});
formatter.match({
  "location": "ProductSteps.iShallValidateShoppingCartAsBelow(DataTable)"
});
formatter.result({
  "duration": 6961504300,
  "status": "passed"
});
formatter.match({
  "location": "ProductSteps.iShallBeAbleToBuyTheProduct()"
});
formatter.result({
  "duration": 13746898200,
  "status": "passed"
});
formatter.match({
  "location": "ProductSteps.iShallBeAbleToBuyUsingChequePayment()"
});
formatter.result({
  "duration": 10613727900,
  "status": "passed"
});
formatter.after({
  "duration": 603055000,
  "status": "passed"
});
formatter.before({
  "duration": 5824742800,
  "status": "passed"
});
formatter.scenario({
  "line": 29,
  "name": "TC-004 Contact customer service for the previous successful order",
  "description": "",
  "id": "signup,-sign-in-and-purchase-product;tc-004-contact-customer-service-for-the-previous-successful-order",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 28,
      "name": "@test"
    }
  ]
});
formatter.step({
  "line": 30,
  "name": "I am on the Sign In Page",
  "keyword": "Given "
});
formatter.step({
  "line": 31,
  "name": "Login using newly create credentials",
  "keyword": "When "
});
formatter.step({
  "line": 32,
  "name": "I am on the contact page",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "I send refund request to customer care for previous order",
  "keyword": "Then "
});
formatter.match({
  "location": "SigInSteps.iAmOnTheSignInPage()"
});
formatter.result({
  "duration": 4034269000,
  "status": "passed"
});
formatter.match({
  "location": "SigInSteps.loginUsingNewlyCreateCredentials()"
});
formatter.result({
  "duration": 3593839200,
  "status": "passed"
});
formatter.match({
  "location": "ContactSteps.iAmOnTheContactPage()"
});
formatter.result({
  "duration": 7505796800,
  "status": "passed"
});
formatter.match({
  "location": "ContactSteps.iSendRefundRequestToCustomerCareForPreviousOrder()"
});
formatter.result({
  "duration": 31143127600,
  "status": "passed"
});
formatter.after({
  "duration": 576227300,
  "status": "passed"
});
});