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

WebUI.click(findTestObject('Object Repository/RA-01_LIVETV_placeorderby buyorder/Page_Shop LC  Online Shopping Channel Jewel_6abe2b/span_Login  Join Us'))

WebUI.setText(findTestObject('Object Repository/RA-01_LIVETV_placeorderby buyorder/Page_Login  SHOP LC/input_Email or Phone Number_loginEmail'), 
    Email)

WebUI.setText(findTestObject('Object Repository/RA-01_LIVETV_placeorderby buyorder/Page_Login  SHOP LC/input_Password  PIN_loginPassword'), 
    Password)

WebUI.click(findTestObject('Object Repository/RA-01_LIVETV_placeorderby buyorder/Page_Login  SHOP LC/button_LOG IN'))

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/RA-01_LIVETV_placeorderby buyorder/Page_Shop LC  Online Shopping Channel Jewel_6abe2b/a_Live TV'))

WebUI.click(findTestObject('Object Repository/RA-01_LIVETV_placeorderby buyorder/Page_Jewelry on TV  Watch Shop LC Live Stre_1713f8/path'))

WebUI.click(findTestObject('Object Repository/RA-01_LIVETV_placeorderby buyorder/Page_Jewelry on TV  Watch Shop LC Live Stre_1713f8/img_Next auction is loading_selectedProductImage'))

WebUI.verifyElementVisible(findTestObject('Object Repository/RA-01_LIVETV_placeorderby buyorder/Page_Jewelry on TV  Watch Shop LC Live Stre_1713f8/h4_ADD TO LIVE TV CART'))

WebUI.waitForElementPresent(findTestObject('RA-01_LIVETV_placeorderby buyorder/Page_Jewelry on TV  Watch Shop LC Live Stre_1713f8/h4_ADD TO LIVE TV CART'), 
    8)

WebUI.click(findTestObject('Object Repository/RA-01_LIVETV_placeorderby buyorder/Page_Jewelry on TV  Watch Shop LC Live Stre_1713f8/button_OK'))

WebUI.click(findTestObject('Object Repository/RA-01_LIVETV_placeorderby buyorder/Page_Jewelry on TV  Watch Shop LC Live Stre_1713f8/a_Buy Now'))

WebUI.verifyElementPresent(findTestObject('Object Repository/RA-01_LIVETV_placeorderby buyorder/Page_Jewelry on TV  Watch Shop LC Live Stre_1713f8/h4_ADD TO LIVE TV CART'), 
    10)

WebUI.click(findTestObject('Object Repository/RA-01_LIVETV_placeorderby buyorder/Page_Jewelry on TV  Watch Shop LC Live Stre_1713f8/button_OK'))

WebUI.selectOptionByValue(findTestObject('Object Repository/RA-01_LIVETV_placeorderby buyorder/Page_Jewelry on TV  Watch Shop LC Live Stre_1713f8/select_Select optionGoldtone ( 119.99 )Rose_df4d96'), 
    'Goldtone', true)

WebUI.click(findTestObject('Object Repository/RA-01_LIVETV_placeorderby buyorder/Page_Jewelry on TV  Watch Shop LC Live Stre_1713f8/a_Buy Now'))

WebUI.waitForPageLoad(10)

WebUI.click(findTestObject('Object Repository/RA-01_LIVETV_placeorderby buyorder/Page_Checkout  SHOP LC/button_Place Order'))

WebUI.verifyElementPresent(findTestObject('Object Repository/RA-01_LIVETV_placeorderby buyorder/Page_Sites-SHOP_LC-Site  SHOP LC/h2_ORDER CONFIRMATION'), 
    8)

WebUI.closeBrowser()

