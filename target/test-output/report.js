$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("E:/SeleniumTeaching/CodeDemo/CucumberFrameWork/src/main/java/features/Tables.feature");
formatter.feature({
  "line": 1,
  "name": "Table Handling",
  "description": "",
  "id": "table-handling",
  "keyword": "Feature"
});
formatter.before({
  "duration": 6381525400,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Verify text from table",
  "description": "",
  "id": "table-handling;verify-text-from-table",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@VerifyText"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "navigated to w3school url",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "verify \"Centro comercial Moctezuma\" text from example table",
  "keyword": "Then "
});
formatter.match({
  "location": "TablesStepDefinition.navigateURL()"
});
formatter.result({
  "duration": 3027333200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Centro comercial Moctezuma",
      "offset": 8
    }
  ],
  "location": "TablesStepDefinition.verifyText(String)"
});
formatter.result({
  "duration": 853423400,
  "status": "passed"
});
formatter.after({
  "duration": 750089400,
  "status": "passed"
});
});