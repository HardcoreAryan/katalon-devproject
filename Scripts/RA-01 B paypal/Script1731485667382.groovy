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

WebUI.navigateToUrl('https://dev01.shoplc.com/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/RA-01 B paypal/Page_Shop LC  Online Shopping Channel Jewel_6abe2b/a_Login  Join Us'))

WebUI.setText(findTestObject('Object Repository/RA-01 B paypal/Page_Login  SHOP LC/input_Email or Phone Number_loginEmail'), 
    'tautomation240@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/RA-01 B paypal/Page_Login  SHOP LC/input_Password  PIN_loginPassword'), 
    'glYEcQkLJWvzy3WH5ZLEFw==')

WebUI.click(findTestObject('Object Repository/RA-01 B paypal/Page_Login  SHOP LC/button_LOG IN'))

WebUI.click(findTestObject('Object Repository/RA-01 B paypal/Page_Shop LC  Online Shopping Channel Jewel_6abe2b/a_Live TV'))

WebUI.selectOptionByValue(findTestObject('Object Repository/RA-01 B paypal/Page_Jewelry on TV  Watch Shop LC Live Stre_1713f8/select_Select optionBlack ( 78.99 )Butterfl_4d3db6'), 
    'Black', true)

WebUI.click(findTestObject('Object Repository/RA-01 B paypal/Page_Jewelry on TV  Watch Shop LC Live Stre_1713f8/a_Buy Now'))

WebUI.click(findTestObject('Object Repository/RA-01 B paypal/Page_Checkout  SHOP LC/span_Pay with Paypal'))

WebUI.switchToWindowTitle('Checkout | SHOP LC')

WebUI.click(findTestObject('Object Repository/RA-01 B paypal/Page_Checkout  SHOP LC/img_paypal-logo paypal-logo-paypal paypal-logo-color-blue'))

WebUI.verifyElementPresent(findTestObject('Object Repository/RA-01 B paypal/Page_Log in to your PayPal account/h1_Pay with PayPal'), 
    10)

WebUI.setText(findTestObject('Object Repository/RA-01 B paypal/Page_Log in to your PayPal account/input_IN_login_email'), 
    'test@shoplc.com')

WebUI.click(findTestObject('Object Repository/RA-01 B paypal/Page_Log in to your PayPal account/button_Next'))

WebUI.setEncryptedText(findTestObject('Object Repository/RA-01 B paypal/Page_Log in to your PayPal account/input_Next_login_password'), 
    'TugewZm2a6p7ZTPQB20cjQ==')

WebUI.click(findTestObject('Object Repository/RA-01 B paypal/Page_Log in to your PayPal account/button_Log In'))

WebUI.click(findTestObject('Object Repository/RA-01 B paypal/Page_PayPal Checkout/button_Continue to Review Order'))

WebUI.switchToWindowTitle('Sites-SHOP_LC-Site | SHOP LC')

WebUI.click(findTestObject('Object Repository/RA-01 B paypal/Page_Sites-SHOP_LC-Site  SHOP LC/h2_ORDER CONFIRMATION'))

WebUI.closeBrowser()

