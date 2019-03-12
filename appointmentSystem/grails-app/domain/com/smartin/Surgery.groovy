package com.smartin

class Surgery {
string name
string address
string postcode
int telephone
int numberOfPatients
string description
string openingTime
    static constraints = {
name nullable:false, blank:false
address nullable:false, blank:false
postcode nullable:false, blank:false
telephone nullable:false, blank:false
numberOfPatients nullable:false, blank:false
description nullable:false, blank:false, widget:'textarea'
openingTime nullable:false, blank:false
    }
}
