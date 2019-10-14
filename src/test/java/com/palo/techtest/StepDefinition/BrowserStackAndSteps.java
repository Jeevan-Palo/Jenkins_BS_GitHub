package com.palo.techtest.StepDefinition;

import com.palo.techtest.StepLibrary.CommonLibrary;

import cucumber.api.java.en.Given;

public class BrowserStackAndSteps {

	@Given("^User launch the android app in browser stack$")
	public void user_launch_the_android_app_in_browser_stack() throws Throwable {
	    CommonLibrary.bsAndroidApp();
	}


	

}
