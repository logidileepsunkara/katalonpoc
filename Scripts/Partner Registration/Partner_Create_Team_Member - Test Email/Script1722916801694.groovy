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

not_run: WebUI.openBrowser('')

not_run: WebUI.navigateToUrl(PortalURL)

not_run: WebUI.maximizeWindow()

not_run: WebUI.setText(findTestObject('Object Repository/Page_Logitech B2B Partner Program  Home/input_Portal Sign In_ctl00ctl00ctl00GlobalB_9bcdbd'), 
    UserName)

not_run: WebUI.setText(findTestObject('Object Repository/Page_Logitech B2B Partner Program  Home/input_Portal Sign In_ctl00ctl00ctl00GlobalB_3cecb8'), 
    Password)

not_run: WebUI.click(findTestObject('Object Repository/Page_Logitech B2B Partner Program  Home/a_Login'))

not_run: WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Logitech B2B Partner Program  Partner - Home/i_View all_fa fa-user'), 
    1)

not_run: WebUI.mouseOver(findTestObject('Object Repository/Page_Logitech B2B Partner Program  Partner - Home/i_View all_fa fa-user'), 
    FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.click(findTestObject('Object Repository/Page_Logitech B2B Partner Program  Partner _02a5b7/a_Company Profile'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Logitech B2B Partner Program  Partner _2f299c/a_Manage Team Members'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Logitech B2B Partner Program  Partner _894c97/a_Add a Team Member'))

not_run: WebUI.setText(findTestObject('Object Repository/Page_Logitech B2B Partner Program  Partner _45b1cf/input_First Name_ctl00ctl00ctl00GlobalBodyC_4f8021'), 
    'TeamMem Fname')

not_run: WebUI.setText(findTestObject('Object Repository/Page_Logitech B2B Partner Program  Partner _45b1cf/input_Last Name_ctl00ctl00ctl00GlobalBodyCo_c7fd81'), 
    'Lname')

not_run: String str = CustomKeywords.'TestKeyword.randomStringMaker'(3)

not_run: WebUI.setText(findTestObject('Object Repository/Page_Logitech B2B Partner Program  Partner _45b1cf/input_Email_ctl00ctl00ctl00GlobalBodyConten_52fff4'), 
    ('pbjtoscauser+testteam' + str) + '@logitech.com')

//WebUI.setText(findTestObject('Object Repository/Page_Logitech B2B Partner Program  Partner _45b1cf/input_Email_ctl00ctl00ctl00GlobalBodyConten_52fff4'), 'dsunkara+testteam123@logitech.com')
not_run: WebUI.setText(findTestObject('Object Repository/Page_Logitech B2B Partner Program  Partner _45b1cf/input_Work Phone Number_ctl00ctl00ctl00Glob_188e54'), 
    '1234567890')

not_run: WebUI.setText(findTestObject('Object Repository/Page_Logitech B2B Partner Program  Partner _45b1cf/input_Mobile Phone Number_ctl00ctl00ctl00Gl_a90b44'), 
    '1122334455')

not_run: WebUI.setText(findTestObject('Object Repository/Page_Logitech B2B Partner Program  Partner _45b1cf/input_Job Title_ctl00ctl00ctl00GlobalBodyCo_7fbaad'), 
    'Test Job Title')

not_run: WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Logitech B2B Partner Program  Partner _45b1cf/select_- Select One -ExecutiveMarketingOper_28fa41'), 
    'Executive', true)

not_run: WebUI.setText(findTestObject('Object Repository/Page_Logitech B2B Partner Program  Partner _45b1cf/input_Address_ctl00ctl00ctl00GlobalBodyCont_1726c4'), 
    'Teammem Address1')

not_run: WebUI.setText(findTestObject('Object Repository/Page_Logitech B2B Partner Program  Partner _45b1cf/input_Address 2_ctl00ctl00ctl00GlobalBodyCo_d09925'), 
    'Teammem Address2')

not_run: WebUI.setText(findTestObject('Object Repository/Page_Logitech B2B Partner Program  Partner _45b1cf/input_City_ctl00ctl00ctl00GlobalBodyContent_cbeb31'), 
    'Teammem Address City')

not_run: WebUI.setText(findTestObject('Object Repository/Page_Logitech B2B Partner Program  Partner _45b1cf/input_Postal Code_ctl00ctl00ctl00GlobalBody_3afcdb'), 
    '12345')

not_run: WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Logitech B2B Partner Program  Partner _45b1cf/select_- Select One -Afghanistanland Island_7d2d48'), 
    'United States', true)

not_run: WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Logitech B2B Partner Program  Partner _45b1cf/select_- Select One -AlabamaAlaskaAmerican _a7c27e'), 
    'Alabama', true)

not_run: WebUI.click(findTestObject('Object Repository/Page_Logitech B2B Partner Program  Partner _45b1cf/a_Submit'))

not_run: WebUI.navigateToUrl('https://logitechlbpp.stage.impartner.live/English/Partner/PRM/Administration/Manage')

not_run: WebUI.verifyElementText(findTestObject('Object Repository/Page_Logitech B2B Partner Program  Partner _894c97/td_dsunkaratestteam123logitech.com'), 
    ('pbjtoscauser+testteam' + str) + '@logitech.com')

not_run: WebUI.mouseOver(findTestObject('Page_Logitech B2B Partner Program  Partner - Home/i_View all_fa fa-user'), FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.click(findTestObject('Object Repository/Page_Logitech B2B Partner Program  Partner _02a5b7/a_Logout'))

not_run: WebUI.verifyElementPresent(findTestObject('Page_Logitech B2B Partner Program  Home/input_Portal Sign In_ctl00ctl00ctl00GlobalB_9bcdbd'), 
    1)

not_run: WebUI.closeBrowser()

CustomKeywords.'com.testwithhari.katalon.plugins.Gmail.readLatestEMailBodyContent'(pbjtoscauser@logitech.com, hmaqwffvbxtzyyjh, 
    Inbox)

