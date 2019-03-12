package com.smartin

class Paitent {
string patientName
string patientAddress
string patientResidence
date patientDob
string patientID
date dateRegistered
int patientPhone
    static constraints = {
patientName blank:false, nullable:false
patientAddress blank:false, nullable:false
patientResidence blank:false, nullable:false
patientDob blank:false, nullable:false
patientID blank:false, nullable:false
dateRegistered blank:false, nullable:false
patientPhone blank:false, nullable:false
    }
}
