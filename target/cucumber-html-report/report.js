$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/LaunchGoogle.feature");
formatter.feature({
  "name": "Launch Google Page",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Verify Google Page Successful Login",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "browser is opened",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "\"http://www.google.com\" is accessed",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user see google home page",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});