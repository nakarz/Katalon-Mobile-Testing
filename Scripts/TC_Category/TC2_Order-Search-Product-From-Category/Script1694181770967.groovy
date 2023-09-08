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

Mobile.callTestCase(findTestCase('TC_Category/TC1_Access-Category-Page'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Category/btn_fashions-category'), 0)

Mobile.tap(findTestObject('Category/Fashions/btn_product-man-batik-category_fashion'), 0)

Mobile.verifyElementVisible(findTestObject('Category/Fashions/txt_product-title-men-batik-category_fashion'), 0)

Mobile.verifyElementVisible(findTestObject('Category/Fashions/txt_product-price-25usd-category_fashion'), 0)

Mobile.verifyElementVisible(findTestObject('Category/Fashions/txt_product-count-28itemsmen-batik-category_fashion'), 0)

Mobile.verifyElementVisible(findTestObject('Category/Fashions/btn_add-to-cart-men-batik-category_fashion'), 0)

Mobile.tap(findTestObject('Category/Fashions/btn_add-to-cart-men-batik-category_fashion'), 0)

Mobile.verifyElementVisible(findTestObject('Category/Fashions/card_product-men-batik-category_fashion'), 0)

Mobile.verifyElementVisible(findTestObject('Category/Fashions/txt_product-order-men-batik-category_fashion'), 0)

Mobile.verifyElementVisible(findTestObject('Category/Fashions/btn_cancel-product-men-batik-category_fashion'), 0)

Mobile.verifyElementVisible(findTestObject('Category/Fashions/btn_add-product-men-batik-category_fashion'), 0)

Mobile.setText(findTestObject('Category/Fashions/input_product-men-batik-category_fashion'), '10', 5)

Mobile.tap(findTestObject('Category/Fashions/btn_add-product-men-batik-category_fashion'), 0)

Mobile.tap(findTestObject('Category/Fashions/btn-back-to-fashion-category_fashion'), 0)

Mobile.tap(findTestObject('Category/Fashions/btn-back-to-category-category_fashion'), 0)

Mobile.tap(findTestObject('Category/btn_office-industry-category'), 0)

Mobile.tap(findTestObject('Category/Office and Industry/btn_calcu-doraemon-category_oi'), 0)

Mobile.verifyElementVisible(findTestObject('Category/Office and Industry/txt_product-order-title-calcu-category_oi'), 0)

Mobile.verifyElementVisible(findTestObject('Category/Office and Industry/txt_product-price-calcu-12usd-category_oi'), 0)

Mobile.verifyElementVisible(findTestObject('Category/Office and Industry/txt_product-count-calcu-25items-category_oi'), 
    0)

Mobile.verifyElementVisible(findTestObject('Category/Office and Industry/btn_add-to-cart-category_oi'), 0)

Mobile.tap(findTestObject('Category/Office and Industry/btn_add-to-cart-category_oi'), 0)

Mobile.verifyElementVisible(findTestObject('Category/Office and Industry/card_product-calcu-category_oi'), 0)

Mobile.verifyElementVisible(findTestObject('Category/Office and Industry/txt_product-title-calcu-category_oi'), 0)

Mobile.verifyElementVisible(findTestObject('Category/Office and Industry/btn_add-product-calcu-category_oi'), 0)

Mobile.verifyElementVisible(findTestObject('Category/Office and Industry/btn-cancel-product-calcu-category_oi'), 0)

Mobile.setText(findTestObject('Category/Office and Industry/input_product-calcu-category_oi'), '15', 5)

Mobile.tap(findTestObject('Category/Office and Industry/btn_add-product-calcu-category_oi'), 0)

Mobile.tap(findTestObject('Category/Office and Industry/btn_back-to-oi-category_oi'), 0)

Mobile.tap(findTestObject('Category/Fashions/btn-back-to-category-category_fashion'), 0)

Mobile.tap(findTestObject('Category/btn_home-furniture-category'), 0)

Mobile.tap(findTestObject('Category/Home and Furniture/btn_search-product-category_hf'), 0)

Mobile.setText(findTestObject('Category/Home and Furniture/input_search-product-hf_category'), 'Hanger', 10)

Mobile.tap(findTestObject('Category/Home and Furniture/btn_product-stand-hanger-category_hf'), 0)

Mobile.verifyElementVisible(findTestObject('Category/Home and Furniture/txt_product-title-stand-hanger-category_hf'), 0)

Mobile.verifyElementVisible(findTestObject('Category/Home and Furniture/txt_product-price-stand-hanger-category_hf'), 0)

Mobile.verifyElementVisible(findTestObject('Category/Home and Furniture/txt_product-count-stand-hanger-category_hf'), 0)

Mobile.verifyElementVisible(findTestObject('Category/Home and Furniture/btn_add-to-cart-category_hf'), 0)

Mobile.tap(findTestObject('Category/Home and Furniture/btn_add-to-cart-category_hf'), 0)

Mobile.verifyElementVisible(findTestObject('Category/Home and Furniture/card_product-stand-hanger-category_hf'), 0)

Mobile.verifyElementVisible(findTestObject('Category/Home and Furniture/txt_product-order-stand-hanger-category_hf'), 0)

Mobile.setText(findTestObject('Category/Home and Furniture/input_product-stand-hanger-category_hf'), '5', 10)

Mobile.verifyElementVisible(findTestObject('Category/Home and Furniture/btn_add-product-stand-hanger-category_hf'), 0)

Mobile.verifyElementVisible(findTestObject('Category/Home and Furniture/btn_cancel-product-stand-hanger-category_hf'), 0)

Mobile.tap(findTestObject('Category/Home and Furniture/btn_add-product-stand-hanger-category_hf'), 0)

Mobile.tap(findTestObject('Category/Home and Furniture/btn_back-to-hf-category_hf'), 0)

Mobile.tap(findTestObject('Category/Home and Furniture/btn_back-to-category-category_hf'), 0)

Mobile.tap(findTestObject('Category/Home and Furniture/btn_back-category-category_hf'), 0)

