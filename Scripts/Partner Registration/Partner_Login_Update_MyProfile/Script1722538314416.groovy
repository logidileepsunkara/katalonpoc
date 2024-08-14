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

WebUI.openBrowser('')

WebUI.navigateToUrl(PortalURL)

WebUI.maximizeWindow()

WebUI.takeFullPageScreenshot()

WebUI.setText(findTestObject('Object Repository/Page_Logitech B2B Partner Program  Home/input_Portal Sign In_ctl00ctl00ctl00GlobalB_9bcdbd'), 
    UserName)

WebUI.setText(findTestObject('Object Repository/Page_Logitech B2B Partner Program  Home/input_Portal Sign In_ctl00ctl00ctl00GlobalB_3cecb8'), 
    Password)

WebUI.click(findTestObject('Object Repository/Page_Logitech B2B Partner Program  Home/a_Login'))

WebUI.verifyElementPresent(findTestObject('Page_Logitech B2B Partner Program  Partner - Home/i_View all_fa fa-user'), 1)

WebUI.mouseOver(findTestObject('Page_Logitech B2B Partner Program  Partner - Home/i_View all_fa fa-user'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Logitech B2B Partner Program  Partner - Home/a_My Profile'))

//Generate Random Text Code
String str = CustomKeywords.'TestKeyword.randomStringMaker'(3)

WebUI.setText(findTestObject('Object Repository/Page_Logitech B2B Partner Program  Partner _02a5b7/input_Job Title_ctl00ctl00ctl00GlobalBodyCo_7fbaad'), 
    'test' + str)

//WebUI.setText(findTestObject('Object Repository/Page_Logitech B2B Partner Program  Partner _02a5b7/input_Job Title_ctl00ctl00ctl00GlobalBodyCo_7fbaad'), 'test job update')
WebUI.click(findTestObject('Object Repository/Page_Logitech B2B Partner Program  Partner _02a5b7/a_Submit'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Logitech B2B Partner Program  Partner _02a5b7/p_Your profile has been updated'), 
    VerifyUpdateSuccessMsg)

WebUI.takeFullPageScreenshot()

WebUI.mouseOver(findTestObject('Page_Logitech B2B Partner Program  Partner - Home/i_View all_fa fa-user'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Logitech B2B Partner Program  Partner _02a5b7/a_Logout'))

WebUI.takeFullPageScreenshot()

WebUI.verifyElementPresent(findTestObject('Page_Logitech B2B Partner Program  Home/input_Portal Sign In_ctl00ctl00ctl00GlobalB_9bcdbd'), 
    1)

WebUI.closeBrowser()

