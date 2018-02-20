$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("E:/myworkspace_selenium/BDDCucumbeDemo/src/main/java/features/hooks.feature");
formatter.feature({
  "line": 1,
  "name": "Hooks test",
  "description": "",
  "id": "hooks-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 671216,
  "status": "passed"
});
formatter.before({
  "duration": 354424,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "test1",
  "description": "",
  "id": "hooks-test;test1",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@first"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "first method",
  "keyword": "Given "
});
formatter.match({
  "location": "hooksdefinition.first_method()"
});
formatter.result({
  "duration": 241647429,
  "status": "passed"
});
formatter.after({
  "duration": 533004,
  "status": "passed"
});
formatter.after({
  "duration": 591163,
  "status": "passed"
});
formatter.before({
  "duration": 471425,
  "status": "passed"
});
formatter.before({
  "duration": 341425,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "test2",
  "description": "",
  "id": "hooks-test;test2",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 9,
      "name": "@second"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "second method",
  "keyword": "Given "
});
formatter.match({
  "location": "hooksdefinition.second_method()"
});
formatter.result({
  "duration": 432425,
  "status": "passed"
});
formatter.after({
  "duration": 312687,
  "status": "passed"
});
formatter.before({
  "duration": 715690,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "test3",
  "description": "",
  "id": "hooks-test;test3",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 15,
      "name": "@third"
    }
  ]
});
formatter.step({
  "line": 18,
  "name": "third method",
  "keyword": "Given "
});
formatter.match({
  "location": "hooksdefinition.third_method()"
});
formatter.result({
  "duration": 313371,
  "status": "passed"
});
formatter.after({
  "duration": 5223992,
  "status": "passed"
});
formatter.after({
  "duration": 694479,
  "status": "passed"
});
});