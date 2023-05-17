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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.testng.Assert as Assert
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.annotation.Keyword as Keyword

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://app.box.com/login')

WebUI.setText(findTestObject('LoginPage/input_Email Address_login'), 'qtester94+Bob@gmail.com')

WebUI.click(findTestObject('LoginPage/button_Next'))

WebUI.setEncryptedText(findTestObject('LoginPage/input_Password_password'), 'uE9pEieVNs289u45J+1qGHh+mnHPFkWy')

WebUI.click(findTestObject('LoginPage/button_Log In'))

WebUI.click(findTestObject('Object Repository/HomePage/div_Get Started with Box.pdf'))

WebUI.click(findTestObject('Object Repository/DownloadPage/button_Download'))

String downloadPath = 'C:\\Users\\WeDoQA-ThinkPad-Man7\\Downloads'

Assert.assertTrue(isFileDownloaded(downloadPath, 'Get Started with Box.pdf'), 'Failed to download Expected document')

WebUI.click(findTestObject('Object Repository/DownloadPage/a_Share_preview-close-btn'))

WebUI.closeBrowser()


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

