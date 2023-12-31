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

Mobile.callTestCase(findTestCase('TC_Profile/TC1_Access-Profile-Page'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Profile/btn_edit-profile'), 0)

'Get displayed txt on the dialog'
def extractedTitleUserProfile = Mobile.getText(findTestObject('Profile/Edit Profile/txt_title-user_profile-edit_profile'), 
    0)

'Verify if displayed txt is correct'
Mobile.verifyEqual(extractedTitleUserProfile, 'User Profile')

Mobile.verifyElementVisible(findTestObject('Profile/Edit Profile/txt_title-form-edit_profile'), 0)

Mobile.verifyElementVisible(findTestObject('Profile/Edit Profile/txt_title-name-section-edit_profile'), 0)

Mobile.verifyElementVisible(findTestObject('Profile/Edit Profile/txt_title-email-section-edit_profile'), 0)

Mobile.verifyElementVisible(findTestObject('Profile/Edit Profile/txt_title-phone-number-section-edit_profile'), 0)

Mobile.verifyElementVisible(findTestObject('Profile/Edit Profile/txt_title-address-section-edit_profile'), 0)

Mobile.tap(findTestObject('Profile/Edit Profile/btn_back-edit_profile'), 0)

