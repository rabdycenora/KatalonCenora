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

import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.interactions.Actions as Actions
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import org.openqa.selenium.interactions.Actions
import io.appium.java_client.AppiumDriver

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.AgentStaging)

WebUI.maximizeWindow()

WebUI.takeScreenshot()

WebUI.click(findTestObject('Flujo CompletoPruebas/Page_NCL Live Experience/div_CLick'))

WebUI.click(findTestObject('Flujo CompletoPruebas/Page_NCL Live Experience/div_CLick'))

WebUI.click(findTestObject('Flujo CompletoPruebas/Page_NCL Live Experience/div_CLick'))

WebUI.click(findTestObject('Flujo CompletoPruebas/Page_NCL Live Experience/div_CLick'))

WebUI.click(findTestObject('Flujo CompletoPruebas/Page_NCL Live Experience/div_CLick'))

WebUI.click(findTestObject('Flujo CompletoPruebas/Page_NCL Live Experience/div_CLick'))

WebUI.click(findTestObject('Flujo CompletoPruebas/Page_NCL Live Experience/div_CLick'))

WebUI.waitForElementPresent(findTestObject('Flujo CompletoPruebas/Page_NCL Live Experience/input_username'), 20)

WebUI.setText(findTestObject('Flujo CompletoPruebas/Page_NCL Live Experience/input_username'), GlobalVariable.User)

WebUI.setText(findTestObject('Flujo CompletoPruebas/Page_NCL Live Experience/input_Email_password'), GlobalVariable.Pass)

WebUI.click(findTestObject('Flujo CompletoPruebas/Page_NCL Live Experience/Button_LogIn'))

WebUI.takeScreenshot()

WebUI.waitForElementPresent(findTestObject('Flujo CompletoPruebas/Page_NCL Live Experience/div_Card_origen'), 50)

WebUI.delay(10)

WebUI.click(findTestObject('Flujo CompletoPruebas/Page_NCL Live Experience/Select_icon_apps'))

WebUI.click(findTestObject('Flujo CompletoPruebas/Page_NCL Live Experience/Select_Dashboard'))

WebUI.switchToWindowIndex(1)

WebUI.navigateToUrl(GlobalVariable.ConsumerStaging)

WebUI.switchToWindowIndex(1)

WebUI.click(findTestObject('Flujo CompletoPruebas/Page_NCL Live Experience/span_Code'))

Code = WebUI.getText(findTestObject('Flujo CompletoPruebas/Page_NCL Live Experience/span_Code'))

System.out.println('El valor del Code es: ' + Code)

WebUI.switchToWindowIndex(0)

WebUI.click(findTestObject('Flujo CompletoPruebas/Page_NCL Live Experience/Button_INVITE'))

WebUI.click(findTestObject('Flujo CompletoPruebas/Page_NCL Live Experience/Button_InviteByCode'))

WebUI.setText(findTestObject('Flujo CompletoPruebas/Page_NCL Live Experience/input_Code'), Code, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Flujo CompletoPruebas/Page_NCL Live Experience/input_Customer'), 'Automation')

WebUI.click(findTestObject('Flujo CompletoPruebas/Page_NCL Live Experience/div_Select_CustomerName'))

WebUI.delay(5)

WebUI.click(findTestObject('Flujo CompletoPruebas/Page_NCL Live Experience/Button_START'))

WebUI.setText(findTestObject('Flujo CompletoPruebas/Page_NCL Live Experience/input_Search'), '10-day Caribbean: Great Stirrup Cay, Dominican Republic & Aruba', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.switchToWindowIndex(1)

WebUI.switchToWindowIndex(0)

//WebUI.dragAndDropToObject(findTestObject('Flujo CompletoPruebas/Page_NCL Live Experience/div_Card_origen - Copy (1)'), findTestObject(
//      'Flujo CompletoPruebas/Page_NCL Live Experience/iframe12133'), FailureHandling.STOP_ON_FAILURE)
//WebUI.dragAndDropByOffset(findTestObject('Flujo CompletoPruebas/Page_NCL Live Experience/div_Card_origen - Copy (1)'), 400, 
  //  200)


Actions actions = new Actions(DriverFactory.getWebDriver());
WebElement Element = WebUiCommonHelper.findWebElement(findTestObject('Flujo CompletoPruebas/Page_NCL Live Experience/div_Card_origen'), 20)
actions.clickAndHold(element).perform();
actions.release(element).perform();
	

WebUI.switchToWindowIndex(1)

WebUI.switchToWindowIndex(0)

WebUI.sendKeys(findTestObject('Flujo CompletoPruebas/Page_NCL Live Experience/div_Card_destin - Copy (1)'), Keys.chord(Keys.ESCAPE))

WebUI.delay(10)

WebUI.click(findTestObject('Flujo CompletoPruebas/Page_NCL Live Experience/Button_ENDSession'))

WebUI.click(findTestObject('Flujo CompletoPruebas/Page_NCL Live Experience/Corfirm_Button_ENDSession'))

WebUI.takeScreenshot()

WebUI.closeBrowser()

