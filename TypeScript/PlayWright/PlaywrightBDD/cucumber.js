module.exports={
    default:{

        "formatOptions":{
            "snippetInterface":"async-await"
        },
        
        requireModule:[
            "ts-node/register"
        ],

        require:[
            "src/test/steps/**/*.ts",
            "src/hooks/**/*.ts",
        ],

        paths:[
            "src/test/features/**/*.feature"
        ],

        publishQuiet:true,
        dryRun:false,
        
        format:[
            "progress-bar",
            "json:report/cucumber-report.json",
            "html:report/cucumber-html.html",
            "rerun:@rerun.txt"
        ]
    },

    rerun: {
    requireModule: ["ts-node/register"],
    require: [
      "src/hooks/**/*.ts",
      "src/test/steps/**/*.ts"
    ],
    paths: ["@rerun.txt"],
    format: [
      "progress",
      "json:reports/rerun-report.json",
      "rerun:@rerun.txt"
    ]
  }
}