<!doctype html>
<html>
<head>
<asset:stylesheet src="homepage.css"/>
    <meta name="layout" content="main"/>
    <title>Hospital Appointment System</title>
</head>
<body>
<asset:image src="hospital.jpeg"/>
<h3>Welcome to the Hospital Appointment System</h3>
<div class="first">
<h3>Receptionist Login</h3>
<button type="button" class="btn-login">
<g:link controller="receptionist" action="ReceptionistLogin">Sign in</g:link>
</button>
</div>

<br>
<br>
<br>
<br>

<div class="second">
<h3>Doctor Login</h3>
<button type="button" class="btn-login">
<g:link controller="doctor" action="DoctorLogin">Sign in</g:link>
</button>
</div>

<asset:image src="download.png"/>
<div id="content" role="main">
    <section class="row colset-2-its">
   


</body>
</html>
