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
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.AgentTesting)

WebUI.maximizeWindow()

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Login/Page_NCL Live Experience/div_LIVE EXPERIENCE 2.0 - LOGIN_q-img__cont_272698'))

WebUI.click(findTestObject('Object Repository/Login/Page_NCL Live Experience/div_LIVE EXPERIENCE 2.0 - LOGIN_q-img__cont_272698'))

WebUI.click(findTestObject('Object Repository/Login/Page_NCL Live Experience/div_LIVE EXPERIENCE 2.0 - LOGIN_q-img__cont_272698'))

WebUI.click(findTestObject('Object Repository/Login/Page_NCL Live Experience/div_LIVE EXPERIENCE 2.0 - LOGIN_q-img__cont_272698'))

WebUI.click(findTestObject('Object Repository/Login/Page_NCL Live Experience/div_LIVE EXPERIENCE 2.0 - LOGIN_q-img__cont_272698'))

WebUI.click(findTestObject('Object Repository/Login/Page_NCL Live Experience/div_LIVE EXPERIENCE 2.0 - LOGIN_q-img__cont_272698'))

WebUI.click(findTestObject('Login/Page_NCL Live Experience/div_LIVE EXPERIENCE 2.0 - LOGIN_q-img__cont_272698'))

WebUI.click(findTestObject('Login/Page_NCL Live Experience/div_LIVE EXPERIENCE 2.0 - LOGIN_q-img__cont_272698'))

WebUI.waitForElementPresent(findTestObject('Login/Page_NCL Live Experience/input_LIVE EXPERIENCE 2.0 - LOGIN_username'), 
    20)

WebUI.setText(findTestObject('Object Repository/Login/Page_NCL Live Experience/input_LIVE EXPERIENCE 2.0 - LOGIN_username'), 
    GlobalVariable.User)

WebUI.setText(findTestObject('Object Repository/Login/Page_NCL Live Experience/input_Email_password'), GlobalVariable.Pass)

WebUI.click(findTestObject('Object Repository/Login/Page_NCL Live Experience/span_Log In'))

WebUI.waitForPageLoad(20)

WebUI.click(findTestObject('pruebas_copy/Page_NCL Live Experience/i_apps'))

WebUI.click(findTestObject('pruebas_copy/Page_NCL Live Experience/div_Dashboard'))

//int currentTab = WebUI.getWindowIndex()
//WebUI.switchToWindowIndex(currentTab + 1)
//WebUI.navigateToUrl(GlobalVariable.ConsumerTesting)
//WebUI.switchToWindowIndex(currentTab )
WebUI.switchToWindowIndex(1)

WebUI.navigateToUrl(GlobalVariable.ConsumerTesting)

WebUI.switchToWindowIndex(1)

