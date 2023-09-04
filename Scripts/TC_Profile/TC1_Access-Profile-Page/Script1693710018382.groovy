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

WebUI.callTestCase(findTestCase('Reusable-Test/TC0_Launch-Exist-App'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Profile/icon_navbar-profile'), 0)

Mobile.tap(findTestObject('Profile/btn_profile-navbar'), 0)

'Get displayed txt on the dialog'
def extractedTitleProfile = Mobile.getText(findTestObject('Profile/txt_title-page_profile'), 0)

'Verify if displayed txt is correct'
Mobile.verifyEqual(extractedTitleProfile, 'Profile')

Mobile.verifyElementVisible(findTestObject('Profile/btn_cart-profile'), 0)

Mobile.verifyElementVisible(findTestObject('Profile/txt_name-profile'), 0)

Mobile.verifyElementVisible(findTestObject('Profile/txt_email-profile'), 0)

Mobile.verifyElementVisible(findTestObject('Profile/txt_phone-number-profile'), 0)

Mobile.verifyElementVisible(findTestObject('Profile/txt_address-profile'), 0)

Mobile.verifyElementVisible(findTestObject('Profile/btn_edit-profile'), 0)

Mobile.verifyElementVisible(findTestObject('Profile/icon_order-history-profile'), 0)

Mobile.verifyElementVisible(findTestObject('Profile/txt_order-history-profile'), 0)

Mobile.verifyElementVisible(findTestObject('Profile/btn_order-history-profile'), 0)

Mobile.verifyElementVisible(findTestObject('Profile/icon_rate-us-profile'), 0)

Mobile.verifyElementVisible(findTestObject('Profile/txt_rate-us-profile'), 0)

Mobile.verifyElementVisible(findTestObject('Profile/btn_rate-us-profile'), 0)

Mobile.verifyElementVisible(findTestObject('Profile/icon_share-profile'), 0)

Mobile.verifyElementVisible(findTestObject('Profile/txt_share-profile'), 0)

Mobile.verifyElementVisible(findTestObject('Profile/btn_share-profile'), 0)

Mobile.verifyElementVisible(findTestObject('Profile/icon_privacy-policy-profile'), 0)

Mobile.verifyElementVisible(findTestObject('Profile/txt_privacy-policy-profile'), 0)

Mobile.verifyElementVisible(findTestObject('Profile/btn_privacy-policy-profile'), 0)

WebUI.callTestCase(findTestCase('Reusable-Test/TC0_Terminate-App'), [:], FailureHandling.STOP_ON_FAILURE)

