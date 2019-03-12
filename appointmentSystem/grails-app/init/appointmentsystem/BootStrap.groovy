package com.smartin

class BootStrap {

    def init = { servletContext ->

def surgeSurgery=new Surgery(
	name: 'Surge Surgery',
	address: '23 Extrafall Street Sheffield',
	postcode: 'S11 7Y6',
	telephone: '01142568796',
	numberOfPatients: 201,
	description: 'Surgery centre mainly focused on muscle and join surgeries',
	openingTime: '09:00 - 18:00').save()	
    }
    def destroy = {
    }
}
