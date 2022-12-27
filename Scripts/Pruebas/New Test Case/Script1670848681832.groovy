import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import org.openqa.selenium.Keys as Keys


import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.interactions.Actions as Actions
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import org.openqa.selenium.interactions.Actions
import io.appium.java_client.AppiumDriver
WebUI.openBrowser('')

WebUI.navigateToUrl('https://jqueryui.com/droppable/')

WebUI.maximizeWindow()

WebUI.delay(5)

//WebUI.dragAndDropByOffset(findTestObject('Page_Droppable  jQuery UI/div_Drag origen'), 200, 100)

Actions builder = new Actions(DriverFactory.getWebDriver());

WebElement sourceElement = WebUiCommonHelper.findWebElement(findTestObject('Page_Droppable  jQuery UI/div_Drag origen'), 20)
WebElement destElement = WebUiCommonHelper.findWebElement(findTestObject('Page_Droppable  jQuery UI/div_Drag destino'), 20)
builder.clickAndHold(sourceElement)
WebUI.delay(5)
WebUI.dragAndDropToObject(findTestObject('Page_jQuery_Droppable/div_draggable'), findTestObject('Page_jQuery_Droppable/div_droppable'))
//builder.moveToElement(destElement).release().build().perform()
