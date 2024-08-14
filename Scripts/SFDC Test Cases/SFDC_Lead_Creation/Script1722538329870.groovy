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

WebUI.navigateToUrl('https://logitechsales--uat.sandbox.my.salesforce.com/?ec=302&startURL=%2Fvisualforce%2Fsession%3Furl%3Dhttps%253A%252F%252Flogitechsales--uat.sandbox.lightning.force.com%252Flightning%252Fpage%252Fhome')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Page_Login  Salesforce/input_Username_username'), 'nam-cam-automation-testuser@b2b.logitech.com.uat')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login  Salesforce/input_Password_pw'), 'LJ1uXHEsd5fltfn2C5AP7w==')

WebUI.click(findTestObject('Object Repository/Page_Login  Salesforce/input_Password_Login'))

WebUI.waitForPageLoad(10)

WebUI.navigateToUrl('https://logitechsales--uat.sandbox.lightning.force.com/lightning/o/Lead/home')

WebUI.click(findTestObject('Object Repository/Page_Recently Viewed  Leads  Salesforce/a_New'))

String str = CustomKeywords.'TestKeyword.randomStringMaker'(3)

WebUI.setText(findTestObject('Object Repository/Page_New Lead Lead - End Customer  Salesforce/input__lastName'), ('0' + 
    str) + 'Test Lead')

//WebUI.setText(findTestObject('Object Repository/Page_New Lead Lead - End Customer  Salesforce/input__lastName'), '001 Test Lead')
WebUI.setText(findTestObject('Object Repository/Page_New Lead Lead - End Customer  Salesforce/input__Company'), ('0' + str) + 
    'Test Company Name')

//WebUI.setText(findTestObject('Object Repository/Page_New Lead Lead - End Customer  Salesforce/input__Company'), '001 Test Company Name')
WebUI.setText(findTestObject('Object Repository/Page_New Lead Lead - End Customer  Salesforce/input__Email'), ('dsunkara+' + 
    str) + 'testleademail@logitech.com')

//WebUI.setText(findTestObject('Object Repository/Page_New Lead Lead - End Customer  Salesforce/input__Email'), 'dsunkara+001testleademail@logitech.com')
WebUI.setText(findTestObject('Object Repository/Page_New Lead Lead - End Customer  Salesforce/input_Country_country'), 'United States')

WebUI.sendKeys(findTestObject('Object Repository/Page_New Lead Lead - End Customer  Salesforce/input_Country_country'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Page_New Lead Lead - End Customer  Salesforce/input_City_city'), 'City')

WebUI.click(findTestObject('Object Repository/Page_New Lead Lead - End Customer  Salesforce/input_StateProvince_province'))

WebUI.click(findTestObject('Object Repository/Page_New Lead Lead - End Customer  Salesforce/span_Alabama'))

WebUI.setText(findTestObject('Object Repository/Page_New Lead Lead - End Customer  Salesforce/input_City_city'), 'City')

WebUI.setText(findTestObject('Object Repository/Page_New Lead Lead - End Customer  Salesforce/input_StateProvince_province'), 
    'Alaska')

WebUI.sendKeys(findTestObject('Object Repository/Page_New Lead Lead - End Customer  Salesforce/input_StateProvince_province'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Page_New Lead Lead - End Customer  Salesforce/input_ZipPostal Code_postalCode'), 
    '12345')

WebUI.click(findTestObject('Object Repository/Page_New Lead Lead - End Customer  Salesforce/button_Save'))

WebUI.closeBrowser()

