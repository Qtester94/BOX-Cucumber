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

println(GlobalVariable.G_testrail_run_id)

println(GlobalVariable.G_run_testrail_tc_id)

println(GlobalVariable.G_run_testrail_tc_status)

WS.sendRequest(findTestObject('API/addTestToTestRun', [('runID') : GlobalVariable.G_testrail_run_id, ('tcID') : GlobalVariable.G_run_testrail_tc_id
            , ('url') : ('/api/v2/update_run/' + GlobalVariable.G_testrail_run_id) + '/']))

WS.sendRequest(findTestObject('API/addResultForCase', [('runID') : GlobalVariable.G_testrail_run_id, ('tcID') : GlobalVariable.G_run_testrail_tc_id
            , ('tcStatus') : GlobalVariable.G_run_testrail_tc_status[0], ('url') : (('/api/v2/add_result_for_case/' + GlobalVariable.G_testrail_run_id) + 
            '/') + (GlobalVariable.G_run_testrail_tc_id[0])]))

