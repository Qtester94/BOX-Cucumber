<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>addResultForCase</name>
   <tag></tag>
   <elementGuidId>32ad9719-eaba-466c-9a28-b324a255acc5</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <autoUpdateContent>false</autoUpdateContent>
   <connectionTimeout>0</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\&quot;status_id\&quot;:${tcStatus}}&quot;,
  &quot;contentType&quot;: &quot;application/json&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;
}</httpBodyContent>
   <httpBodyType>text</httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>application/json</value>
      <webElementGuid>e93e9818-67f3-4809-9b34-422a3784052a</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Authorization</name>
      <type>Main</type>
      <value>Basic cXRlc3Rlcjk0QGdtYWlsLmNvbTo5IT09eDNMO1YrLmJ4Njs=</value>
      <webElementGuid>0a73b899-db46-438f-8871-ecf605aa6589</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>8.6.0</katalonVersion>
   <maxResponseSize>0</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>https://boxkatalon.testrail.io/index.php?${url}=</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>0</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <variables>
      <defaultValue>GlobalVariable.G_testrail_run_id</defaultValue>
      <description></description>
      <id>00c8cd63-ca21-44b7-bde8-3d09036ae753</id>
      <masked>false</masked>
      <name>runID</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.G_run_testrail_tc_id</defaultValue>
      <description></description>
      <id>d060cc30-7ff9-462e-bc8c-130f6ed771ce</id>
      <masked>false</masked>
      <name>tcID</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.G_run_testrail_tc_status[0]</defaultValue>
      <description></description>
      <id>37819068-ee58-499f-bfdb-dd9c976fa8c3</id>
      <masked>false</masked>
      <name>tcStatus</name>
   </variables>
   <variables>
      <defaultValue>'/api/v2/add_result_for_case/' + GlobalVariable.G_testrail_run_id + '/' + GlobalVariable.G_run_testrail_tc_id[0] </defaultValue>
      <description></description>
      <id>fee5df7f-61c7-4f9c-a624-d55568acbdf6</id>
      <masked>false</masked>
      <name>url</name>
   </variables>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()


WS.verifyResponseStatusCode(response, 200)

assertThat(response.getStatusCode()).isEqualTo(200)


</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
