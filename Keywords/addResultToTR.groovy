import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.TestObjectProperty
import com.kms.katalon.core.testobject.impl.HttpTextBodyContent
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import groovy.json.JsonSlurper




class addResultToTR {
	/**
	 * Refresh browser
	 */
	@Keyword
	def add_results(String id, String request) {
		def slurper = new JsonSlurper()
		RequestObject ro = new RequestObject('Add TestRail results')
		ro.setRestRequestMethod('POST')
		ro.setRestUrl('https://boxkatalon.testrail.io/index.php?/api/v2/add_results_for_cases/' + id)

		def httpheader = new ArrayList<TestObjectProperty>()
		httpheader.add(new TestObjectProperty(
				'Content-Type', ConditionType.EQUALS, 'application/json'))
		httpheader.add(new TestObjectProperty(
				'Authorization', ConditionType.EQUALS,
				'ARWwXG/fPZ73n12WWuho-Jm4bctz6zYnLtpPPMvet'))
		ro.setHttpHeaderProperties(httpheader)

		WebUI.comment('body = ' + request)
		ro.setBodyContent(new HttpTextBodyContent(
				request, 'UTF-8', 'application/json'))

		def response = WSBuiltInKeywords.sendRequest(ro)
		def response_array = slurper.parseText(response.getResponseText())
		return slurper.parseText(response.getResponseText())
	}
}