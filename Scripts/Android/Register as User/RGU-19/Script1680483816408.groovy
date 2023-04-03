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

Mobile.startExistingApplication('com.codingid.codingidhive.betastaging')

Mobile.tap(findTestObject('Object Repository/Android/Home_Button_LoginButton'), 0)

Mobile.tap(findTestObject('Object Repository/Android/Login_Hyperlink_RegisterNow'), 0)

Mobile.setText(findTestObject('Android/Register_Field_KataSandi'), katasandi, 0)

Mobile.verifyElementNotVisible(findTestObject('Android/Register_ErrorMsg_Password atleast must contain_Field_KataSandi'), 
    3)

Mobile.setText(findTestObject('Android/Register_Field_KonfirmasiKataSandi'), konfirmasikatasandi, 0)

Mobile.waitForElementPresent(findTestObject('Android/Register_ErrorMsg_Password not match_Field_KonfirmasiKataSandi'), 3)

Mobile.pressBack()

Mobile.pressBack()

Mobile.pressBack()

Mobile.closeApplication()
