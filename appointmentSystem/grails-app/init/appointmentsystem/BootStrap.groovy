package com.smartin

class BootStrap {

    def init = { servletContext ->

def surgeSurgery=new Surgery(
	name:'Surge Surgery',
	address:'23 Extrafall Street Sheffield',
	postcode:'S11 7Y6',
	telephone:'0114 256 8796',
	numberOfPatients:201,
	description:'Surgery centre mainly focused on muscle and join surgeries',
	openingTime:'09:00 - 18:00').save()

def pointonSurgery=new Surgery(
	name:'Pointon Surgery',
	address:'194 Textbury Road Worksop',
	postcode:'W36 R54',
	telephone:'0113 890 2934',
	numberOfPatients:124,
	description:'Surgery centre mainly focused on acute injuries',
	openingTime:'09:00 - 17:00').save()

def drASimpson=new Doctor(
	fullName:'Alison Simpson',
	qualification:'PHD Forensics',
	position:'GP',
	doctorEmail:'ASimpson12@yahoo.com',
	password:'S3e8ufh',
	doctorOffice:'S-2834',
	doctorPhone:'078 902 2718',
	bio:'Hello I am a new doctor working as a GP').save()

def drJDowley=new Doctor(
	fullName:'Jimmy Dowley',
	qualification:'PHD Sports Science',
	position:'Assistant Surgeon',
	doctorEmail:'Jimboy34@hotmail.com',
	password:'sg6gr9',
	doctorOffice:'U-9083',
	doctorPhone:'075 098 3849',
	bio:'Hi im jimmy 34 years old and im just starting my career').save()

def sDavids=new Patient(
	patientName:'Sam Davids',
	patientAddress:'4 Salis Street Bridlington',
	patientResidence:'Sheffield',
	patientDob:('20/09/1993'),
	patientID:'R4346',
	dateRegistered:('04/01/2017'),
	patientPhone:'0165 893 2810').save()

def bHummel=new Patient(
	patientName:'Billy Hummel',
	patientAddress:'655 Woodylead Road Sheffield',
	patientResidence:'Doncaster',
	patientDob:('18/03/1969'),
	patientID:'E2291',
	dateRegistered:('30/11/2015'),
	patientPhone:'079 5847 4954').save()

def jJones=new Receptionist(
	recepName:'Jim Jones',
	recepEmail:'JJonesy11@hotmail.com',
	recepUsername:'jJones',
	recepPassword:'eggontoast1',
	recepPhone:'079 3645 3823').save()

def fPrince=new Receptionist(
	recepName:'Furby Prince',
	recepEmail:'FurbyP2@yahoo.com',
	recepUsername:'fPrince',
	recepPassword:'solidcheese2',
	recepPhone:'0114 273 9203').save()

def sLove=new Nurse(
	nurseName:'Samantha Love',
	qualifications:'Bsc Nursing',
	nurseEmail:'SammyLoves@yahoo.com',
	nurseOffice:'H-574',
	nursePhone:'079 7394 7920').save()

def cGrantly=new Nurse(
	nurseName:'Cara Grantly',
	qualifications:'General Nurse Level 3 Btec',
	nurseEmail:'CGrantly@hotmail.com',
	nurseOffice:'H-112',
	nursePhone:'079 3722 2223').save()

def appForSDavids=new Appointment(
	appDate:('11/05/2019'),
	appTime:'200pm',
	appDuration:60,
	roomNumber:'A-1802').save()

def appForRWellard=new Appointment(
	appDate:('11/03/2020'),
	appTime:'415pm',
	appDuration:40,
	roomNumber:'A-63').save()

def presForBHummel=new Prescription(
	pharmacyName:'New Green Pharmacy',
	prescripNumber:58578,
	medicine:'Calpol',
	totalCost:'£6.60',
	dateIssued:('02/06/2018'),
	patientPaying:'true').save()

def presForjHouser=new Prescription(
	pharmacyName:'South Seas Pharmacy',
	prescripNumber:950495,
	medicine:'Xerna Pillforicus',
	totalCost:'£19.20',
	dateIssued:('05/11/2017'),
	patientPaying:'false').save()
    }
    def destroy = {
    }
}
