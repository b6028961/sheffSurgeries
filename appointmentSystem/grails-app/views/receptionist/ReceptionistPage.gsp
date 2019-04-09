<!doctype html>
<html>
<head>
	<asset:stylesheet src="homepage.css"/>
    <meta name="layout" content="main"/>
    <title>Hospital Appointment System</title>
</head>
<body>
<div class="row">

 <title>Hospital Appointment System</title>

<div class="Patient">

<p>Add Patient</p>

	<button type="button" class "btn-success">

	<g:link controller="Patient" action="create">Add</g:link>
	
	</button>
</div>



<div class="Doctor">

<p>Add Doctor</p>

	<button type="button" class "btn-success">

	<g:link controller="Doctor" action="create">Add</g:link>
	
	</button>
</div>


<div class="Nurse">

<p>Add Nurse</p>

	<button type="button" class "btn-success">

	<g:link controller="Nurse" action="create">Add</g:link>
	
	</button>
</div>


<div class="Receptionist">

<p>Add Receptionist</p>

	<button type="button" class "btn-success">

	<g:link controller="Receptionist" action="create">Add</g:link>
	
	</button>
</div>




<div class="Patient">

<p>Search for Patients</p>
<button type="button" class="btn-success">
<g:link controller="Patient" action="advSearchPatients">Search For Patients</g:link>
</button>
</div>

<br />

<br />


<div class="Logout">


<button type="button" class "btn-success">

	<g:link controller="Receptionist" action="ReceptionistLogout">Logout</g:link>
	
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
