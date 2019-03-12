package com.smartin

class BootStrap {

    def init = { servletContext ->

def surgeSurgery=new Surgery(
	name: 'Surge Surgery',
	address: '23 Extrafall Street Sheffield',
	postcode: 'S11 7Y6',
	telephone: '0114 256 8796',
	numberOfPatients: 201,
	description: 'Surgery centre mainly focused on muscle and join surgeries',
	openingTime: '09:00 - 18:00').save()

def pointonSurgery=new Surgery(
	name: 'Pointon Surgery',
	address: '194 Textbury Road Worksop',
	postcode: 'W36 R54',
	telephone: '0113 890 2934',
	numberOfPatients: 124,
	description: 'Surgery centre mainly focused on acute injuries',
	openingTime: '09:00 - 17:00').save()

def drASimpson=new Doctor(
	fullname: 'Alison Simpson',
	qualification: 'PHD Forensics',
	position: 'GP',
	doctorEmail: 'ASimpson12@yahoo.com',
	password: 'S3e8ufh',
	doctorOffice: 'S-2834',
	doctorPhone: '078 902 2718',
	bio: 'Hello I am a new doctor working as a GP').save()

def drJDowley=new Doctor(
	fullname: 'Jimmy Dowley',
	qualification: 'PHD Sports Science',
	position: 'Assistant Surgeon',
	doctorEmail: 'Jimboy34@hotmail.com',
	password: 'sg6gr9',
	doctorOffice: 'U-9083',
	doctorPhone: '075 098 3849',
	bio: 'Hi im jimmy 34 years old and im just starting my career').save()
    }
    def destroy = {
    }
}
