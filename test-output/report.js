$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("D:/java programs/BDDdemo/src/main/java/Feature/Homepage.feature");
formatter.feature({
  "line": 1,
  "name": "AutomationPractice validat the  New user Email Address",
  "description": "",
  "id": "automationpractice-validat-the--new-user-email-address",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 2,
      "value": "#without Examples Keword"
    },
    {
      "line": 3,
      "value": "#Scenario: verify the New User Login Email"
    },
    {
      "line": 5,
      "value": "#Given user Prescent on the homePage"
    },
    {
      "line": 6,
      "value": "#When Title of the HomePage is My Store"
    },
    {
      "line": 7,
      "value": "#Then user click on SignIn button"
    },
    {
      "line": 11,
      "value": "#Then Login Page title is Login - My Store"
    },
    {
      "line": 12,
      "value": "#Then user enter New Email address \"raviteja123@gmail.com\" for Creating New User Account and click on Create account Button"
    },
    {
      "line": 13,
      "value": "#Then user landing  on New user Create Account Page"
    }
  ],
  "line": 15,
  "name": "verify the New User Login Email",
  "description": "",
  "id": "automationpractice-validat-the--new-user-email-address;verify-the-new-user-login-email",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 17,
  "name": "user Prescent on the homePage",
  "keyword": "Given "
});
formatter.step({
  "line": 18,
  "name": "Title of the HomePage is My Store",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "user click on SignIn button",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "Login Page title is Login - My Store",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "user enter New Email address \"\u003cemail\u003e\" for Creating New User Account and click on Create account Button",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "user landing on New user Create Account Page",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "close the browser",
  "keyword": "Then "
});
formatter.examples({
  "line": 25,
  "name": "",
  "description": "",
  "id": "automationpractice-validat-the--new-user-email-address;verify-the-new-user-login-email;",
  "rows": [
    {
      "cells": [
        "email"
      ],
      "line": 26,
      "id": "automationpractice-validat-the--new-user-email-address;verify-the-new-user-login-email;;1"
    },
    {
      "cells": [
        "raviteja123@gmail.com"
      ],
      "line": 27,
      "id": "automationpractice-validat-the--new-user-email-address;verify-the-new-user-login-email;;2"
    },
    {
      "cells": [
        "satish21@gmail.com"
      ],
      "line": 28,
      "id": "automationpractice-validat-the--new-user-email-address;verify-the-new-user-login-email;;3"
    },
    {
      "cells": [
        "ram4321@gmail.com"
      ],
      "line": 29,
      "id": "automationpractice-validat-the--new-user-email-address;verify-the-new-user-login-email;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 25245788075,
  "status": "passed"
});
formatter.before({
  "duration": 186088,
  "status": "passed"
});
formatter.scenario({
  "line": 27,
  "name": "verify the New User Login Email",
  "description": "",
  "id": "automationpractice-validat-the--new-user-email-address;verify-the-new-user-login-email;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 17,
  "name": "user Prescent on the homePage",
  "keyword": "Given "
});
formatter.step({
  "line": 18,
  "name": "Title of the HomePage is My Store",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "user click on SignIn button",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "Login Page title is Login - My Store",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "user enter New Email address \"raviteja123@gmail.com\" for Creating New User Account and click on Create account Button",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "user landing on New user Create Account Page",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "homePageStepDefination.user_Prescent_On_homePage()"
});
formatter.result({
  "duration": 16233868124,
  "status": "passed"
});
formatter.match({
  "location": "homePageStepDefination.Title_of_the_HomePage()"
});
formatter.result({
  "duration": 34982085,
  "status": "passed"
});
formatter.match({
  "location": "homePageStepDefination.user_click_on_SignIn_button()"
});
formatter.result({
  "duration": 3578796182,
  "status": "passed"
});
formatter.match({
  "location": "homePageStepDefination.login_Page_title_is_Login_My_Store()"
});
formatter.result({
  "duration": 6043253,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "raviteja123@gmail.com",
      "offset": 30
    }
  ],
  "location": "homePageStepDefination.user_enter_New_Email_address_for_Creating_New_User_Account_and_click_on_Create_account_Button(String)"
});
formatter.result({
  "duration": 3042500681,
  "status": "passed"
});
formatter.match({
  "location": "homePageStepDefination.user_landing_on_New_user_Create_Account_Page()"
});
formatter.result({
  "duration": 3668112023,
  "status": "passed"
});
formatter.match({
  "location": "homePageStepDefination.close_the_browser()"
});
formatter.result({
  "duration": 2967010399,
  "status": "passed"
});
formatter.after({
  "duration": 94587,
  "status": "passed"
});
formatter.after({
  "duration": 562879952,
  "status": "passed"
});
formatter.before({
  "duration": 13837310762,
  "status": "passed"
});
formatter.before({
  "duration": 73510,
  "status": "passed"
});
formatter.scenario({
  "line": 28,
  "name": "verify the New User Login Email",
  "description": "",
  "id": "automationpractice-validat-the--new-user-email-address;verify-the-new-user-login-email;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 17,
  "name": "user Prescent on the homePage",
  "keyword": "Given "
});
formatter.step({
  "line": 18,
  "name": "Title of the HomePage is My Store",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "user click on SignIn button",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "Login Page title is Login - My Store",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "user enter New Email address \"satish21@gmail.com\" for Creating New User Account and click on Create account Button",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "user landing on New user Create Account Page",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "homePageStepDefination.user_Prescent_On_homePage()"
});
