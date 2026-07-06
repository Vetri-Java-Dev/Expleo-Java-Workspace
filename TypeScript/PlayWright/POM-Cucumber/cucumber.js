module.exports = {
  default: {
  formatOptions: {
    snippetInterface: "async-await"
  },

  requireModule: [
    "ts-node/register"
  ],

  require: [
    "src/test/world/**/*.ts",
    "src/test/hooks/**/*.ts",
    "src/test/steps/**/*.ts"
  ],

  paths: [
    "src/test/feature/**/*.feature"
  ],

  publishQuiet: true,
  dryRun: false,

  format: [
    "progress-bar",
    "json:reports/cucumber_json/cucumber-report.json",
    "html:reports/cucumber-html/cucumber-report.html",
    "rerun:@rerun.txt"
  ]
}
};