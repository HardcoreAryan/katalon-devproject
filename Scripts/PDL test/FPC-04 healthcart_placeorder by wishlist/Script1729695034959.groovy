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

WebUI.click(findTestObject('Object Repository/FPC-04 healthcart_placeorder_by wishlist/Page_Shop LC  Online Shopping Channel Jewel_6abe2b/span_Login  Join Us'))

WebUI.click(findTestObject('Object Repository/FPC-04 healthcart_placeorder_by wishlist/Page_Login  SHOP LC/input_Email or Phone Number_loginEmail'))

WebUI.setText(findTestObject('Object Repository/FPC-04 healthcart_placeorder_by wishlist/Page_Login  SHOP LC/input_Email or Phone Number_loginEmail'), 
    Email)

WebUI.setText(findTestObject('Object Repository/FPC-04 healthcart_placeorder_by wishlist/Page_Login  SHOP LC/input_Password  PIN_loginPassword'), 
    Password)

WebUI.click(findTestObject('Object Repository/FPC-04 healthcart_placeorder_by wishlist/Page_Login  SHOP LC/button_LOG IN'))

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/FPC-04 healthcart_placeorder_by wishlist/Page_Shop LC  Online Shopping Channel Jewel_6abe2b/a_Health  Beauty'))

WebUI.delay(10)

WebUI.waitForElementPresent(findTestObject('FPC-04 healthcart_placeorder_by wishlist/Page_Find amazing products in Health  Beaut_c97146/i_Refine by Product Type Health_fa fa-square-o'), 
    20)

WebUI.waitForElementClickable(findTestObject('FPC-04 healthcart_placeorder_by wishlist/Page_Find amazing products in Health  Beaut_c97146/i_Refine by Product Type Health_fa fa-square-o'), 
    20)

WebUI.doubleClick(findTestObject('Object Repository/FPC-04 healthcart_placeorder_by wishlist/Page_Find amazing products in Health  Beaut_c97146/i_Refine by Product Type Health_fa fa-square-o'))

WebUI.delay(50)

WebUI.waitForElementPresent(findTestObject('FPC-04 healthcart_placeorder_by wishlist/Page_Find amazing products in Health  Beaut_c97146/a_2'), 
    10)

WebUI.doubleClick(findTestObject('Object Repository/FPC-04 healthcart_placeorder_by wishlist/Page_Find amazing products in Health  Beaut_c97146/a_2'))

WebUI.delay(10)

WebUI.mouseOver(findTestObject('Object Repository/FPC-04 healthcart_placeorder_by wishlist/Page_Find amazing products in Health  Beaut_c97146/div_QUICK VIEWADD TO CARTFAST BUY          _f99dd3'))

WebUI.doubleClick(findTestObject('Object Repository/FPC-04 healthcart_placeorder_by wishlist/Page_Find amazing products in Health  Beaut_c97146/img_Remove filter Currently Refined by Prod_19686a'))

WebUI.click(findTestObject('Object Repository/FPC-04 healthcart_placeorder_by wishlist/Page_Find amazing products in Health  Beaut_c97146/span_Wishlist'))

WebUI.delay(20)

WebUI.verifyElementVisible(findTestObject('Object Repository/FPC-04 healthcart_placeorder_by wishlist/Page_Sites-SHOP_LC-Site  SHOP LC/div_Hello, Addy'))

WebUI.click(findTestObject('Object Repository/FPC-04 healthcart_placeorder_by wishlist/Page_Sites-SHOP_LC-Site  SHOP LC/button_Move To Cart'))

WebUI.delay(10)

WebUI.waitForElementVisible(findTestObject('FPC-04 healthcart_placeorder_by wishlist/Page_Sites-SHOP_LC-Site  SHOP LC/a_View Cart'), 
    10)

WebUI.click(findTestObject('Object Repository/FPC-04 healthcart_placeorder_by wishlist/Page_Sites-SHOP_LC-Site  SHOP LC/a_View Cart'))

WebUI.delay(8)

WebUI.waitForElementVisible(findTestObject('Object Repository/FPC-04 healthcart_placeorder_by wishlist/Page_Your Shopping Cart  SHOP LC/h2_Are you sure'), 
    1000)

WebUI.click(findTestObject('Object Repository/FPC-04 healthcart_placeorder_by wishlist/Page_Your Shopping Cart  SHOP LC/a_CHECKOUT NOW'))

WebUI.closeBrowser()

