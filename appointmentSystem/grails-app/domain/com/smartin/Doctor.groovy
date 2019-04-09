package com.smartin

class Doctor {
String fullName
String qualification
String position
String doctorEmail
String password
String doctorOffice
String doctorPhone
String bio
static hasMany=[prescriptions:Prescription, appointments:Appointment, patients:Patient, nurses:Nurse]
String toString() {
return fullName
}
    static constraints = {
fullName blank:false, nullable:false
qualification blank:false, nullable:false
position blank:false, nullable:false
doctorEmail blank:false, nullable:false
password blank:false, nullable:false
doctorOffice blank:false, nullable:false
doctorPhone blank:false, nullable:false
bio blank:false, nullable:false
    }
}
