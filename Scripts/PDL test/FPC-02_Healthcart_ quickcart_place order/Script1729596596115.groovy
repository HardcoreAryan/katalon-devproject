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

WebUI.click(findTestObject('Object Repository/FPC-02 quikcart_place order/Page_Shop LC  Online Shopping Channel Jewel_6abe2b/span_Login  Join Us'))

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/FPC-02 quikcart_place order/Page_Login  SHOP LC/input_Email or Phone Number_loginEmail'))

WebUI.setText(findTestObject('Object Repository/FPC-02 quikcart_place order/Page_Login  SHOP LC/input_Email or Phone Number_loginEmail'), 
    Email)

WebUI.setText(findTestObject('Object Repository/FPC-02 quikcart_place order/Page_Login  SHOP LC/input_Password  PIN_loginPassword'), 
    Password)

WebUI.click(findTestObject('Object Repository/FPC-02 quikcart_place order/Page_Login  SHOP LC/button_LOG IN'))

WebUI.mouseOver(findTestObject('Object Repository/FPC-02 quikcart_place order/Page_Shop LC  Online Shopping Channel Jewel_6abe2b/a_Health  Beauty'))

WebUI.click(findTestObject('FPC-02 quikcart_place order/Page_Shop LC  Online Shopping Channel Jewel_6abe2b/a_Health  Beauty'))

WebUI.delay(10)

WebUI.waitForElementPresent(findTestObject('FPC-01_health cart place order/Page_Find amazing products in Health  Beauty today  Shop LC  SHOP LC/img_Refine by Style fragrance_tile-image productTileImage'), 
    10)

WebUI.mouseOver(findTestObject('FPC-01_health cart place order/Page_Find amazing products in Health  Beauty today  Shop LC  SHOP LC/img_Refine by Style fragrance_tile-image productTileImage'))

WebUI.delay(10)

WebUI.waitForElementPresent(findTestObject('FPC-02 quikcart_place order/Page_Find amazing products in Health  Beaut_c97146/span_QUICK VIEW'), 
    10)

WebUI.verifyElementClickable(findTestObject('Object Repository/FPC-02 quikcart_place order/Page_Find amazing products in Health  Beaut_c97146/span_QUICK VIEW'))

WebUI.doubleClick(findTestObject('FPC-02 quikcart_place order/Page_Find amazing products in Health  Beaut_c97146/span_QUICK VIEW'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(10)

WebUI.waitForElementVisible(findTestObject('FPC-02 quikcart_place order/Page_Find amazing products in Health  Beaut_c97146/span_ADD TO CART'), 
    10)

WebUI.verifyElementClickable(findTestObject('FPC-02 quikcart_place order/Page_Find amazing products in Health  Beaut_c97146/span_ADD TO CART'))

WebUI.click(findTestObject('FPC-02 quikcart_place order/Page_Find amazing products in Health  Beaut_c97146/span_ADD TO CART'))

WebUI.waitForElementVisible(findTestObject('FPC-02 quikcart_place order/Page_Find amazing products in Health  Beaut_c97146/a_View Cart'), 
    10)

WebUI.click(findTestObject('Object Repository/FPC-02 quikcart_place order/Page_Find amazing products in Health  Beaut_c97146/a_View Cart'))

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/FPC-02 quikcart_place order/Page_Your Shopping Cart  SHOP LC/a_Secure Checkout'))

WebUI.closeBrowser()

