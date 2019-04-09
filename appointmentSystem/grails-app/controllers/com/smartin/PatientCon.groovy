package com.smartin

class PatientController {

    def scaffold=Patient

def advSearchPatients() {

render view:'advSearchPatients'
}

def advResults() {
def patientProps = Patient.metaClass.properties*.name
def patients = Patient.withCriteria {
 "${params.queryType}" {
params.each { field, value ->
 if (patientProps.grep(field) && value) {
 ilike(field, value)
 }
 }
 }
return [ patients : patients ]
 }
}
}


