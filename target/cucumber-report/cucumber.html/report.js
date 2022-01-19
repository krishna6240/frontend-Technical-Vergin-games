$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 1,
  "name": "Login page navigate functionality",
  "description": "As a customer\r\nI want to visit virgingames website",
  "id": "login-page-navigate-functionality",
  "keyword": "Feature"
});
formatter.before({
  "duration": 7338221200,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "User should verify login button is displayed",
  "description": "",
  "id": "login-page-navigate-functionality;user-should-verify-login-button-is-displayed",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I am on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I should see \"Log In\" displayed in one of the button",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepdefs.iAmOnHomePage()"
});
formatter.result({
  "duration": 250227300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Log In",
      "offset": 14
    }
  ],
  "location": "LoginStepdefs.iShouldSeeDisplayedInOneOfTheButton(String)"
});
formatter.result({
  "duration": 329176000,
  "status": "passed"
});
formatter.after({
  "duration": 777610400,
  "status": "passed"
});
});