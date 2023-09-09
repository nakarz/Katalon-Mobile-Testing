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

Mobile.callTestCase(findTestCase('Reusable-Test/TC0_Launch-Exist-App'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Category/btn_category-navbar'), 0)

Mobile.tap(findTestObject('Category/btn_category-navbar'), 0)

Mobile.verifyElementVisible(findTestObject('Category/txt_title-category-catgory'), 0)

Mobile.verifyElementVisible(findTestObject('Category/btn_search-category'), 0)

Mobile.verifyElementVisible(findTestObject('Category/btn_cart-category'), 0)

Mobile.verifyElementVisible(findTestObject('Category/icon_eg-category'), 0)

Mobile.verifyElementVisible(findTestObject('Category/txt_eg-category'), 0)

Mobile.verifyElementVisible(findTestObject('Category/txt_eg-items-category'), 0)

Mobile.verifyElementVisible(findTestObject('Category/icon_fashions-category'), 0)

Mobile.verifyElementVisible(findTestObject('Category/txt_fashions-category'), 0)

Mobile.verifyElementVisible(findTestObject('Category/txt_fashion-items-category'), 0)

Mobile.verifyElementVisible(findTestObject('Category/icon_baby-gear-category'), 0)

Mobile.verifyElementVisible(findTestObject('Category/txt_baby-gear-category'), 0)

Mobile.verifyElementVisible(findTestObject('Category/txt_baby-gear-items-category'), 0)

Mobile.verifyElementVisible(findTestObject('Category/icon_hf-category'), 0)

Mobile.verifyElementVisible(findTestObject('Category/txt_hf-category'), 0)

Mobile.verifyElementVisible(findTestObject('Category/txt_hf-items-category'), 0)

Mobile.verifyElementVisible(findTestObject('Category/icon_hs-category'), 0)

Mobile.verifyElementVisible(findTestObject('Category/txt_hs-category'), 0)

Mobile.verifyElementVisible(findTestObject('Category/txt_hf-items-category'), 0)

Mobile.verifyElementVisible(findTestObject('Category/icon_oi-category'), 0)

Mobile.verifyElementVisible(findTestObject('Category/txt_oi-category'), 0)

Mobile.verifyElementVisible(findTestObject('Category/txt_oi-items-category'), 0)

