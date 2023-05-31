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
import org.openqa.selenium.Keys as Keys


class Search {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */


	@And ("Enter part of the non-existing file name")
	def searchNonExistingFile (){
		WebUI.setText(findTestObject('HomePage/input_Search'), 'Test')
		WebUI.sendKeys(findTestObject('HomePage/input_Search'), Keys.chord(Keys.ENTER))
	}


	@Then("There is no search result")
	def thereIsNoSearchResult() {
		WebUI.verifyElementPresent(findTestObject('HomePage/span_Sorry, we couldnt find what youre looking for'), 0)
		WebUI.closeBrowser()
	}


	@And ("Enter part of the existing file name")
	def searchExistingFile() {
		WebUI.setText(findTestObject('HomePage/input_Search'), 'Get')
		WebUI.sendKeys(findTestObject('HomePage/input_Search'), Keys.chord(Keys.ENTER))
	}


	@Then("There is a search result")
	def thereisSearchResult() {
		WebUI.verifyElementPresent(findTestObject('HomePage/a_Get Started with Box.pdf'), 0)
		WebUI.closeBrowser()
	}
}