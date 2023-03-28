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

response = WS.sendRequest(findTestObject('Postman/Update Profile', [('name') : 'update name', ('whatsapp') : '', ('birth_date') : ''
            , ('photo') : '', ('bio') : '', ('position') : '', ('auth_token') : 'eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiJ9.eyJhdWQiOiIzIiwianRpIjoiZGViZjNkYTgzMDY2YTFhZjYxN2M2ZThmOGFmMDBlZmU5YzQ2MWM5ZWY1Yjc4YWUwZDVhMDkwYWY2Yjc5ZjIzZTJkYzM0MTdlNTM0MTM3ZmMiLCJpYXQiOjE2Nzk3MzMwMjYuMjQ0NDY4LCJuYmYiOjE2Nzk3MzMwMjYuMjQ0NDcxLCJleHAiOjE3MTEzNTU0MjYuMjM1NDAxLCJzdWIiOiI2NCIsInNjb3BlcyI6W119.HincnQRzcoem3UKt6uO1qGgGincU-aD06LuG1zy9WmwCEk5KuvpILjTvzhUhdNaQ3WDUt7HizygVCS3-ZHETh7pc69EcBy1HJkEkbrQlnPQWBlIxOQUD_hdVaCmXJKiRMu-Eaw33vfYpbbfTTnDO6yw6mF4sEm6bxZSR0am7qmrUeJPoZP_utSQUhvKQfCRhthEuT9iUtW6r-vD6-Z9FcWXfvlDFruNl8ZnbmaplgE7CmQgmo17eIgYGqa7VmvAqnAJsajvA4ey5Js_sK_4cTXobIbwPuojFKfkQmtxRweTrcCDUHCR7xwyjP6EuJZ7j_IebECSdyo-mHkQdKkyBTcruExJWTJMJNnarfQQkOt30MPLU5btcj8U9IkGJZxRNycIfm-yJpy0dDfcFQr3g68wvKP4QJzziLMqztDpnI-v-wA3gzH9N3QhZANs04kG4M_yJFnggqo3anbpvvh2VRJqjCEvGOPHUfb9gNLeX0MTYXydZFyg-LUdpYi86vJu41Nx8ogMMFC3dWRGEEsr4ThHOPLVITQOwhMVvhpHcusqQRj9mUqA_GYkhwiCqg40E_bY0IgUGrHeQeTNueUwR1z981rv9Ei4ao8Q6CKI8uc_1uI6S9lZEBrpnacW7tyTZSU-mBCGaSUyocH3r8cnGNn5fmMj5Yfuww60rritvcnc']))

WS.verifyResponseStatusCode(response, 200)

