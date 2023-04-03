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

//Mobile.tap(findTestObject('Object Repository/Android/Login_Hyperlink_RegisterNow'), 0)

String textViewContent = Mobile.getAttribute(findTestObject('Object Repository/Android/android.widget.TextView - Dont have an account yet Register, now'), 
    'text', 1)

println(textViewContent)

TestObject element = findTestObject('Object Repository/Android/android.widget.TextView - Dont have an account yet Register, now')

// Swipe at the 1/3 part of the element from the right
int startX = Mobile.getElementLeftPosition(element, 0) + ((Mobile.getElementWidth(element, 0) * 2) / 3)

int endX = Mobile.getElementLeftPosition(element, 0) + (Mobile.getElementWidth(element, 0) / 3)

int y = Mobile.getElementTopPosition(element, 0) + (Mobile.getElementHeight(element, 0) / 2)

Mobile.swipe(startX, y, endX, y)

Mobile.setText(findTestObject('Android/Register_Field_Nama'), nama, 0)

Mobile.verifyElementNotVisible(findTestObject('Android/Register_ErrorMsg_NameCantBeEmpty_Field_Nama'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Android/Register_ErrorMsg_NameMustBeAlphabethic_Field_Nama'), 2, FailureHandling.STOP_ON_FAILURE)

Mobile.pressBack()

Mobile.pressBack()

Mobile.pressBack()

Mobile.closeApplication()

