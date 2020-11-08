$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Features/AutomationTestScenarios.feature");
formatter.feature({
  "line": 2,
  "name": "Automation Test Scenarios",
  "description": "",
  "id": "automation-test-scenarios",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Regression"
    }
  ]
});
formatter.background({
  "comments": [
    {
      "line": 4,
      "value": "#any steps which are repeated at the beginning of all scenarios in one feature can be placed"
    },
    {
      "line": 5,
      "value": "#under Background keyword and it will reduce code duplicate and writing same steps over and over"
    }
  ],
  "line": 6,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 7,
  "name": "User is on Retail website",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "User click on MyAccount",
  "keyword": "And "
});
formatter.match({
  "location": "LoginTestStepDefinition.user_is_on_Retail_website()"
});
formatter.result({
  "duration": 127689700,
  "error_message": "java.lang.NullPointerException\r\n\tat core.Base.initializeDriver(Base.java:101)\r\n\tat stepDefinitions.LoginTestStepDefinition.user_is_on_Retail_website(LoginTestStepDefinition.java:20)\r\n\tat ✽.Given User is on Retail website(Features/AutomationTestScenarios.feature:7)\r\n",
  "status": "failed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 11,
  "name": "Login to MyAccount",
  "description": "",
  "id": "automation-test-scenarios;login-to-myaccount",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 10,
      "name": "@login"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "User click on Login",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "User enter username \u0027sdet@tekschool.us\u0027 and password \u0027sdet\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "User click on Login button",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "User should be logged in to MyAccount dashboard",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginTestStepDefinition.user_click_on_Login()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "sdet@tekschool.us",
      "offset": 21
    },
    {
      "val": "sdet",
      "offset": 54
    }
  ],
  "location": "LoginTestStepDefinition.user_enter_username_sdet_tekschool_us_and_password_sdet(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginTestStepDefinition.user_click_on_Login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginTestStepDefinition.user_should_be_logged_in_to_MyAccount_dashboard()"
});
formatter.result({
  "status": "skipped"
});
formatter.background({
  "comments": [
    {
      "line": 4,
      "value": "#any steps which are repeated at the beginning of all scenarios in one feature can be placed"
    },
    {
      "line": 5,
      "value": "#under Background keyword and it will reduce code duplicate and writing same steps over and over"
    }
  ],
  "line": 6,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 7,
  "name": "User is on Retail website",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "User click on MyAccount",
  "keyword": "And "
});
formatter.match({
  "location": "LoginTestStepDefinition.user_is_on_Retail_website()"
});
formatter.result({
  "duration": 7269800,
  "error_message": "java.lang.NullPointerException\r\n\tat core.Base.initializeDriver(Base.java:101)\r\n\tat stepDefinitions.LoginTestStepDefinition.user_is_on_Retail_website(LoginTestStepDefinition.java:20)\r\n\tat ✽.Given User is on Retail website(Features/AutomationTestScenarios.feature:7)\r\n",
  "status": "failed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 18,
  "name": "Log  out from MyAccount",
  "description": "",
  "id": "automation-test-scenarios;log--out-from-myaccount",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 17,
      "name": "@Logout"
    }
  ]
});
formatter.step({
  "line": 19,
  "name": "User click on Login",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "User enter username \u0027sdet@tekschool.us\u0027 and password \u0027sdet\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "User click on Login button",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "User should be logged in to MyAccount dashboard",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "User click  on MyAccount",
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "User click on Logout",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "User Should be logged out from MyAccount dashboard",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginTestStepDefinition.user_click_on_Login()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "sdet@tekschool.us",
      "offset": 21
    },
    {
      "val": "sdet",
      "offset": 54
    }
  ],
  "location": "LoginTestStepDefinition.user_enter_username_sdet_tekschool_us_and_password_sdet(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginTestStepDefinition.user_click_on_Login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginTestStepDefinition.user_should_be_logged_in_to_MyAccount_dashboard()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginTestStepDefinition.user_click_on_MyAccount()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LogOutStepDef.user_click_on_Logout()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LogOutStepDef.user_Should_be_logged_out_from_MyAccount_dashboard(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.background({
  "comments": [
    {
      "line": 4,
      "value": "#any steps which are repeated at the beginning of all scenarios in one feature can be placed"
    },
    {
      "line": 5,
      "value": "#under Background keyword and it will reduce code duplicate and writing same steps over and over"
    }
  ],
  "line": 6,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 7,
  "name": "User is on Retail website",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "User click on MyAccount",
  "keyword": "And "
});
formatter.match({
  "location": "LoginTestStepDefinition.user_is_on_Retail_website()"
});
formatter.result({
  "duration": 9941100,
  "error_message": "java.lang.NullPointerException\r\n\tat core.Base.initializeDriver(Base.java:101)\r\n\tat stepDefinitions.LoginTestStepDefinition.user_is_on_Retail_website(LoginTestStepDefinition.java:20)\r\n\tat ✽.Given User is on Retail website(Features/AutomationTestScenarios.feature:7)\r\n",
  "status": "failed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 29,
  "name": "Add Products to Shopping Cart",
  "description": "",
  "id": "automation-test-scenarios;add-products-to-shopping-cart",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 28,
      "name": "@AddProductToCart"
    }
  ]
});
formatter.step({
  "line": 30,
  "name": "User click on product from the dropdown",
  "keyword": "When "
});
formatter.step({
  "line": 31,
  "name": "User click on the add to cart button",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "User see a message",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "User click on items",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "User click on view cart",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "user see list of added products available",
  "keyword": "Then "
});
formatter.match({
  "location": "AddToShoppingCartStepDef.user_click_on_product_from_the_dropdown(WebElement)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AddToShoppingCartStepDef.user_click_on_the_add_to_cart_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "location": "AddToShoppingCartStepDef.user_click_on_items()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AddToShoppingCartStepDef.user_click_on_view_cart()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AddToShoppingCartStepDef.user_see_list_of_added_products_available()"
});
formatter.result({
  "status": "skipped"
});
});