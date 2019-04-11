package com.smartin

class PrescriptionController {

    def scaffold=Prescription

def advSearchPrescription() {

render view:'advSearchPrescription'
}

def advResultPrescription() {
def prescriptionProps = Prescription.metaClass.properties*.name
def prescriptions = Prescription.withCriteria {
 "${params.queryType}" {
params.each { field, value ->
 if (prescriptionProps.grep(field) && value) {
 ilike(field, value)
 }
 }
 }
}
return [ prescriptions : prescriptions ]
 
}
}
