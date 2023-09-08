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

WebUI.callTestCase(findTestCase('TC_Cart/TC1_Access-Empty-Cart'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Home Shopping/btn_samsung-galaxy_home-shopping'), 0)

Mobile.verifyElementVisible(findTestObject('Home Shopping/Samsung Galaxy S10/txt_product-title-samsung-s10_home-shopping'), 
    0)

Mobile.verifyElementVisible(findTestObject('Home Shopping/Samsung Galaxy S10/txt_product-price-samsung-899usd-cart'), 0)

Mobile.verifyElementVisible(findTestObject('Home Shopping/Samsung Galaxy S10/txt_product-stock-samsung-5items-cart'), 0)

Mobile.tap(findTestObject('Home Shopping/Samsung Galaxy S10/btn_product-add-cart_home-shopping'), 0)

Mobile.verifyElementVisible(findTestObject('Home Shopping/Samsung Galaxy S10/card_product-order-samsung-s10-home_shopping'), 
    0)

Mobile.setText(findTestObject('Home Shopping/Samsung Galaxy S10/input_product-order-samsung-s10-home_shopping'), '5', 0)

Mobile.tap(findTestObject('Home Shopping/Samsung Galaxy S10/btn_product-add-order-samsung-s10_home-shopping'), 0)

Mobile.tap(findTestObject('Home Shopping/Samsung Galaxy S10/btn_product-cart-home_shopping'), 0)

Mobile.verifyElementVisible(findTestObject('Cart/Checkout/txt_title-shopping-cart_cart'), 0)

Mobile.verifyElementVisible(findTestObject('Cart/btn_back-to-home-cart'), 0)

Mobile.verifyElementVisible(findTestObject('Cart/btn_delete-all-items-cart'), 0)

Mobile.verifyElementVisible(findTestObject('Cart/Checkout/list_of-products-shooping-cart_cart'), 0)

Mobile.verifyElementVisible(findTestObject('Cart/Checkout/image_product-samsung-shopping-cart_cart'), 0)

Mobile.verifyElementVisible(findTestObject('Cart/Checkout/txt_product-title-samsung-shopping-cart_cart'), 0)

Mobile.verifyElementVisible(findTestObject('Cart/Checkout/txt_product-price-4.495usd-samsung-shopping-cart'), 0)

Mobile.verifyElementVisible(findTestObject('Cart/Checkout/txt_product-count-899usdx5-samsung-shopping-cart'), 0)

Mobile.verifyElementVisible(findTestObject('Cart/Checkout/txt_tax10-shopping-cart_cart'), 0)

Mobile.verifyElementVisible(findTestObject('Cart/Checkout/txt_total-price-shopping-cart_cart'), 0)

Mobile.verifyElementVisible(findTestObject('Cart/Checkout/btn_checkout-shopping-cart_cart'), 0)

Mobile.tap(findTestObject('Cart/btn_checkout-product-cart'), 0)

Mobile.verifyElementVisible(findTestObject('Cart/Checkout/Checkout Form/txt_titile-checkout-page_checkout'), 0)

Mobile.verifyElementVisible(findTestObject('Cart/btn_back-to-home-cart'), 0)

Mobile.verifyElementVisible(findTestObject('Cart/Checkout/Checkout Form/input_name-form_checkout'), 0)

Mobile.verifyElementVisible(findTestObject('Cart/Checkout/Checkout Form/input_email-form_checkout'), 0)

Mobile.verifyElementVisible(findTestObject('Cart/Checkout/Checkout Form/input_pn-form_checkout'), 0)

Mobile.verifyElementVisible(findTestObject('Cart/Checkout/Checkout Form/input_address-form_checkout'), 0)

Mobile.verifyElementVisible(findTestObject('Cart/Checkout/Checkout Form/input_shipping-form_checkout'), 0)

Mobile.tap(findTestObject('Cart/Checkout/Checkout Form/input_shipping-form_checkout'), 0)

Mobile.verifyElementVisible(findTestObject('Cart/Checkout/Checkout Form/input_list-shipping-tnt-form_checkout'), 0)

Mobile.verifyElementVisible(findTestObject('Cart/Checkout/Checkout Form/input_list-shipping-dhl-form_checkout'), 0)

Mobile.verifyElementVisible(findTestObject('Cart/Checkout/Checkout Form/input_list-shipping-fedex-form_checkout'), 0)

Mobile.verifyElementVisible(findTestObject('Cart/Checkout/Checkout Form/input_list-shipping-ups-form_checkout'), 0)

Mobile.verifyElementVisible(findTestObject('Cart/Checkout/Checkout Form/input_list-shipping-cod-form_checkout'), 0)

Mobile.verifyElementVisible(findTestObject('Cart/Checkout/Checkout Form/input_list-shipping-paypal-form_checkout'), 0)

Mobile.tap(findTestObject('Cart/Checkout/Checkout Form/input_list-shipping-dhl-form_checkout'), 0)

Mobile.scrollToText('Comment', FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Cart/Checkout/Checkout Form/input_comment-form_checkout'), 0)

Mobile.setText(findTestObject('Cart/Checkout/Checkout Form/input_comment-form_checkout'), 'letakkan barang di pos satpam', 
    0)

Mobile.tap(findTestObject('Cart/Checkout/Checkout Form/btn_process-checkout_checkout'), 0)

Mobile.verifyElementVisible(findTestObject('Cart/Checkout/Checkout Form/card_sure-checkout_checkout'), 0)

Mobile.verifyElementVisible(findTestObject('Cart/Checkout/Checkout Form/txt_title-process-checkout_checkout'), 0)

Mobile.verifyElementVisible(findTestObject('Cart/Checkout/Checkout Form/txt_sure-checkout_checkout'), 0)

Mobile.verifyElementVisible(findTestObject('Cart/Checkout/Checkout Form/btn_yes-checkout_checkout'), 0)

Mobile.verifyElementVisible(findTestObject('Cart/Checkout/Checkout Form/btn_no-checkout_checkout'), 0)

Mobile.tap(findTestObject('Cart/Checkout/Checkout Form/btn_yes-checkout_checkout'), 0)

Mobile.verifyElementVisible(findTestObject('Cart/Checkout/Checkout Form/card_success-checkout_checkout'), 0)

Mobile.verifyElementVisible(findTestObject('Cart/Checkout/Checkout Form/txt_congratulation-checkout_checkout'), 0)

Mobile.verifyElementVisible(findTestObject('Cart/Checkout/Checkout Form/tx_thanks-order-checkout_checkout'), 0)

Mobile.tap(findTestObject('Cart/Checkout/Checkout Form/btn_ok-success-checkout_checkout'), 0)

Mobile.callTestCase(findTestCase('Reusable-Test/TC0_Terminate-App'), [:], FailureHandling.STOP_ON_FAILURE)

