import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.TestObjectProperty
import com.kms.katalon.core.testobject.impl.HttpTextBodyContent
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import groovy.json.JsonSlurper




class updateResultToTR {
	/**
	 * Refresh browser
	 */
	@Keyword
	def update_run(String id, String array) {
		def slurper = new JsonSlurper()
		def ro = new RequestObject('Update TestRail test run')
		ro.setRestRequestMethod('POST')
		ro.setRestUrl('https://boxkatalon.testrail.io/index.php?/api/v2/update_run/' + id)

		def httpheader = new ArrayList<TestObjectProperty>()
		httpheader.add(new TestObjectProperty(
				'Content-Type', ConditionType.EQUALS, 'application/json'))
		httpheader.add(new TestObjectProperty(
				'Authorization', ConditionType.EQUALS, 'ARWwXG/fPZ73n12WWuho-Jm4bctz6zYnLtpPPMvet'))
		ro.setHttpHeaderProperties(httpheader)

		def body ="{'include_all': false,'case_ids': " + array + "}"
		WebUI.comment('body = ' + body)
		ro.setBodyContent(
				new HttpTextBodyContent(body, 'UTF-8', 'application/json'))
		def response = WSBuiltInKeywords.sendRequest(ro)
		return slurper.parseText(response.getResponseText())
	}
}