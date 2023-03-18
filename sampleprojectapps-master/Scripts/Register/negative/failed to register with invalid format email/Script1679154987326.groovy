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

Mobile.startApplication('C:\\Users\\Faisal Akmal\\Documents\\Automation\\nodejs-webdriverio-appium\\app\\android\\SampleAndroidApp.apk', 
    true)

Mobile.tap(findTestObject('Register/register.text.createone'), 0)

Mobile.waitForElementPresent(findTestObject('Register/register.input.name'), 0)

Mobile.setText(findTestObject('Register/register.input.name'), 'name', 3)

Mobile.setText(findTestObject('Register/register.input.email'), 'test@email.com', 3)

Mobile.setText(findTestObject('Register/register.input.password'), 'password', 3)

Mobile.setText(findTestObject('Register/register.input.cpassword'), 'password', 3)

Mobile.tap(findTestObject('Register/register.button.register'), 3)

Mobile.closeApplication()

