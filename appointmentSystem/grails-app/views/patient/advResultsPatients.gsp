<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Hospital Appointment System</title>
</head>
<body>
<div class="row">
<h1>Hospital Appointment System</h1>
 <h3>Results</h3>
 <p>Searched
 for patients matching <em>${term}</em>.
 Found <strong>${patients.size()}</strong> patients.
 </p>
 <ul>
 <g:each var="patient" in="${patients}">
 <li><g:link controller="Patient" action="show"
id="${patient.Id}">${patient.patientName}</g:link></li>
 </g:each>
 </ul>
<g:link action='advSearch'>Search Again</g:link>
</div>
</body>
</html>
