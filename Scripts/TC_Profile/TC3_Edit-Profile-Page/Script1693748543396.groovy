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

Mobile.callTestCase(findTestCase('TC_Profile/TC2_Access-Edit-Profile-Page'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Profile/btn_edit-profile'), 0)

// Name Form
Mobile.tap(findTestObject('Profile/Edit Profile/btn_name-section-edit_profile'), 0)

Mobile.verifyElementVisible(findTestObject('Profile/Edit Profile/Section/Name/card_name-form-edit_profile'), 0)

Mobile.verifyElementVisible(findTestObject('Profile/Edit Profile/Section/Name/txt_title-card-name-edit_profile'), 0)

Mobile.verifyElementVisible(findTestObject('Profile/Edit Profile/Section/Name/btn_cancel-name-form-edit_profile'), 0)

Mobile.verifyElementVisible(findTestObject('Profile/Edit Profile/Section/Name/btn_ok-name-form-edit_profile'), 0)

Mobile.setText(findTestObject('Profile/Edit Profile/Section/Name/input_name-form-edit_profile'), GlobalVariable.name, 10)

Mobile.tap(findTestObject('Profile/Edit Profile/Section/Name/btn_ok-name-form-edit_profile'), 0)

// Email Form
Mobile.tap(findTestObject('Profile/Edit Profile/btn_email-section-edit_profile'), 0)

Mobile.verifyElementVisible(findTestObject('Profile/Edit Profile/Section/Email/card_email-form-edit_profile'), 0)

Mobile.verifyElementVisible(findTestObject('Profile/Edit Profile/Section/Email/txt_title-card-email-edit_profile'), 0)

Mobile.verifyElementVisible(findTestObject('Profile/Edit Profile/Section/Email/btn_cancel-email-form-edit_profile'), 0)

Mobile.verifyElementVisible(findTestObject('Profile/Edit Profile/Section/Email/btn_ok-email-form-edit_profile'), 0)

Mobile.setText(findTestObject('Profile/Edit Profile/Section/Email/input_email-form-edit_profile'), GlobalVariable.validEmail, 
    10)

Mobile.tap(findTestObject('Profile/Edit Profile/Section/Email/btn_ok-email-form-edit_profile'), 0)

// Phone Number Form
Mobile.tap(findTestObject('Profile/Edit Profile/btn_phone-number-section-edit_profile'), 0)

Mobile.verifyElementVisible(findTestObject('Profile/Edit Profile/Section/Phone Number/card_pn-form-edit_profile'), 0)

Mobile.verifyElementVisible(findTestObject('Profile/Edit Profile/Section/Phone Number/txt_title-card-pn-edit_profile'), 
    0)

Mobile.verifyElementVisible(findTestObject('Profile/Edit Profile/Section/Phone Number/btn_cancel-pn-form-edit_profile'), 
    0)

Mobile.verifyElementVisible(findTestObject('Profile/Edit Profile/Section/Phone Number/btn_ok-pn-form-edit_profile'), 0)

Mobile.setText(findTestObject('Profile/Edit Profile/Section/Phone Number/input_pn-form-edit_profile'), GlobalVariable.phoneNumber, 
    10)

Mobile.tap(findTestObject('Profile/Edit Profile/Section/Phone Number/btn_ok-pn-form-edit_profile'), 0)

// Address Form
Mobile.tap(findTestObject('Profile/Edit Profile/btn_address-form-edit_profile'), 0)

Mobile.verifyElementVisible(findTestObject('Profile/Edit Profile/Section/Address/card_address-form-edit_profile'), 0)

Mobile.verifyElementVisible(findTestObject('Profile/Edit Profile/Section/Address/txt_title-card-address-edit_profile'), 
    0)

Mobile.verifyElementVisible(findTestObject('Profile/Edit Profile/Section/Address/btn_cancel-address-form-edit_profile'), 
    0)

Mobile.verifyElementVisible(findTestObject('Profile/Edit Profile/Section/Address/btn_ok-address-form-edit_profile'), 0)

Mobile.setText(findTestObject('Profile/Edit Profile/Section/Address/input_address-form-edit_profile'), GlobalVariable.address, 
    10)

Mobile.tap(findTestObject('Profile/Edit Profile/Section/Address/btn_ok-address-form-edit_profile'), 0)

WebUI.callTestCase(findTestCase('Reusable-Test/TC0_Terminate-App'), [:], FailureHandling.STOP_ON_FAILURE)

