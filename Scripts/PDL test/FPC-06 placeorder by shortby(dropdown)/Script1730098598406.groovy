import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://dev01.shoplc.com/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/FPC-06 place order by shortby(dropdown)/Page_Shop LC Online Shopping Channel Jewel/span_Login  Join Us'))

WebUI.setText(findTestObject('Object Repository/FPC-06 place order by shortby(dropdown)/Page_Login  SHOP LC/input_Email or Phone Number_loginEmail'), 
    Email)

WebUI.setText(findTestObject('Object Repository/FPC-06 place order by shortby(dropdown)/Page_Login  SHOP LC/input_Password  PIN_loginPassword'), 
    Password)

WebUI.click(findTestObject('Object Repository/FPC-06 place order by shortby(dropdown)/Page_Login  SHOP LC/button_LOG IN'))

WebUI.click(findTestObject('Object Repository/FPC-06 place order by shortby(dropdown)/Page_Shop LC Online Shopping Channel Jewel/a_Health  Beauty'))

WebUI.delay(10)

WebDriver driver = DriverFactory.getWebDriver()

List<WebElement> value = driver.findElements(By.xpath('//select[@name=\'sort-order\']/option'))

println(value.size())

for (WebElement e1 : value) {
    println(e1.getText())

    if (e1.getText().equals('Customer Favorites')) {
        e1.click()

        break
    }
}

WebUI.delay(10)

//WebUI.doubleClick(findTestObject('null'))
//WebUI.selectOptionByValue(findTestObject('Object Repository/FPC-06 place order by shortby(dropdown)/Page_Find amazing products in Health Beaut/select_Relevance                           _8069d7'), 
//   'https://dev01.shoplc.com/on/demandware.store/Sites-SHOP_LC-Site/en_US/Search-ShowAjax?cgid=health-and-beauty&srule=discount&start=0&sz=60', 
//   true)
WebUI.mouseOver(findTestObject('FPC-06 dropdwon image/Page_Find amazing products in Health Beauty 1/img_Refin_tile-image productTileImage'))

WebUI.verifyElementPresent(findTestObject('FPC-06 place order by shortby(dropdown)/Page_Find amazing products in Health Beaut/a_ADD TO CART'), 
    10)

WebUI.doubleClick(findTestObject('FPC-06 place order by shortby(dropdown)/Page_Find amazing products in Health Beaut/a_ADD TO CART'))

WebUI.waitForElementVisible(findTestObject('FPC-06 place order by shortby(dropdown)/Page_Find amazing products in Health Beaut/a_Checkout'), 
    8)

WebUI.click(findTestObject('Object Repository/FPC-06 place order by shortby(dropdown)/Page_Find amazing products in Health Beaut/a_Checkout'))

WebUI.verifyElementPresent(findTestObject('Object Repository/FPC-06 place order by shortby(dropdown)/Page_Checkout  SHOP LC/h1_payment  order'), 
    8)

WebUI.click(findTestObject('Object Repository/FPC-06 place order by shortby(dropdown)/Page_Checkout  SHOP LC/button_Place Order'))

WebUI.verifyElementText(findTestObject('Object Repository/FPC-06 place order by shortby(dropdown)/Page_Sites-SHOP_LC-Site  SHOP LC/h2_ORDER CONFIRMATION'), 
    'ORDER CONFIRMATION')

WebUI.delay(10)

WebUI.mouseOver(findTestObject('Object Repository/FPC-06 place order by shortby(dropdown)/Page_Sites-SHOP_LC-Site  SHOP LC/span_Hello, Addy'))

//WebUI.click(findTestObject('Object Repository/FPC-06 place order by shortby(dropdown)/Page_Sites-SHOP_LC-Site  SHOP LC/a_Logout'))
WebUI.closeBrowser()

