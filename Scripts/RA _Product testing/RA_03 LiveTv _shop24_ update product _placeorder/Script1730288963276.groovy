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

WebUI.click(findTestObject('Object Repository/RA-03 Livetv_shop24_ update product _placeorder/Page_Shop LC  Online Shopping Channel Jewel_6abe2b/span_Login  Join Us'))

WebUI.setText(findTestObject('Object Repository/RA-03 Livetv_shop24_ update product _placeorder/Page_Login  SHOP LC/input_Email or Phone Number_loginEmail'), 
    Email)

WebUI.setText(findTestObject('Object Repository/RA-03 Livetv_shop24_ update product _placeorder/Page_Login  SHOP LC/input_Password  PIN_loginPassword'), 
    Password)

WebUI.click(findTestObject('Object Repository/RA-03 Livetv_shop24_ update product _placeorder/Page_Login  SHOP LC/button_LOG IN'))

WebUI.click(findTestObject('RA-03 Livetv_shop24_ update product _placeorder/Page_Shop LC  Online Shopping Channel Jewel_6abe2b/a_Live TV'))

WebUI.waitForPageLoad(10)

WebUI.click(findTestObject('Object Repository/RA-03 Livetv_shop24_ update product _placeorder/Page_Jewelry on TV Watch Shop LC Live/a_Shop Last 24 Hours'))

WebUI.selectOptionByValue(findTestObject('Object Repository/RA-03 Livetv_shop24_ update product _placeorder/Page_Jewelry on TV Watch Shop LC Live/select_Select Option                       _a3cdd1'), 
    '7327846', true)

WebUI.waitForElementClickable(findTestObject('RA-03 Livetv_shop24_ update product _placeorder/Page_Jewelry on TV Watch Shop LC Live/a_ADD TO CART'), 
    10)

WebUI.click(findTestObject('RA-03 Livetv_shop24_ update product _placeorder/Page_Jewelry on TV Watch Shop LC Live/a_ADD TO CART'))

WebUI.verifyElementPresent(findTestObject('RA-03 Livetv_shop24_ update product _placeorder/Page_Jewelry on TV Watch Shop LC Live/a_Checkout'), 
    10)

WebUI.click(findTestObject('RA-03 Livetv_shop24_ update product _placeorder/Page_Jewelry on TV Watch Shop LC Live/a_Checkout'))

WebUI.verifyElementPresent(findTestObject('Object Repository/RA-03 Livetv_shop24_ update product _placeorder/Page_Checkout  SHOP LC/h1_payment  order'), 
    8)

WebUI.click(findTestObject('Object Repository/RA-03 Livetv_shop24_ update product _placeorder/Page_Checkout  SHOP LC/button_Place Order'))

WebUI.verifyElementPresent(findTestObject('Object Repository/RA-03 Livetv_shop24_ update product _placeorder/Page_Sites-SHOP_LC-Site  SHOP LC/h2_ORDER CONFIRMATION'), 
    8)

WebUI.closeBrowser()

