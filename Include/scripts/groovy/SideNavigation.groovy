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



class SideNavigation {

	@Then ("All navigation option is present")
	def allnavigationOptionPresent () {
		WebUI.verifyElementPresent(findTestObject('SideNavigation/Page_All Files  Powered by Box/span_All Files'), 0)

		WebUI.verifyElementPresent(findTestObject('SideNavigation/Page_All Files  Powered by Box/span_Recents'), 0)

		WebUI.verifyElementPresent(findTestObject('SideNavigation/Page_All Files  Powered by Box/span_Synced'), 0)

		WebUI.verifyElementPresent(findTestObject('SideNavigation/Page_All Files  Powered by Box/span_Canvas'), 0)

		WebUI.verifyElementPresent(findTestObject('SideNavigation/Page_All Files  Powered by Box/span_Notes'), 0)

		WebUI.verifyElementPresent(findTestObject('SideNavigation/Page_All Files  Powered by Box/span_Sign'), 0)

		WebUI.verifyElementPresent(findTestObject('SideNavigation/Page_All Files  Powered by Box/span_Apps'), 0)

		WebUI.verifyElementPresent(findTestObject('SideNavigation/Page_All Files  Powered by Box/span_Trash'), 0)

		WebUI.verifyElementPresent(findTestObject('SideNavigation/Page_All Files  Powered by Box/span_My Collections'), 0)

		WebUI.verifyElementPresent(findTestObject('SideNavigation/Page_All Files  Powered by Box/span_Favorites'), 0)

		WebUI.closeBrowser()
	}


	@And ("Click on the Recent side navigation option")
	def clickOnRecent() {
		WebUI.click(findTestObject('Object Repository/SideNavigation/Page_All Files  Powered by Box/span_Recents'))
	}

	@Then ("User is redirected to the Recent page")
	def userIsRedirectedToRecent() {
		String url = WebUI.getUrl()
		WebUI.verifyMatch(url, 'https://app.box.com/recents', false)
		WebUI.closeBrowser()
	}

	@And ("Click on the Synced side navigation option")
	def clickSync () {
		WebUI.click(findTestObject('Object Repository/SideNavigation/Page_All Files  Powered by Box/span_Synced'))
	}

	@Then ("User is redirected to the Sync page")
	def userIsRedirectedToSync () {
		String url = WebUI.getUrl()
		WebUI.verifyMatch(url, 'https://app.box.com/folders/sync/0', false)
		WebUI.closeBrowser()
	}

	@And ("Click on the Canvas side navigation option")
	def clickCanvas() {
		WebUI.click(findTestObject('Object Repository/SideNavigation/Page_All Files  Powered by Box/span_Canvas'))
	}

	@Then ("User is redirected to the Canvas page")
	def userIsRedirectedToCanvas() {
		String url = WebUI.getUrl()
		WebUI.verifyMatch(url, 'https://app.box.com/canvas', false)
		WebUI.closeBrowser()
	}

	@And ("Click on the Notes side navigation option")
	def clcikNoes () {
		WebUI.click(findTestObject('Object Repository/SideNavigation/Page_All Files  Powered by Box/span_Notes'))
	}

	@Then ("User is redirected to the Notes page")
	def userIsRedirectedToNotes () {
		WebUI.switchToWindowIndex('1')
		String url = WebUI.getUrl()
		WebUI.verifyMatch(url, 'https://app.box.com/notes', false)
		WebUI.closeBrowser()
	}

	@And ("Click on the Sign side navigation option")
	def clickSign () {
		WebUI.click(findTestObject('Object Repository/SideNavigation/Page_All Files  Powered by Box/span_Sign'))
	}

	@Then ("User is redirected to the Sign page")
	def userIsRedirectedToSign() {
		String url = WebUI.getUrl()
		WebUI.verifyMatch(url, 'https://app.box.com/sign', false)
		WebUI.closeBrowser()
	}

	@And ("Click on the Apps side navigation option")
	def clickApps () {
		WebUI.click(findTestObject('Object Repository/SideNavigation/Page_All Files  Powered by Box/span_Apps'))
	}

	@Then ("User is redirected to the Apps page")
	def userIsRedirectedToApps () {
		String url = WebUI.getUrl()
		WebUI.verifyMatch(url, 'https://app.box.com/app-center', false)
		WebUI.closeBrowser()
	}

	@And ("Click on the Bin side navigation option")
	def clickBin () {
		WebUI.click(findTestObject('Object Repository/SideNavigation/Page_All Files  Powered by Box/span_Trash'))
	}

	@Then ("User is redirected to the Bin page")
	def userIsRedirectedToBin () {
		String url = WebUI.getUrl()
		WebUI.verifyMatch(url, 'https://app.box.com/trash', false)
		WebUI.closeBrowser()
	}

	@And ("Click on the My collection side navigation option")
	def clickMyCollection () {
		WebUI.click(findTestObject('Object Repository/SideNavigation/Page_All Files  Powered by Box/span_My Collections'))
	}

	@Then ("User is redirected to the My collection page")
	def userIsRedirectedToCollection () {
		String url = WebUI.getUrl()
		WebUI.verifyMatch(url, 'https://app.box.com/collections', false)
		WebUI.closeBrowser()
	}

	@And("Click on the Favourites side navigation option")
	def clickFavourites () {
		WebUI.click(findTestObject('Object Repository/SideNavigation/Page_All Files  Powered by Box/span_Favorites'))
	}

	@Then ("User is redirected to the Favourites page")
	def userIsRedirectedToFavourites () {
		String url = WebUI.getUrl()
		WebUI.verifyMatch(url, 'https://app.box.com/collection/14978109899', false)
		WebUI.closeBrowser()
	}

	@And("Click on the All files side navigation option")
	def clickAllFiles () {
		WebUI.click(findTestObject('Object Repository/SideNavigation/Page_All Files  Powered by Box/span_Favorites'))
		WebUI.click(findTestObject('Object Repository/SideNavigation/Page_All Files  Powered by Box/span_All Files'))
	}

	@Then ("User is redirected to the All Files page")
	def userIsRedirectedToAllFiles () {
		String url = WebUI.getUrl()
		WebUI.verifyMatch(url, 'https://app.box.com/folder/0', false)
		WebUI.closeBrowser()
	}
}


