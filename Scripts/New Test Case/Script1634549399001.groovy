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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.humancondition.com/')

WebUI.delay(5)

//WebUI.click(findTestObject('Object Repository/Page_The Human Condition Solved - World Tra_ed8d51/span_Accept cookies'))

//WebUI.delay(1)

WebUI.scrollToElement(findTestObject('Page_The Human Condition Solved - World Transformation Movement/h2_THE MAIN VIDEOS'),10)

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_The Human Condition Solved - World Tra_ed8d51/a_Audios'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_The Human Condition Solved - World Tra_ed8d51/a_THE Interview'))

WebUI.click(findTestObject('Object Repository/Page_The Human Condition Solved - World Tra_ed8d51/a_Video 1'))

WebUI.click(findTestObject('Object Repository/Page_The Human Condition Solved - World Tra_ed8d51/a_Video 2'))





