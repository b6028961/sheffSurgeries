package com.smartin

class Prescription {
string pharmacyName
int prescripNumber
string medicine
string totalCost
date dateIssued
boolean patientPaying
    static constraints = {
pharmacyName nullable:false, blank:false
prescripNumber nullable:false, blank:false
medicine nullable:false, blank:false
totalCost nullable:false, blank:false
dateIssued nullable:false, blank:false
patientPaying nullable:false, blank:false
    }
}
