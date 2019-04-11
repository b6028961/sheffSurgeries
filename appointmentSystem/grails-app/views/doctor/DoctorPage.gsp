<!doctype html>
<html>
<head>
	<asset:stylesheet src="homepage.css"/>
    <meta name="layout" content="main"/>
    <title>Hospital Appointment System</title>
</head>
<body>
<title>Hospital Appointment System</title>

<div class="row">

<div class="Prescription">

<p>Search for Prescriptions</p>
<button type="button" class="btn-success">
<g:link controller="Prescription" action="advSearchPrescriptions">Search For Prescriptions</g:link>
</button>
</div>

<div class="Prescription">

<p>Add Prescription</p>

	<button type="button" class "btn-success">

	<g:link controller="Prescription" action="create">Add Prescription</g:link>
	
	</button>
</div>


<div class="Prescription">

<p>List Prescriptions</p>

	<button type="button" class "btn-success">

	<g:link controller="Prescription" action="index">Show Prescriptions</g:link>
	
	</button>
</div>

<div class="Patient">

<p>List Patients</p>

	<button type="button" class "btn-success">

	<g:link controller="Patient" action="index">Show Patients</g:link>
	
	</button>
</div>



<div class="Appointment">

<p>List Appointments</p>

	<button type="button" class "btn-success">

	<g:link controller="Appointment" action="index">Show Appointments</g:link>
	
	</button>
</div>


<div class="Logout">

<button type="button" class "btn-success">

	<g:link controller="Doctor" action="DoctorLogout">Logout</g:link>
	
	</button>

</div>

<div id="content" role="main">
    <section class="row colset-2-its">
   
</div>

</div>

</body>

</html>

</body>
</html>
