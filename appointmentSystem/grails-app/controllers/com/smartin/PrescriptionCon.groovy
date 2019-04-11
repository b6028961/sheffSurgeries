package com.smartin

class PrescriptionController {

    def scaffold=Prescription

def advSearchPrescriptions() {

render view:'advSearchPrescriptions'
}

def advResultsPres() {
def prescriptionProps = Prescription.metaClass.properties*.name
def prescriptions = Prescription.withCriteria {
 "${params.queryType}" {
params.each { field, value ->
 if (prescriptionProps.grep(field) && value) {
 ilike(field, value)
 }
 }
 }
return [ prescriptions : prescriptions ]
 }
}
}
