package com.smartin

class Receptionist {
string recepName
string recepEmail
string recepUsername
string recepPassword
int recepPhone
    static constraints = {
recepName nullable:false, blank:false
recepEmail nullable:false, blank:false
recepUsername nullable:false, blank:false
recepPassword nullable:false, blank:false
recepPhone nullable:false, blank:false
    }
}
