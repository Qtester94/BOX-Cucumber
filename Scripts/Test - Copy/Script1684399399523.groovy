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
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration

String filepath = 'C:\\Users\\WeDoQA-ThinkPad-Man7\\Downloads\\Test\\Test1.jpg'

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://account.box.com/login?')

WebUI.setText(findTestObject('Object Repository/HomePage/input_Email Address_login'), 'qtester94+Bob@gmail.com')

WebUI.click(findTestObject('LoginPage/button_Next'))

WebUI.setEncryptedText(findTestObject('Object Repository/HomePage/input_Password_password'), 'uE9pEieVNs289u45J+1qGHh+mnHPFkWy')

WebUI.click(findTestObject('LoginPage/button_Log In'))

WebUI.clickOffset(findTestObject('HomePage/div_Get Started with Box.pdf'), 300, 500)
WebUI.uploadFileWithDragAndDrop(findTestObject('HomePage/div_Get Started with Box.pdf'), filepath, FailureHandling.STOP_ON_FAILURE)

//WebUI.uploadFile(findTestObject('HomePage/li_File Upload'), 'C:\\Users\\WeDoQA-ThinkPad-Man7\\Downloads\\Test\\Test 1.jpg')
WebUI.verifyElementPresent(findTestObject('HomePage/div_Test 1.jpg was uploaded successfully.Share'), 0)

WebUI.closeBrowser()

WebUI.click(findTestObject('HomePage/button_New'))

