module.exports = {
  register: {
    requireModule: ["ts-node/register"],

    require: [
      "src/test/hooks/**/*.ts",
      "src/test/steps/**/*.ts"
    ],

    paths: [
      "src/test/feature/register.feature"
    ],

    formatOptions: {
      snippetInterface: "async-await"
    },

    format: [
      "progress-bar",
      "json:reports/cucumber-report/register.json",
      "html:reports/html-report/register.html"
    ],

    publishQuiet: true,
    parallel: 1
  },

  login: {
    requireModule: ["ts-node/register"],

    require: [
      "src/test/hooks/**/*.ts",
      "src/test/steps/**/*.ts"
    ],

    paths: [
      "src/test/feature/login.feature"
    ],

    formatOptions: {
      snippetInterface: "async-await"
    },

    format: [
      "progress-bar",
      "json:reports/cucumber-report/login.json",
      "html:reports/html-report/login.html"
    ],

    publishQuiet: true,
    parallel: 1
  }
};