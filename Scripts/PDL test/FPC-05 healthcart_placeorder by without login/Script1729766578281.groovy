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

WebUI.delay(10)

WebUI.mouseOver(findTestObject('Object Repository/FPC-05 healthcart _place order by without login/Page_Shop LC Online Shopping Channel Jewel/a_Health  Beauty'))

WebUI.waitForElementVisible(findTestObject('Object Repository/FPC-05 healthcart _place order by without login/Page_Find amazing products in Health Beauty/a_Hair Care'), 
    10)

WebUI.click(findTestObject('FPC-05 healthcart _place order by without login/Page_Find amazing products in Health Beauty/a_Hair Care'))

WebUI.delay(10)

WebUI.waitForElementPresent(findTestObject('FPC-05_-image mouse over/Page_Find amazing products/img_Style_tile-image productTileImage'), 
    10)

WebUI.mouseOver(findTestObject('FPC-05_-image mouse over/Page_Find amazing products/img_Style_tile-image productTileImage'))

WebUI.delay(10)

WebUI.verifyElementPresent(findTestObject('FPC-05_-image mouse over/Page_Find amazing products/a_ADD TO CART'), 
    10)

WebUI.verifyElementClickable(findTestObject('FPC-05_-image mouse over/Page_Find amazing products/a_ADD TO CART'))

WebUI.doubleClick(findTestObject('FPC-05_-image mouse over/Page_Find amazing products/a_ADD TO CART'))

WebUI.waitForElementVisible(findTestObject('FPC-05 healthcart _place order by without login/Page_Find amazing products in Hair Care tod/a_Checkout'), 
    2)

WebUI.click(findTestObject('Object Repository/FPC-05 healthcart _place order by without login/Page_Find amazing products in Hair Care tod/a_Checkout'))

WebUI.delay(10)

WebUI.verifyElementVisible(findTestObject('FPC-05 ____to use after of LOGIN/Page_Checkout  SHOP LC/h1_payment  order'))

WebUI.click(findTestObject('Object Repository/FPC-05 healthcart _place order by without login/Page_Checkout  SHOP LC/input_Contact_dwfrm_billing_contactInfoFiel_477a34'))

WebUI.setText(findTestObject('Object Repository/FPC-05 healthcart _place order by without login/Page_Checkout  SHOP LC/input_Contact_dwfrm_billing_contactInfoFiel_477a34'), 
    'tautomation240@gmail.com')

WebUI.doubleClick(findTestObject('FPC-05 ____to use after of LOGIN/Page_Checkout  SHOP LC/a_Log in'))

WebUI.delay(10)

WebUI.click(findTestObject('FPC-05 ____to use after of LOGIN/Page_Checkout  SHOP LC/a_Log in'))

WebUI.waitForPageLoad(100)

WebUI.verifyElementVisible(findTestObject('FPC-05 ____to use after of LOGIN/Page_Sites-SHOP_LC-Site  SHOP LC/img'))

WebUI.setText(findTestObject('FPC-05 ____to use after of LOGIN/Page_Sites-SHOP_LC-Site  SHOP LC (1)/input_Email or Phone Number_loginEmail'), 
    Email)

WebUI.setText(findTestObject('FPC-05 ____to use after of LOGIN/Page_Sites-SHOP_LC-Site  SHOP LC (1)/input_Password  PIN_loginPassword'), 
    Password)

WebUI.scrollToElement(findTestObject('FPC-05 ____to use after of LOGIN/Page_Sites-SHOP_LC-Site  SHOP LC (1)/button_LOG IN'), 
    10)

WebUI.doubleClick(findTestObject('FPC-05 ____to use after of LOGIN/Page_Sites-SHOP_LC-Site  SHOP LC (1)/button_LOG IN'))

WebUI.delay(5)

WebUI.waitForPageLoad(100)

WebUI.verifyElementPresent(findTestObject('Object Repository/FPC-05 healthcart _place order by without login/Page_Checkout  SHOP LC/h1_payment  order'), 
    10)

WebUI.click(findTestObject('Object Repository/FPC-05 healthcart _place order by without login/Page_Checkout  SHOP LC/a_ADD NEW PAYMENT'))

WebUI.setText(findTestObject('Object Repository/FPC-05 healthcart _place order by without login/Page_Checkout  SHOP LC/input_Name on Card_dwfrm_creditCard_cardNumber'), 
    '4111 1111 1111 1111')

WebUI.click(findTestObject('Object Repository/FPC-05 healthcart _place order by without login/Page_Checkout  SHOP LC/label_Name on Card'))

WebUI.setText(findTestObject('Object Repository/FPC-05 healthcart _place order by without login/Page_Checkout  SHOP LC/input_add new card_dwfrm_creditCard_cardOwner'), 
    'visa')

WebUI.selectOptionByValue(findTestObject('Object Repository/FPC-05 healthcart _place order by without login/Page_Checkout  SHOP LC/select_-                                   _988e24'), 
    '12', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/FPC-05 healthcart _place order by without login/Page_Checkout  SHOP LC/select_-                                   _047769'), 
    '2030', true)

WebUI.setEncryptedText(findTestObject('Object Repository/FPC-05 healthcart _place order by without login/Page_Checkout  SHOP LC/input_year_dwfrm_creditCard_securityCode'), 
    'tzH6RvlfSTg=')

WebUI.click(findTestObject('Object Repository/FPC-05 healthcart _place order by without login/Page_Checkout  SHOP LC/button_ADD NEW PAYMENT'))

WebUI.click(findTestObject('Object Repository/FPC-05 healthcart _place order by without login/Page_Checkout  SHOP LC/button_ok'))

WebUI.click(findTestObject('Object Repository/FPC-05 healthcart _place order by without login/Page_Checkout  SHOP LC/button_Place Order'))

WebUI.click(findTestObject('Object Repository/FPC-05 healthcart _place order by without login/Page_Checkout  SHOP LC/h1_payment  order'))

WebUI.click(findTestObject('Object Repository/FPC-05 healthcart _place order by without login/Page_Checkout  SHOP LC/span_Remove'))

WebUI.click(findTestObject('Object Repository/FPC-05 healthcart _place order by without login/Page_Your Shopping Cart  SHOP LC/h1_SHOPPING CART'))

WebUI.closeBrowser()

