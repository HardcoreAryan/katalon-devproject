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

WebUI.click(findTestObject('Object Repository/FPC-03 Heathcart_place order by fastbuy/Page_ShopLC Online Shopping Channel Jewel/span_Login  Join Us'))

WebUI.setText(findTestObject('Object Repository/FPC-03 Heathcart_place order by fastbuy/Page_Login  SHOP LC/input_Email or Phone Number_loginEmail'), 
    Email)

WebUI.setText(findTestObject('Object Repository/FPC-03 Heathcart_place order by fastbuy/Page_Login  SHOP LC/input_Password  PIN_loginPassword'), 
    Password)

WebUI.click(findTestObject('Object Repository/FPC-03 Heathcart_place order by fastbuy/Page_Login  SHOP LC/button_LOG IN'))

WebUI.click(findTestObject('Object Repository/FPC-03 Heathcart_place order by fastbuy/Page_ShopLC Online Shopping Channel Jewel/a_Health  Beauty'))

WebUI.mouseOver(findTestObject('health -02/Page_Find amazing products in Health  Beauty today  Shop LC  SHOP LC/img_Refine by Style fragrance_tile-image productTileImage'))

WebUI.waitForElementPresent(findTestObject('health -02/Page_Find amazing products in Health  Beauty today  Shop LC  SHOP LC/img_Refine by Style fragrance_tile-image productTileImage'), 
    10)

WebUI.doubleClick(findTestObject('FPC-03 Heathcart_place order by fastbuy/Page_Find amazing products in Health Beaut/span_FAST BUY'))

WebUI.delay(10)

WebUI.waitForElementVisible(findTestObject('Object Repository/FPC-03 Heathcart_place order by fastbuy/Page_Find amazing products in Health Beaut/h4_Budget Pay Authorization'), 
    10)

WebUI.click(findTestObject('Object Repository/FPC-03 Heathcart_place order by fastbuy/Page_Find amazing products in Health Beaut/path'))

WebUI.waitForElementClickable(findTestObject('FPC-03 Heathcart_place order by fastbuy/Page_Find amazing products in Health Beaut/button_OK'), 
    10)

WebUI.click(findTestObject('Object Repository/FPC-03 Heathcart_place order by fastbuy/Page_Find amazing products in Health Beaut/button_OK'))

WebUI.verifyElementVisible(findTestObject('Object Repository/FPC-03 Heathcart_place order by fastbuy/Page_Find amazing products in Health Beaut/h4_WHAT IS FAST BUY'))

WebUI.click(findTestObject('Object Repository/FPC-03 Heathcart_place order by fastbuy/Page_Find amazing products in Health Beaut/a_Activate Fast Buy'))

WebUI.waitForElementClickable(findTestObject('FPC-03 Heathcart_place order by fastbuy/Page_Sites-SHOP_LC-Site  SHOP LC/label_I have read and agree to the Terms an_943613'), 
    8)

WebUI.click(findTestObject('Object Repository/FPC-03 Heathcart_place order by fastbuy/Page_Sites-SHOP_LC-Site  SHOP LC/label_I have read and agree to the Terms an_943613'))

WebUI.click(findTestObject('Object Repository/FPC-03 Heathcart_place order by fastbuy/Page_Sites-SHOP_LC-Site  SHOP LC/button_PLACE ORDER WITH FAST BUY'))

WebUI.verifyElementVisible(findTestObject('Object Repository/FPC-03 Heathcart_place order by fastbuy/Page_Sites-SHOP_LC-Site  SHOP LC/h2_ORDER CONFIRMATION'))

WebUI.closeBrowser()

