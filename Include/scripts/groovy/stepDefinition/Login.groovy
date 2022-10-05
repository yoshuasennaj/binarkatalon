package stepDefinition

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class Login {
	@Then("User click on LOGIN button")
	public void user_click_on_LOGIN_button() {
		WebUI.callTestCase(findTestCase('Pages/User Login/Click Login'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User input registered username only {string}")
	public void user_input_registered_username_only(String username) {
		WebUI.callTestCase(findTestCase('Pages/User Login/Input Username'), [('username') : username], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User input registered password only {string}")
	public void user_input_registered_password_only(String password) {
		WebUI.callTestCase(findTestCase('Pages/User Login/Input Password'), [('password') : password], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User input incorrect username {string}")
	public void user_input_incorrect_username(String username) {
	}

	@Then("User input incorrect password {string}")
	public void user_input_incorrect_password(String password) {
	}

	@Then("User input registered username {string}")
	public void user_input_registered_username(String username) {

	}

	@Then("User input registered password {string}")
	public void user_input_registered_password(String password) {

	}
}