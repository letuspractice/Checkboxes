import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

String dynamicId = '0'
String xpath = '//label[@for="checkid' + dynamicId + '"]'
TestObject to = new TestObject("objectName")
to.addProperty("xpath", ConditionType.EQUALS, xpath)
WebUI.click(to)