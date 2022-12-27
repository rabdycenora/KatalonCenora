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

WebUI.navigateToUrl(GlobalVariable.NCLStaging)

WebUI.maximizeWindow()

WebUI.takeScreenshot()

WebUI.click(findTestObject('Flujo Completo/Page_NCL Live Experience/div_CLick'))

WebUI.click(findTestObject('Flujo Completo/Page_NCL Live Experience/div_CLick'))

WebUI.click(findTestObject('Flujo Completo/Page_NCL Live Experience/div_CLick'))

WebUI.click(findTestObject('Flujo Completo/Page_NCL Live Experience/div_CLick'))

WebUI.click(findTestObject('Flujo Completo/Page_NCL Live Experience/div_CLick'))

WebUI.click(findTestObject('Flujo Completo/Page_NCL Live Experience/div_CLick'))

WebUI.click(findTestObject('Flujo Completo/Page_NCL Live Experience/div_CLick'))

WebUI.click(findTestObject('Flujo Completo/Page_NCL Live Experience/div_CLick'))

WebUI.waitForElementPresent(findTestObject('Flujo Completo/Page_NCL Live Experience/input_username'), 20)

WebUI.setText(findTestObject('Flujo Completo/Page_NCL Live Experience/input_username'), GlobalVariable.UserNCL)

WebUI.setText(findTestObject('Flujo Completo/Page_NCL Live Experience/input_Email_password'), GlobalVariable.Pass)

WebUI.click(findTestObject('Flujo Completo/Page_NCL Live Experience/Button_LogIn'))

WebUI.waitForElementPresent(findTestObject('Flujo Completo/Page_NCL Live Experience/div_Card_origen'), 50)

WebUI.delay(10)

WebUI.click(findTestObject('Flujo Completo/Page_NCL Live Experience/Select_icon_apps'))

WebUI.click(findTestObject('Flujo Completo/Page_NCL Live Experience/Select_Dashboard'))

WebUI.switchToWindowIndex(1)

WebUI.navigateToUrl(GlobalVariable.NCLConStaging)

WebUI.switchToWindowIndex(1)

WebUI.click(findTestObject('Flujo Completo/Page_NCL Live Experience/span_Code'))

WebUI.delay(3)

Code = WebUI.getText(findTestObject('Flujo Completo/Page_NCL Live Experience/span_Code'))

System.out.println('El valor del Code es: ' + Code)

WebUI.switchToWindowIndex(0)

WebUI.click(findTestObject('Flujo Completo/Page_NCL Live Experience/Button_INVITE'))

WebUI.click(findTestObject('Flujo Completo/Page_NCL Live Experience/Button_InviteByCode'))

WebUI.setText(findTestObject('Flujo Completo/Page_NCL Live Experience/input_Code'), Code, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Flujo Completo/Page_NCL Live Experience/input_Customer'), 'Automation')

WebUI.delay(5)

WebUI.click(findTestObject('Flujo Completo/Page_NCL Live Experience/Button_START'))

WebUI.click(findTestObject('Flujo Completo/Page_NCL Live Experience/Option_StandBy'))

WebUI.click(findTestObject('Flujo Completo/Page_NCL Live Experience/Option_DisablerUser'))

WebUI.click(findTestObject('Flujo Completo/Page_NCL Live Experience/Option_EnabledPointer'))

WebUI.click(findTestObject('Flujo Completo/Page_NCL Live Experience/Option_DisablerUser'))

WebUI.switchToWindowIndex(1)

WebUI.delay(3)

WebUI.switchToWindowIndex(0)

WebUI.setText(findTestObject('Flujo Completo/Page_NCL Live Experience/input_Search'), Search1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.dragAndDropByOffset(findTestObject('Flujo Completo/Page_NCL Live Experience/div_Card_origen'), 400, 100)

WebUI.switchToWindowIndex(1)

WebUI.delay(3)

WebUI.switchToWindowIndex(0)

WebUI.delay(3)

WebUI.switchToWindowIndex(1)

WebUI.delay(3)

WebUI.switchToWindowIndex(0)

WebUI.click(findTestObject('Flujo Completo/Page_NCL Live Experience/Option_StandBy'))

WebUI.sendKeys(findTestObject('Flujo Completo/Page_NCL Live Experience/input_Search'), Keys.chord(Keys.CONTROL, 'a', Keys.BACK_SPACE))

WebUI.setText(findTestObject('Flujo Completo/Page_NCL Live Experience/input_Search'), Search2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.dragAndDropByOffset(findTestObject('Flujo Completo/Page_NCL Live Experience/div_Card_origen'), 400, 100)

WebUI.switchToWindowIndex(1)

WebUI.delay(3)

WebUI.switchToWindowIndex(0)

WebUI.delay(3)

WebUI.switchToWindowIndex(1)

WebUI.delay(3)

WebUI.switchToWindowIndex(0)

//WebUI.dragAndDropToObject(findTestObject('Flujo Completo/Page_NCL Live Experience/div_Card_origen'), findTestObject('Flujo Completo/Page_NCL Live Experience/div_Card_destin'), 
//    FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('Flujo Completo/Page_NCL Live Experience/Button_ENDSession'))

WebUI.click(findTestObject('Flujo Completo/Page_NCL Live Experience/Corfirm_Button_ENDSession'))

WebUI.closeBrowser()

