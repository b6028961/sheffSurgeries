<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Hospital Appointment System</title>
</head>
<body>
<div class="row">

<formset>
 <legend>Advanced Search for Patients</legend>
<table>
 <g:link controller="Patient" form action="advResults">
<tr>
 <td>Patient Name</td>
 <td><g:textField name="patientName" /></td>
 </tr>
<tr>
 <td>Patient ID</td>
 <td><g:textField name="patientID" /></td>
 </tr>
<tr>
 <td>Residence</td>
 <td><g:textField name="residence" /></td>
 </tr>
<tr>
 <td>Query Type:</td>
 <td><g:radioGroup name="queryType" labels="['And','Or','Not']"
values="['and','or','not']" value="and" >
${it.radio} ${it.label}
 </g:radioGroup>
 </td>
 </tr>
<tr>
 <td/>
 <td>
 <g:submitButton name="search" value="Search"/></td>
 </tr>
</g:link>
 </g:form>
 </table>
 </formset>
</div>
</body>
</html>
