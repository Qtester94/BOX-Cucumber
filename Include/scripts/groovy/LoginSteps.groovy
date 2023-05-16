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



class LoginSteps {
	
	@Given ("User navigates to login page")
		def navigateToLoginPage() {
			println ("\n I am inside navigateToLoginPage")
			WebUI.openBrowser('')
			WebUI.maximizeWindow()
			WebUI.navigateToUrl('https://account.box.com/login?')
	}
		
	@When  ("User enters valid (.*) and (.*)")	
		def enterValidCredential(String username, String password) {
			println("\n I am inside enterValidCredential")
			println ("\n Username: "+username)
			println ("\n Password: "+password)
			WebUI.setText(findTestObject('Object Repository/LoginPage/input_Email Address_login'), username)
			
			WebUI.click(findTestObject('Object Repository/LoginPage/button_Next'))
			
			WebUI.setEncryptedText(findTestObject('Object Repository/LoginPage/input_Password_password'), password)
		}
		
	@When ("User enters invalid (.*) username and valid (.*)")	
		def enterInvalidMail(String iusername, String password) {
			println("\n I am inside eenterInvalidMail")
			println ("\n Username: "+iusername)
			println ("\n Password: "+password)
			WebUI.setText(findTestObject('Object Repository/LoginPage/input_Email Address_login'), iusername)
			
			WebUI.click(findTestObject('Object Repository/LoginPage/button_Next'))
			
			WebUI.setEncryptedText(findTestObject('Object Repository/LoginPage/input_Password_password'), password)
		}
		
	@When ("User enters invalid (.*) password and valid (.*)")	
		def enterInvalidPassword( String ipassword, String username) {
			println("\n I am inside enterInvalidPassword")
			println ("\n Username: "+username)
			println ("\n Password: "+ipassword)
			WebUI.setText(findTestObject('Object Repository/LoginPage/input_Email Address_login'), username)
			
			WebUI.click(findTestObject('Object Repository/LoginPage/button_Next'))
			
			WebUI.setEncryptedText(findTestObject('Object Repository/LoginPage/input_Password_password'), ipassword)
		}
		
		
	@And ("Click on the login button")	
		def clickLogin() {
			println("\n I am inside clickLogin")
			WebUI.click(findTestObject('Object Repository/LoginPage/button_Log In'))
		}	
		
	@Then ("User is navigated to the home page")	
		def verifyHomePage() {
			println("\n I am inside verifyHomePage")
			String url = WebUI.getUrl()
			WebUI.verifyMatch(url, 'https://app.box.com/folder/0', false)
			WebUI.closeBrowser()
		}
		
	@Then ("The user is not logged in")	
		def UserisNotLoggedIn (){
			println("\n I am inside UserisNotLoggedI")
		WebUI.verifyElementPresent(findTestObject('LoginPage/div_Invalid Login Credentials'), 0)
		WebUI.closeBrowser()
	}
	}
	
	
