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

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Logitech B2B Partner Program  Partner _48dd1d/select_- Select One -Yes'), 
    'Yes', true)

WebUI.setText(findTestObject('Object Repository/Page_Logitech B2B Partner Program  Partner _48dd1d/input_Company Name_ctl00ctl00ctl00GlobalBod_965142'), 
    'test Alliance company')

WebUI.setText(findTestObject('Object Repository/Page_Logitech B2B Partner Program  Partner _48dd1d/input_Website_ctl00ctl00ctl00GlobalBodyCont_623d36'), 
    'www.testallaiancewebste.com')

WebUI.setText(findTestObject('Object Repository/Page_Logitech B2B Partner Program  Partner _48dd1d/input_Company Phone Number_ctl00ctl00ctl00G_47f3df'), 
    '1234567890')

WebUI.setText(findTestObject('Object Repository/Page_Logitech B2B Partner Program  Partner _48dd1d/input_Address_ctl00ctl00ctl00GlobalBodyCont_bd95fb'), 
    'testallianceaddress1')

WebUI.setText(findTestObject('Object Repository/Page_Logitech B2B Partner Program  Partner _48dd1d/input_Address 2_ctl00ctl00ctl00GlobalBodyCo_030cd2'), 
    'testallianceaddress12')

WebUI.setText(findTestObject('Object Repository/Page_Logitech B2B Partner Program  Partner _48dd1d/input_City_ctl00ctl00ctl00GlobalBodyContent_74636b'), 
    'testallianceaddresscity')

WebUI.setText(findTestObject('Object Repository/Page_Logitech B2B Partner Program  Partner _48dd1d/input_Postal Code_ctl00ctl00ctl00GlobalBody_9d8d4c'), 
    '12345')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Logitech B2B Partner Program  Partner _48dd1d/select_- Select One -Afghanistanland Island_7d2d48'), 
    'United States', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Logitech B2B Partner Program  Partner _48dd1d/select_- Select One -AlabamaAlaskaAmerican _a7c27e'), 
    'Alabama', true)

WebUI.click(findTestObject('Object Repository/Page_Logitech B2B Partner Program  Partner _48dd1d/ul_Additional Services Sold_select2-selecti_384dd8'))

WebUI.rightClick(findTestObject('Object Repository/Page_Logitech B2B Partner Program  Partner _48dd1d/ul_North America'))

WebUI.click(findTestObject('Object Repository/Page_Logitech B2B Partner Program  Partner _48dd1d/ul_Additional Services Sold_select2-selecti_384dd8'))

WebUI.rightClick(findTestObject('Object Repository/Page_Logitech B2B Partner Program  Partner _48dd1d/li_Product Integrations'))

WebUI.setText(findTestObject('Object Repository/Page_Logitech B2B Partner Program  Partner _48dd1d/textarea_What business issue does our joint_f20be8'), 
    'What business issue does our joint solution solve')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Logitech B2B Partner Program  Partner _48dd1d/select_- Select One -ComputeDigital Signage_60c7a4'), 
    'Compute', true)

WebUI.click(findTestObject('Object Repository/Page_Logitech B2B Partner Program  Partner _48dd1d/ul_Additional Services Sold_select2-selecti_384dd8'))

WebUI.rightClick(findTestObject('Object Repository/Page_Logitech B2B Partner Program  Partner _48dd1d/li_Compute'))

WebUI.click(findTestObject('Object Repository/Page_Logitech B2B Partner Program  Partner _48dd1d/label_What additional categorie(s) does you_ba9528'))

WebUI.setText(findTestObject('Object Repository/Page_Logitech B2B Partner Program  Partner _48dd1d/input_Please provide the URL to the product_9d1c62'), 
    'www.productpageurl.com')

WebUI.setText(findTestObject('Object Repository/Page_Logitech B2B Partner Program  Partner _48dd1d/textarea_Please provide the URL to the prod_3c7354'), 
    'topthreegoals')

WebUI.click(findTestObject('Object Repository/Page_Logitech B2B Partner Program  Partner _48dd1d/ul_Additional Services Sold_select2-selecti_384dd8'))

WebUI.rightClick(findTestObject('Object Repository/Page_Logitech B2B Partner Program  Partner _48dd1d/li_Joint Collateral'))

WebUI.click(findTestObject('Object Repository/Page_Logitech B2B Partner Program  Partner _48dd1d/label_Which marketing activities is your or_c3188d'))

WebUI.setText(findTestObject('Object Repository/Page_Logitech B2B Partner Program  Partner _48dd1d/input_Company Twitter Handle_ctl00ctl00ctl0_d18c85'), 
    'alliancetwitter')

WebUI.setText(findTestObject('Object Repository/Page_Logitech B2B Partner Program  Partner _48dd1d/input_Company Facebook Handle_ctl00ctl00ctl_6bc5da'), 
    'companyfacebook')

WebUI.setText(findTestObject('Object Repository/Page_Logitech B2B Partner Program  Partner _48dd1d/input_Company LinkedIn Handle_ctl00ctl00ctl_83666a'), 
    'companylinkedin')

WebUI.setText(findTestObject('Object Repository/Page_Logitech B2B Partner Program  Partner _48dd1d/input_Company Instagram Handle_ctl00ctl00ct_fb243c'), 
    'companyinstagram')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Logitech B2B Partner Program  Partner _48dd1d/select_- Select One -Mr.Ms.Mrs.Dr.Prof'), 
    'Mr.', true)

WebUI.setText(findTestObject('Object Repository/Page_Logitech B2B Partner Program  Partner _48dd1d/input_First Name_ctl00ctl00ctl00GlobalBodyC_bd445d'), 
    'AllianceFname')

WebUI.setText(findTestObject('Object Repository/Page_Logitech B2B Partner Program  Partner _48dd1d/input_Last Name_ctl00ctl00ctl00GlobalBodyCo_13ef11'), 
    'AllianceLname')

WebUI.setText(findTestObject('Object Repository/Page_Logitech B2B Partner Program  Partner _48dd1d/input_Job Title_ctl00ctl00ctl00GlobalBodyCo_646f8b'), 
    'AllianceJobtitle')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Logitech B2B Partner Program  Partner _48dd1d/select_- Select One -Alliance Partnership M_d66ef1'), 
    'Alliance Partnership Manager', true)

WebUI.setText(findTestObject('Object Repository/Page_Logitech B2B Partner Program  Partner _48dd1d/input_Work Phone Number_ctl00ctl00ctl00Glob_458472'), 
    '1234567890')

WebUI.setText(findTestObject('Object Repository/Page_Logitech B2B Partner Program  Partner _48dd1d/input_Work Mobile Number_ctl00ctl00ctl00Glo_20e92e'), 
    '1122334455')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Logitech B2B Partner Program  Partner _48dd1d/strong_Use company address'), 
    0)

WebUI.setText(findTestObject('Object Repository/Page_Logitech B2B Partner Program  Partner _48dd1d/input_Address_ctl00ctl00ctl00GlobalBodyCont_8303d3'), 
    'alliancecontactaddress1')

WebUI.setText(findTestObject('Object Repository/Page_Logitech B2B Partner Program  Partner _48dd1d/input_Address 2_ctl00ctl00ctl00GlobalBodyCo_052951'), 
    'alliancecontactaddress2')

WebUI.setText(findTestObject('Object Repository/Page_Logitech B2B Partner Program  Partner _48dd1d/input_City_ctl00ctl00ctl00GlobalBodyContent_ef12b1'), 
    'alliancecontactaddresscity')

WebUI.setText(findTestObject('Object Repository/Page_Logitech B2B Partner Program  Partner _48dd1d/input_Postal Code_ctl00ctl00ctl00GlobalBody_0e2c03'), 
    '12345')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Logitech B2B Partner Program  Partner _48dd1d/select_- Select One -Afghanistanland Island_7d2d48_1'), 
    'United States', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Logitech B2B Partner Program  Partner _48dd1d/select_- Select One -AlabamaAlaskaAmerican _a7c27e_1'), 
    'Alaska', true)

WebUI.click(findTestObject('Object Repository/Page_Logitech B2B Partner Program  Partner _48dd1d/a_Submit'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Logitech B2B Partner Program  Applicat_bdcbec/div_Application Submitted'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Logitech B2B Partner Program  Applicat_bdcbec/div_Application Submitted'), 
    'Application Submitted')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Logitech B2B Partner Program  Applicat_bdcbec/p_Thank you for your interest in becoming a_be487b'), 
    'Thank you for your interest in becoming an Alliance Partner. Your application is being reviewed, and we will get back to you within 14 days with an update on the status of your application.')

