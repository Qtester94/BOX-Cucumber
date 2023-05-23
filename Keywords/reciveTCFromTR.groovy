import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.TestObjectProperty
import com.kms.katalon.core.testobject.impl.HttpTextBodyContent
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords

import groovy.json.JsonSlurper




class reciveTCFromTR {
	/**
	 * Refresh browser
	 */
	@Keyword
	def get_tests(String id) {

		println(id)
		def slurper = new JsonSlurper()
		RequestObject ro = new RequestObject('Get TestRail tests')
		ro.setRestRequestMethod('GET')
		ro.setRestUrl('https://boxkatalon.testrail.io/index.php?/api/v2/get_tests/' + id+"=")

		def httpheader = new ArrayList<TestObjectProperty>()
		httpheader.add(new TestObjectProperty(
				'Content-Type', ConditionType.EQUALS, 'application/json'))

		httpheader.add(new TestObjectProperty(
				'Authorization', ConditionType.EQUALS,
				'cXRlc3Rlcjk0QGdtYWlsLmNvbTo5IT09eDNMO1YrLmJ4Njs='))

		ro.setHttpHeaderProperties(httpheader)
		ro.setBodyContent(
				new HttpTextBodyContent('', 'UTF-8', 'application/json'))

		def response = WSBuiltInKeywords.sendRequest(ro)
		return slurper.parseText(response.getResponseText())
	}
}