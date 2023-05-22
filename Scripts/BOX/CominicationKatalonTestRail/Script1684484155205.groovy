import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable as GlobalVariable

println("this is a globale varible " + GlobalVariable.G_testrail_run_id)

def response = CustomKeywords.'get_tests'(GlobalVariable.G_testrail_run_id)

println("This is a repsponse "+response)

WebUI.comment('response='+response.toString())
def tcs_to_add = []
for (def n:(0..response['id'].size)) {
if (response['case_id'][n].toString()!='null'){
tcs_to_add.add(response['case_id'][n].toString())
}
}

WebUI.comment(tcs_to_add.toString())
def total_tcs_to_update=[]
for (def n:(0..GlobalVariable.G_run_testrail_tc_id.size)) {
if (GlobalVariable.G_run_testrail_tc_id[n].toString()!='null') {
total_tcs_to_update.add(GlobalVariable.G_run_testrail_tc_id[n].toString())
}
}

for (def n:(0..tcs_to_add.size)) {
if (tcs_to_add[n]!='null') {
total_tcs_to_update.add(tcs_to_add[n].toString())
}
}

response = CustomKeywords.'update_run'(GlobalVariable.G_testrail_run_id, total_tcs_to_update)
WebUI.comment('response=' + response.toString())
String request = '{"results": ['
def status_id
for (def n:(0..GlobalVariable.G_run_testrail_tc_id.size)) {
if (GlobalVariable.G_run_testrail_tc_id[n]!='null') {
if (GlobalVariable.G_run_testrail_tc_status[n]=='PASSED'){
status_id='1' //passed
} else {
status_id ='4'
}//retest
request = request.concat('{"case_id":'+GlobalVariable.G_run_testrail_tc_id[n]+',"status_id":'+status_id+',"comment":"AT"},')
}
}


request = request.substring(0, request.length()-1) //removing last excessive comma from request
request = request.concat("]}")
request = request.replaceAll("null,","")
request = request.replaceAll("null","")
WebUI.comment('request=' + request.toString())
response = CustomKeywords.'add_results'(id, request)
WebUI.comment('response=' + response.toString())