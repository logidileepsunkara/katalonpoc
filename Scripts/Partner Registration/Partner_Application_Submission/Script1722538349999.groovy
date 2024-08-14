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

WebUI.navigateToUrl('https://logitechlbpp.stage.impartner.live/English/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Page_Logitech B2B Partner Program  Home/a_Apply'))

WebUI.click(findTestObject('Object Repository/Page_Logitech B2B Partner Program  Partner _9e1f0c/input_E-mail Address_ctl00ctl00ctl00GlobalB_87d092'))

//Generate Random Text Code
String str = CustomKeywords.'TestKeyword.randomStringMaker'(3)

WebUI.setText(findTestObject('Object Repository/Page_Logitech B2B Partner Program  Partner _9e1f0c/input_E-mail Address_ctl00ctl00ctl00GlobalB_87d092'), 
    ('dsunkara+test' + str) + '@logitech.com')

//WebUI.setText(findTestObject('Object Repository/Page_Logitech B2B Partner Program  Partner _9e1f0c/input_E-mail Address_ctl00ctl00ctl00GlobalB_87d092'),'dsunkara+456@logitech.com')
WebUI.click(findTestObject('Object Repository/Page_Logitech B2B Partner Program  Partner _9e1f0c/a_Next'))

WebUI.click(findTestObject('Object Repository/Page_Logitech B2B Partner Program  Registra_27eb79/b_No, I am not an employee at any of the ab_283bfd'))

WebUI.click(findTestObject('Object Repository/Page_Logitech B2B Partner Program  Registra_27eb79/a_Next'))

WebUI.click(findTestObject('Object Repository/Page_Logitech B2B Partner Program  Partner _9e1f0c/button_Select Program'))

WebUI.waitForPageLoad(2)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Logitech B2B Partner Program  Partner _48dd1d/select_- Select One -Yes'), 
    'Yes', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Logitech B2B Partner Program  Partner _48dd1d/select_- Select One -Asia-PacificEurope, th_a8cebe'), 
    'US and Canada', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Logitech B2B Partner Program  Partner _48dd1d/select_- Select One -YesNo'), 
    'Yes', true)

WebUI.setText(findTestObject('Object Repository/Page_Logitech B2B Partner Program  Partner _48dd1d/input_Company Name_ctl00ctl00ctl00GlobalBod_965142'), 
    'Katalon companyname')

WebUI.setText(findTestObject('Object Repository/Page_Logitech B2B Partner Program  Partner _48dd1d/input_Legal Company Name (in EnglishLatin a_349961'), 
    'Katalon Legal companyname')

WebUI.setText(findTestObject('Object Repository/Page_Logitech B2B Partner Program  Partner _48dd1d/input_Other Names your Company Does Busines_74ed2b'), 
    'Katalon Other companyname')

WebUI.setText(findTestObject('Object Repository/Page_Logitech B2B Partner Program  Partner _48dd1d/input_Location of Company Headquarters_ctl0_0913f2'), 
    'Katalon companyname')

WebUI.setText(findTestObject('Object Repository/Page_Logitech B2B Partner Program  Partner _48dd1d/input_Location of Company Headquarters_ctl0_0913f2'), 
    'Katalon Headquarters')

WebUI.setText(findTestObject('Object Repository/Page_Logitech B2B Partner Program  Partner _48dd1d/input_Company Phone Number_ctl00ctl00ctl00G_47f3df'), 
    '1234567890')

WebUI.setText(findTestObject('Object Repository/Page_Logitech B2B Partner Program  Partner _48dd1d/input_Website_ctl00ctl00ctl00GlobalBodyCont_623d36'), 
    'www.katalonwebsite.com')

WebUI.setText(findTestObject('Object Repository/Page_Logitech B2B Partner Program  Partner _48dd1d/input_Address_ctl00ctl00ctl00GlobalBodyCont_bd95fb'), 
    'address1')

WebUI.setText(findTestObject('Object Repository/Page_Logitech B2B Partner Program  Partner _48dd1d/input_Address 2_ctl00ctl00ctl00GlobalBodyCo_030cd2'), 
    'address2')

WebUI.setText(findTestObject('Object Repository/Page_Logitech B2B Partner Program  Partner _48dd1d/input_City_ctl00ctl00ctl00GlobalBodyContent_74636b'), 
    'testcity')

WebUI.setText(findTestObject('Object Repository/Page_Logitech B2B Partner Program  Partner _48dd1d/input_Postal Code_ctl00ctl00ctl00GlobalBody_9d8d4c'), 
    '12345')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Logitech B2B Partner Program  Partner _48dd1d/select_- Select One -Afghanistanland Island_7d2d48'), 
    'United States', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Logitech B2B Partner Program  Partner _48dd1d/select_- Select One -AlabamaAlaskaAmerican _a7c27e'), 
    'Alabama', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Logitech B2B Partner Program  Partner _48dd1d/select_- Select One -YesNo_1'), 
    'Yes', true)

WebUI.click(findTestObject('Object Repository/Page_Logitech B2B Partner Program  Partner _48dd1d/ul_Which region(s) are the other offices in_f55b81'))

WebUI.rightClick(findTestObject('Object Repository/Page_Logitech B2B Partner Program  Partner _48dd1d/li_Asia-Pacific'))

WebUI.click(findTestObject('Object Repository/Page_Logitech B2B Partner Program  Partner _48dd1d/ul_Asia-Pacific'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Logitech B2B Partner Program  Partner _48dd1d/select_- Select One -1-1011-5051-100101-500501'), 
    '1-10', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Logitech B2B Partner Program  Partner _48dd1d/select_- Select One -1-1011-5051-100101-500501_1'), 
    '11-50', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Logitech B2B Partner Program  Partner _48dd1d/select_- Select One -Allplus Computer Syste_fea235'), 
    'Ingram Micro US', true)

WebUI.setText(findTestObject('Object Repository/Page_Logitech B2B Partner Program  Partner _48dd1d/input_Why are you interested in becoming a _babf2a'), 
    'Interested Logitechpartner')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Logitech B2B Partner Program  Partner _48dd1d/select_- Select One -0-20m20-100m100m-500m5_ee0fde'), 
    '0-20m', true)

WebUI.click(findTestObject('Object Repository/Page_Logitech B2B Partner Program  Partner _48dd1d/ul_Logitech Products You Expect to Sell_sel_0d899b'))

WebUI.rightClick(findTestObject('Object Repository/Page_Logitech B2B Partner Program  Partner _48dd1d/li_Accessories  Peripherals'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Logitech B2B Partner Program  Partner _48dd1d/select_- Select One -0-2526-5051-7576-100'), 
    '51-75%', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Logitech B2B Partner Program  Partner _48dd1d/select_- Select One -0-2526-5051-7576-100_1'), 
    '26-50%', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Logitech B2B Partner Program  Partner _48dd1d/select_- Select One -01 - 2526 - 5051 - 7576 - 100'), 
    '76% - 100%', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Logitech B2B Partner Program  Partner _48dd1d/select_- Select One -01 - 2526 - 5051 - 7576 - 100_1'), 
    '1% - 25%', true)

WebUI.click(findTestObject('Object Repository/Page_Logitech B2B Partner Program  Partner _48dd1d/ul_Logitech Products You Expect to Sell_sel_0d899b'))

WebUI.rightClick(findTestObject('Object Repository/Page_Logitech B2B Partner Program  Partner _48dd1d/li_Apple'))

WebUI.click(findTestObject('Object Repository/Page_Logitech B2B Partner Program  Partner _48dd1d/ul_Additional Services Sold_select2-selecti_384dd8_1'))

WebUI.rightClick(findTestObject('Object Repository/Page_Logitech B2B Partner Program  Partner _48dd1d/li_Monitoring and Management Services'))

WebUI.click(findTestObject('Object Repository/Page_Logitech B2B Partner Program  Partner _48dd1d/ul_Logitech Products You Expect to Sell_sel_0d899b'))

WebUI.rightClick(findTestObject('Object Repository/Page_Logitech B2B Partner Program  Partner _48dd1d/li_Cisco'))

WebUI.click(findTestObject('Object Repository/Page_Logitech B2B Partner Program  Partner _48dd1d/ul_Primary Market Segment Focus_select2-sel_1094ee'))

WebUI.rightClick(findTestObject('Object Repository/Page_Logitech B2B Partner Program  Partner _48dd1d/li_Small and Medium Business'))

WebUI.click(findTestObject('Object Repository/Page_Logitech B2B Partner Program  Partner _48dd1d/ul_Primary Vertical Focus_select2-selection_bba735'))

WebUI.rightClick(findTestObject('Object Repository/Page_Logitech B2B Partner Program  Partner _48dd1d/li_Automotive'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Logitech B2B Partner Program  Partner _48dd1d/select_- Select One -YesNo_1_2'), 
    'Yes', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Logitech B2B Partner Program  Partner _48dd1d/select_- Select One -YesNo_1_2_3'), 
    'Yes', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Logitech B2B Partner Program  Partner _48dd1d/select_- Select One -YesNo_1_2_3_4'), 
    'Yes', true)

WebUI.setText(findTestObject('Object Repository/Page_Logitech B2B Partner Program  Partner _48dd1d/input_First Name_ctl00ctl00ctl00GlobalBodyC_42bfca'), 
    'Contact Fname')

WebUI.setText(findTestObject('Object Repository/Page_Logitech B2B Partner Program  Partner _48dd1d/input_Last Name_ctl00ctl00ctl00GlobalBodyCo_2c37af'), 
    'Contact Lname')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Logitech B2B Partner Program  Partner _48dd1d/select_- Select One -ExecutiveMarketingOper_28fa41'), 
    'Executive', true)

WebUI.setText(findTestObject('Object Repository/Page_Logitech B2B Partner Program  Partner _48dd1d/input_Job Title_ctl00ctl00ctl00GlobalBodyCo_b7859a'), 
    'Contact JobTitle')

WebUI.setText(findTestObject('Object Repository/Page_Logitech B2B Partner Program  Partner _48dd1d/input_Work Phone Number_ctl00ctl00ctl00Glob_57b009'), 
    '1234567890')

WebUI.setText(findTestObject('Object Repository/Page_Logitech B2B Partner Program  Partner _48dd1d/input_Work Mobile Number_ctl00ctl00ctl00Glo_562e38'), 
    '1122334455')

WebUI.setText(findTestObject('Object Repository/Page_Logitech B2B Partner Program  Partner _48dd1d/input_Address_ctl00ctl00ctl00GlobalBodyCont_8303d3'), 
    'conaddress1')

WebUI.setText(findTestObject('Object Repository/Page_Logitech B2B Partner Program  Partner _48dd1d/input_Address 2_ctl00ctl00ctl00GlobalBodyCo_052951'), 
    'conaddress2')

WebUI.setText(findTestObject('Object Repository/Page_Logitech B2B Partner Program  Partner _48dd1d/input_City_ctl00ctl00ctl00GlobalBodyContent_ef12b1'), 
    'conaddresscity')

WebUI.setText(findTestObject('Object Repository/Page_Logitech B2B Partner Program  Partner _48dd1d/input_Postal Code_ctl00ctl00ctl00GlobalBody_0e2c03'), 
    '12345')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Logitech B2B Partner Program  Partner _48dd1d/select_- Select One -Afghanistanland Island_7d2d48_1'), 
    'United States', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Logitech B2B Partner Program  Partner _48dd1d/select_- Select One -AlabamaAlaskaAmerican _a7c27e_1'), 
    'Alaska', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Logitech B2B Partner Program  Partner _48dd1d/select_- Select One -Chinese - SimplifiedCh_a9bad9'), 
    'English', true)

WebUI.click(findTestObject('Object Repository/Page_Logitech B2B Partner Program  Partner _48dd1d/a_Submit'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Logitech B2B Partner Program  Applicat_bdcbec/div_Application Submitted'), 
    'Application Submitted')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Logitech B2B Partner Program  Applicat_bdcbec/p_Thank you for your interest in becoming a_49acd2'), 
    'Thank you for your interest in becoming a partner. Your application is being reviewed, and we will get back to you within three business days with an update on the status of your application.')

