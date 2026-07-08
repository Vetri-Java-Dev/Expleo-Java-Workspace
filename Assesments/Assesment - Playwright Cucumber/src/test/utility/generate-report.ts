async function generateReport() {
    const report = await import("multiple-cucumber-html-reporter");

    report.generate({
        jsonDir: "./reports/cucumber-report",
        reportPath: "./reports/html-report",
        reportName: "Playwright BDD Report",
        pageTitle: "Playwright Report",
        displayDuration: true,
        metadata: {
            browser: {
                name: "Chromium",
                version: "Latest",
            },
            device: "Local",
            platform: {
                name: "Windows",
                version: "11",
            },
        },
    });
}

generateReport();