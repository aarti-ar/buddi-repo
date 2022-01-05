$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/resources/features/homepage.feature");
formatter.feature({
  "line": 1,
  "name": "Buddi Homepage",
  "description": "",
  "id": "buddi-homepage",
  "keyword": "Feature"
});
formatter.before({
  "duration": 788900,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "To check that user able to click on Login tab from the home page",
  "description": "",
  "id": "buddi-homepage;to-check-that-user-able-to-click-on-login-tab-from-the-home-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user is on the buddi home page and verify the title \"Buddi Limited | Buddi: Personal Alarm Services For The Elderly\"",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user click on the Login tab on the homepage",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user should navigate to the Login Page and user has verify the text \"Welcome to your Buddi dashboard\"",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Buddi Limited | Buddi: Personal Alarm Services For The Elderly",
      "offset": 53
    }
  ],
  "location": "MyStepdefs.userIsOnTheBuddiHomePageAndVerifyTheTitle(String)"
});
formatter.result({
  "duration": 126885700,
  "error_message": "java.lang.NullPointerException\r\n\tat com.buddi.pages.HomePage.getHomePageTitle(HomePage.java:15)\r\n\tat com.buddi.MyStepdefs.userIsOnTheBuddiHomePageAndVerifyTheTitle(MyStepdefs.java:16)\r\n\tat ✽.Given user is on the buddi home page and verify the title \"Buddi Limited | Buddi: Personal Alarm Services For The Elderly\"(src/test/java/resources/features/homepage.feature:4)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "MyStepdefs.userClickOnTheLoginTabOnTheHomepage()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Welcome to your Buddi dashboard",
      "offset": 69
    }
  ],
  "location": "MyStepdefs.userShouldNavigateToTheLoginPageAndUserHasVerifyTheText(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 32300,
  "status": "passed"
});
});