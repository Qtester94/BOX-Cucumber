import com.kms.katalon.core.annotation.AfterTestCase
import com.kms.katalon.core.context.TestCaseContext

import internal.GlobalVariable




class CollectTestAndResult {

	@AfterTestCase
	def afterTestCase(TestCaseContext testCaseContext) {
	
			
		def tc_ids = testCaseContext.getTestCaseVariables()['testrail_tc_id'].split(",")

			
		for (def n : (0 .. tc_ids.length - 1)) {
			GlobalVariable.G_run_testrail_tc_id.add(tc_ids[n])
			GlobalVariable.G_run_testrail_tc_status.add(testCaseContext.getTestCaseStatus())
			
			
}	
println(GlobalVariable.G_run_testrail_tc_id)
}
}