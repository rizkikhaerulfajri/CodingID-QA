<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Update Profile</name>
   <tag></tag>
   <elementGuidId>d04c3aba-2b4a-4823-95cc-956e87fc48b9</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <authorizationRequest>
      <authorizationInfo>
         <entry>
            <key>bearerToken</key>
            <value>eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiJ9.eyJhdWQiOiIzIiwianRpIjoiNDcwMDdlNThiZTFiNjcxNThhNDMyZmIwOTBkOWMwMjcyYTU1ZjA2NzM1MzQ4ZjcwMDAzZjZlYmZiY2ZlYmRmMTYzOGI5MTFiZjM0MTkyNDQiLCJpYXQiOjE2NjcyNjc1MzEuNDMzNTQ3LCJuYmYiOjE2NjcyNjc1MzEuNDMzNTUxLCJleHAiOjE2OTg4MDM1MzEuNDMyMDM4LCJzdWIiOiI2NCIsInNjb3BlcyI6W119.Yp4ktnm01YeJj7GzAL8gdQqIatRaTpwEC5bELXCfJHSzMcSWBLR9vDY4yGA6aLo7mUfMPNHtr9wAWpJDygVzsAZwDi7f-HiUFgfz3YRDLRm2DZVFboVUCxe5lY2al-8iHEvNVhYJY3M7C__ZkACbpcry9wygNtpxOrfIRTz6B7E4neXQOSFf8uV7kDWfzrJWuWb0zNw0Oq_9PGAuxQZYsd41d-7AP7vkD8Z1guVCvxa5PHtUdSRPevWMbAXn3red01iJqApgA9KMTAcjlNMUFuT5zhBW0XALxX_b4blG_uK1XkW7D3ayEo9pr6rAcQO5cZUR7dMM9yK5mbkr6c-gmFPzr5c41lvKAgekOp0QWk66EADibrpo0x2CwnMnmMb7M4zeLqMhJRg0K4FCLTXOJUlBTWiN3ZMJRqyowvHfpEXF7Zuan8cPk456H9jRMYO7CYy9WmdiVi0y890wDKOxufuIW6miGtolBBWcZ2vZ3HHIhAzXeLXia42M8TYEY_GZ6xpk1xgQRdnTM1p-4TwFi2yULIEZP3SVQrahyesXpynNV2yz_eA7X18afuw7htnWsdd6rgmAhZ_ZS6HJqIgykbvNFDnfnsb73VLhguNshUYstgEclaZxBF8nVmvxjvcjlMjxY1PcLkEdKWswYqiZ-oJ0Vlr9rdBTHctBdGyruLM</value>
         </entry>
      </authorizationInfo>
      <authorizationType>Bearer</authorizationType>
   </authorizationRequest>
   <connectionTimeout>0</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;parameters&quot;: [
    {
      &quot;name&quot;: &quot;name&quot;,
      &quot;value&quot;: &quot;${name}&quot;,
      &quot;type&quot;: &quot;text&quot;,
      &quot;contentType&quot;: &quot;&quot;
    },
    {
      &quot;name&quot;: &quot;whatsapp&quot;,
      &quot;value&quot;: &quot;${whatsapp}&quot;,
      &quot;type&quot;: &quot;text&quot;,
      &quot;contentType&quot;: &quot;&quot;
    },
    {
      &quot;name&quot;: &quot;birth_date&quot;,
      &quot;value&quot;: &quot;${birth_date}&quot;,
      &quot;type&quot;: &quot;text&quot;,
      &quot;contentType&quot;: &quot;&quot;
    },
    {
      &quot;name&quot;: &quot;photo&quot;,
      &quot;value&quot;: &quot;${photo}&quot;,
      &quot;type&quot;: &quot;file&quot;,
      &quot;contentType&quot;: &quot;&quot;
    },
    {
      &quot;name&quot;: &quot;bio&quot;,
      &quot;value&quot;: &quot;${bio}&quot;,
      &quot;type&quot;: &quot;text&quot;,
      &quot;contentType&quot;: &quot;&quot;
    },
    {
      &quot;name&quot;: &quot;position&quot;,
      &quot;value&quot;: &quot;${position}&quot;,
      &quot;type&quot;: &quot;text&quot;,
      &quot;contentType&quot;: &quot;&quot;
    }
  ]
}</httpBodyContent>
   <httpBodyType>form-data</httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <webElementGuid>e4b11d53-e97f-4d7c-a6f7-08a926bea813</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Authorization</name>
      <type>Main</type>
      <value>Bearer ${auth_token}</value>
      <webElementGuid>83feebac-115c-4bf0-b592-c5bffdf13cc6</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>8.5.5</katalonVersion>
   <maxResponseSize>0</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>https://demo-app.online/api/updateprofile</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>0</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <variables>
      <defaultValue>'update name'</defaultValue>
      <description></description>
      <id>1508faab-595a-4ec6-a7fa-e402eae5dc7c</id>
      <masked>false</masked>
      <name>name</name>
   </variables>
   <variables>
      <defaultValue>'1234567890'</defaultValue>
      <description></description>
      <id>0b25e8f7-7764-4587-b7d8-fef268962a3d</id>
      <masked>false</masked>
      <name>whatsapp</name>
   </variables>
   <variables>
      <defaultValue>'1995-05-04'</defaultValue>
      <description></description>
      <id>f1164dcb-299b-4aa9-b9bd-8e6e3cc48aa1</id>
      <masked>false</masked>
      <name>birth_date</name>
   </variables>
   <variables>
      <defaultValue>'C:\\Users\\ACER\\Pictures\\ProfilePic.jpg'</defaultValue>
      <description></description>
      <id>08f853ac-8969-4139-9370-09a6bc6d7769</id>
      <masked>false</masked>
      <name>photo</name>
   </variables>
   <variables>
      <defaultValue>'Software Dev'</defaultValue>
      <description></description>
      <id>af4bd152-08aa-4244-a47a-86812af16d0a</id>
      <masked>false</masked>
      <name>bio</name>
   </variables>
   <variables>
      <defaultValue>'mobile dev'</defaultValue>
      <description></description>
      <id>721e9000-3b3f-477a-b3b3-6c69ad4bd350</id>
      <masked>false</masked>
      <name>position</name>
   </variables>
   <variables>
      <defaultValue>'eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiJ9.eyJhdWQiOiIzIiwianRpIjoiZGViZjNkYTgzMDY2YTFhZjYxN2M2ZThmOGFmMDBlZmU5YzQ2MWM5ZWY1Yjc4YWUwZDVhMDkwYWY2Yjc5ZjIzZTJkYzM0MTdlNTM0MTM3ZmMiLCJpYXQiOjE2Nzk3MzMwMjYuMjQ0NDY4LCJuYmYiOjE2Nzk3MzMwMjYuMjQ0NDcxLCJleHAiOjE3MTEzNTU0MjYuMjM1NDAxLCJzdWIiOiI2NCIsInNjb3BlcyI6W119.HincnQRzcoem3UKt6uO1qGgGincU-aD06LuG1zy9WmwCEk5KuvpILjTvzhUhdNaQ3WDUt7HizygVCS3-ZHETh7pc69EcBy1HJkEkbrQlnPQWBlIxOQUD_hdVaCmXJKiRMu-Eaw33vfYpbbfTTnDO6yw6mF4sEm6bxZSR0am7qmrUeJPoZP_utSQUhvKQfCRhthEuT9iUtW6r-vD6-Z9FcWXfvlDFruNl8ZnbmaplgE7CmQgmo17eIgYGqa7VmvAqnAJsajvA4ey5Js_sK_4cTXobIbwPuojFKfkQmtxRweTrcCDUHCR7xwyjP6EuJZ7j_IebECSdyo-mHkQdKkyBTcruExJWTJMJNnarfQQkOt30MPLU5btcj8U9IkGJZxRNycIfm-yJpy0dDfcFQr3g68wvKP4QJzziLMqztDpnI-v-wA3gzH9N3QhZANs04kG4M_yJFnggqo3anbpvvh2VRJqjCEvGOPHUfb9gNLeX0MTYXydZFyg-LUdpYi86vJu41Nx8ogMMFC3dWRGEEsr4ThHOPLVITQOwhMVvhpHcusqQRj9mUqA_GYkhwiCqg40E_bY0IgUGrHeQeTNueUwR1z981rv9Ei4ao8Q6CKI8uc_1uI6S9lZEBrpnacW7tyTZSU-mBCGaSUyocH3r8cnGNn5fmMj5Yfuww60rritvcnc'</defaultValue>
      <description></description>
      <id>c41a6607-e466-421e-bc82-71e10aec8898</id>
      <masked>false</masked>
      <name>auth_token</name>
   </variables>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
