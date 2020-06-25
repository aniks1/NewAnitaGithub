package com.cx.scenario;

import com.tcs.cx.servicepanel.api.CxScenarioRunner;
import com.tcs.cx.servicepanel.api.util.ProjectConstants.RUN;
import com.tcs.cxplatform.model.compatibility.Browser.BROWSER;


public class Runner {
public static void main(String[] args) {
	CxScenarioRunner runner = new CxScenarioRunner(RUN.FUNCTIONAL/*/RUN.COMPATIBILITY/RUN.ACCESSIBILITY*/);
	runner.setBrowser(BROWSER.CHROME);
	//runner.setDatasetId("DS123");
	//runner.setIndex(2);
	runner.setDefaultScreenshot(true/*/false*/);
	//runner.setPages("Google#search", "Google#image");
}
}
