import com.katalon.KatalonHelper
import com.kms.katalon.core.annotation.*
import com.kms.katalon.core.annotation.TearDownTestCase
import com.kms.katalon.core.context.TestSuiteContext
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

class TestListener {
	/**
	 * Executes before every test suite starts.
	 * @param testSuiteContext: related information of the executed test suite.
	 */
	@BeforeTestSuite
	def sampleBeforeTestSuite(TestSuiteContext testSuiteContext) {
		KatalonHelper.updateInfo()
	}
	
	@TearDownTestCase
	def tearDownTestCase()
	{
		WebUI.closeBrowser()
	}
}