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

import org.testng.Assert as Assert



import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows


class Download {

	@And ("Click on the Get Started with Box PDF")
	def clickPDF() {
		WebUI.click(findTestObject('Object Repository/HomePage/div_Get Started with Box.pdf'))
		
	}
	
	
	@Then("The file preview window open")
	def previewFileWindowopened() {
		String url = WebUI.getUrl()
		WebUI.verifyMatch(url, 'https://app.box.com/file/1215224276018', false)
		WebUI.closeBrowser()
		
	}
	
	@And ("Click on the Download button")
	def clickDownloadbutton() {
		WebUI.click(findTestObject('Object Repository/DownloadPage/button_Download'))
		
	}
	
	
	@And("Click on the close Preview button")
	def clickClosePreviewFileWindowButton() {
		WebUI.click(findTestObject('Object Repository/DownloadPage/a_Share_preview-close-btn'))
		
	}
	
	@And ("Click on the more button on File Card")
	def clickMoreBurronFileCard() {
		WebUI.mouseOver(findTestObject('HomePage/div_Get Started with Box.pdf'))
		WebUI.click(findTestObject('HomePage/button_Show More Options'))
		
	}
	
	
	@And("Click on the Download button from File Card")
	def clickDownloadFromFileCard() {
		WebUI.click(findTestObject('HomePage/li_Download'))
		
	}
		
	
	@Then ("The file is downloaded")
	def fileIsDownloaded() {
		String downloadPath = 'C:\\Users\\WeDoQA-ThinkPad-Man7\\Downloads'
		Assert.assertTrue(isFileDownloaded(downloadPath, 'Get Started with Box.pdf'), 'Failed to download Expected document')
		WebUI.closeBrowser()
	}
	
	
	
	boolean isFileDownloaded(String downloadPath, String fileName) {
		long timeout = (5 * 60) * 1000
	
		long start = new Date().getTime()
	
		boolean downloaded = false
	
		File file = new File(downloadPath, fileName)
	
		while (!(downloaded)) {
			KeywordUtil.logInfo("Checking file exists $file.absolutePath")
	
			downloaded = file.exists()
	
			if (downloaded) {
				file.delete()
			} else {
				long now = new Date().getTime()
	
				if ((now - start) > timeout) {
					break
				}
				
				Thread.sleep(3000)
			}
		}
		
		return downloaded
	}
}