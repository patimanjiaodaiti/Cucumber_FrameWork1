$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Features\\Search.feature");
formatter.feature({
  "name": "Testing search",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Regression"
    },
    {
      "name": "@User2"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Google search",
  "description": "",
  "keyword": "Scenario Template",
  "tags": [
    {
      "name": "@Google"
    }
  ]
});
formatter.step({
  "name": "go to \u0027https://www.google.com\u0027 website",
  "keyword": "When "
});
formatter.step({
  "name": "Enter \u0027\u003cProducts\u003e\u0027 in search box",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Products"
      ]
    },
    {
      "cells": [
        "apple"
      ]
    },
    {
      "cells": [
        "macBook"
      ]
    },
    {
      "cells": [
        "iphone"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Google search",
  "description": "",
  "keyword": "Scenario Template",
  "tags": [
    {
      "name": "@Regression"
    },
    {
      "name": "@User2"
    },
    {
      "name": "@Google"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "go to \u0027https://www.google.com\u0027 website",
  "keyword": "When "
});
formatter.match({
  "location": "SearchSteps.go_to_website(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter \u0027apple\u0027 in search box",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchSteps.enter_in_search_box(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Google search",
  "description": "",
  "keyword": "Scenario Template",
  "tags": [
    {
      "name": "@Regression"
    },
    {
      "name": "@User2"
    },
    {
      "name": "@Google"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "go to \u0027https://www.google.com\u0027 website",
  "keyword": "When "
});
formatter.match({
  "location": "SearchSteps.go_to_website(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter \u0027macBook\u0027 in search box",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchSteps.enter_in_search_box(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Google search",
  "description": "",
  "keyword": "Scenario Template",
  "tags": [
    {
      "name": "@Regression"
    },
    {
      "name": "@User2"
    },
    {
      "name": "@Google"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "go to \u0027https://www.google.com\u0027 website",
  "keyword": "When "
});
formatter.match({
  "location": "SearchSteps.go_to_website(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter \u0027iphone\u0027 in search box",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchSteps.enter_in_search_box(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});