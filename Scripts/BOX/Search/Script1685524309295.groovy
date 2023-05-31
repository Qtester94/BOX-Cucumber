import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://app.box.com/login')

WebUI.setText(findTestObject('LoginPage/input_Email Address_login'), 'qtester94+Bob@gmail.com')

WebUI.click(findTestObject('LoginPage/button_Next'))

WebUI.setEncryptedText(findTestObject('LoginPage/input_Password_password'), 'uE9pEieVNs289u45J+1qGHh+mnHPFkWy')

WebUI.click(findTestObject('HomePage/button_Log In'))

WebUI.click(findTestObject('HomePage/input_Search'))

//WebUI.setText(findTestObject('HomePage/input_Search'), 'Test')
//
//WebUI.sendKeys(findTestObject('HomePage/input_Search'), Keys.chord(Keys.ENTER))
//
//WebUI.verifyElementPresent(findTestObject('HomePage/span_Sorry, we couldnt find what youre looking for'), 0)
WebUI.setText(findTestObject('HomePage/input_Search'), 'Get')

WebUI.sendKeys(findTestObject('HomePage/input_Search'), Keys.chord(Keys.ENTER))

WebUI.verifyElementPresent(findTestObject('HomePage/a_Get Started with Box.pdf'), 0)

WebUI.closeBrowser()

