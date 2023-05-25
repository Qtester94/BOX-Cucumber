<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>addTestToTestRun</name>
   <tag></tag>
   <elementGuidId>c13ffc0e-6461-4461-9a5e-75502d8de5d5</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <autoUpdateContent>false</autoUpdateContent>
   <connectionTimeout>0</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n    \&quot;include_all\&quot;: false,\n    \&quot;case_ids\&quot;: ${tcID}\n} &quot;,
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
      <webElementGuid>e63bf67e-24d6-4ace-bf1f-84627eae1ec2</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Authorization</name>
      <type>Main</type>
      <value>Basic cXRlc3Rlcjk0QGdtYWlsLmNvbTo5IT09eDNMO1YrLmJ4Njs=</value>
      <webElementGuid>638b12ee-77e1-46ee-b95f-9b1098d46bfb</webElementGuid>
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
      <id>bee65070-ddc3-448a-a5bb-ded17e3f798a</id>
      <masked>false</masked>
      <name>runID</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.G_run_testrail_tc_id</defaultValue>
      <description></description>
      <id>31c7ab86-9119-49f7-990f-8a65b82128c8</id>
      <masked>false</masked>
      <name>tcID</name>
   </variables>
   <variables>
      <defaultValue>'/api/v2/update_run/'+GlobalVariable.G_testrail_run_id+'/'+ GlobalVariable.G_run_testrail_tc_id[0]</defaultValue>
      <description></description>
      <id>41661528-1fff-49eb-8a17-f4e04f30d904</id>
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

assertThat(response.getStatusCode()).isEqualTo(200)</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
