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
import java.util.regex.Matcher as Matcher
import java.util.regex.Pattern as Pattern
import io.appium.java_client.MobileElement as MobileElement
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty as TestObjectProperty
import org.openqa.selenium.By as By
import org.openqa.selenium.WebElement as WebElement

Mobile.startExistingApplication('com.codingid.codingidhive.betastaging')

Mobile.delay(10)

Mobile.tap(findTestObject('Object Repository/Android/Home_Button_LoginButton'), 2)

Mobile.delay(2)

String textViewContent = Mobile.getAttribute(findTestObject('Object Repository/Android/android.widget.TextView - Dont have an account yet Register, now'), 
    'text', 1)

println(textViewContent)

TestObject element = findTestObject('Object Repository/Android/android.widget.TextView - Dont have an account yet Register, now')

// Swipe at the 1/3 part of the element from the right
int startX = Mobile.getElementLeftPosition(element, 0) + ((Mobile.getElementWidth(element, 0) * 2) / 3)

int endX = Mobile.getElementLeftPosition(element, 0) + (Mobile.getElementWidth(element, 0) / 3)

int y = Mobile.getElementTopPosition(element, 0) + (Mobile.getElementHeight(element, 0) / 2)

Mobile.swipe(startX, y, endX, y)

Mobile.delay(2)

Mobile.setText(findTestObject('Object Repository/Android/Register_rev_Nama'), 'Rizki Kha3rul', 0)

Mobile.tap(findTestObject('Object Repository/Android/Register_button_Calendar'), 0)

Mobile.tap(findTestObject('Object Repository/Android/Register_Calendar_dateOne'), 0)

Mobile.tap(findTestObject('Object Repository/Android/Register_Calendar_Ok (1)'), 0)

Mobile.setText(findTestObject('Object Repository/Android/Register_rev_Email'), 'rizkikhaerulfajri@gmail', 0)

Mobile.setText(findTestObject('Object Repository/Android/Register_rev_Whatsapp'), '123451234512345', 0)

Mobile.setText(findTestObject('Object Repository/Android/Register_rev_KataSandi'), 'testingtesting', 0)

Mobile.setText(findTestObject('Object Repository/Android/Register_rev_KataSandiKonfirmasi'), 'testingtesting', 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Android/Android_rev_DaftarDisabled'), 0)

Mobile.closeApplication()