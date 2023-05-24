import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords

import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW

import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import groovy.json.JsonSlurper as JsonSlurper


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




class testrail {
	
	 //Add Test Run and gets the ID of it
	@Keyword
	def addTestRun() {
		
		def response = WS.sendRequest(findTestObject('API/addRun'))
		
		def slurper = new JsonSlurper()
		
		def result = slurper.parseText(response.getResponseBodyContent())
		
		def runID = result.id
		
		GlobalVariable.G_testrail_run_id = runID
		
		println(GlobalVariable.G_testrail_run_id)
		
	}
	
	
	//Add Test Cases to Test run
	@Keyword
	def addTestsToRun() {
		
		int length = GlobalVariable.G_run_testrail_tc_id.size()
		
		for (int i = 0; i < length; i++) {
			println(GlobalVariable.G_run_testrail_tc_id[i])
		
			WS.sendRequest(findTestObject('API/addTestToTestRun', [('runID') : GlobalVariable.G_testrail_run_id, ('tcID') : GlobalVariable.G_run_testrail_tc_id
						, ('url') : (('/api/v2/update_run/' + GlobalVariable.G_testrail_run_id) + '/') + (GlobalVariable.G_run_testrail_tc_id[
						i])]))
		}
		
		
	}
	
	
	//Add result to tests on testrail
	@Keyword
	def addResultsToTests() {
		int length = GlobalVariable.G_run_testrail_tc_id.size()
		for (int i = 0; i < length; i++) {
			WS.sendRequest(findTestObject('API/addResultForCase', [('runID') : GlobalVariable.G_testrail_run_id, ('tcID') : GlobalVariable.G_run_testrail_tc_id
						, ('tcStatus') : GlobalVariable.G_run_testrail_tc_status[i], ('url') : (('/api/v2/add_result_for_case/' +
						GlobalVariable.G_testrail_run_id) + '/') + (GlobalVariable.G_run_testrail_tc_id[i])]))
		}
	}
	
	
}