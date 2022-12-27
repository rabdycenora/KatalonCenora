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

WebUI.callTestCase(findTestCase('Pruebas/Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Drap and Drop/Page_NCL Live Experience/input_Search'), 
    'Denali-Alyeska Explorer - Northbound Cruisetou')

WebUI.click(findTestObject('Object Repository/Drap and Drop/Page_NCL Live Experience/span_add        Invite'))

WebUI.click(findTestObject('Object Repository/Drap and Drop/Page_NCL Live Experience/span_Invite By Link'))

WebUI.click(findTestObject('Object Repository/Drap and Drop/Page_NCL Live Experience/i_content_copy'))

WebUI.click(findTestObject('Object Repository/Drap and Drop/Page_NCL Live Experience/div_north_eastEnter Sectionmore_horiz'))

WebUI.click(findTestObject('Object Repository/Drap and Drop/Page_NCL Live Experience/html_NCL Live Experience.json-formatter-row_66b7c5'))

WebUI.click(findTestObject('Object Repository/Drap and Drop/Page_NCL Live Experience/span_END SESSION'))

WebUI.click(findTestObject('Object Repository/Drap and Drop/Page_NCL Live Experience/span_END SESSION_1'))

