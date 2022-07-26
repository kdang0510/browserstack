import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import java.awt.Robot as Robot
import java.awt.Toolkit as Toolkit
import java.awt.datatransfer.StringSelection as StringSelection
import java.awt.event.KeyEvent as KeyEvent

import internal.GlobalVariable

public class pdfRobot {
	@Keyword
	public pdfRobotkw() {
	Robot robot = new Robot()
	
	Thread.sleep(1000)
	
	robot.keyPress(KeyEvent.VK_CONTROL)
	
	robot.keyPress(KeyEvent.VK_S)
	
	robot.keyRelease(KeyEvent.VK_S)
	
	robot.keyRelease(KeyEvent.VK_CONTROL)
	
	Thread.sleep(2000)
	
	robot.keyPress(KeyEvent.VK_ENTER)
	
	Thread.sleep(2000)
	
	robot.keyPress(KeyEvent.VK_TAB) // file replace move to yes button
	
	Thread.sleep(2000)
	
	robot.keyPress(KeyEvent.VK_ENTER)
	}
	
}
