package com.smartin

class Appointment {
date appDate
string time
int appDuration
string roomNumber
    static constraints = {
appDate blank:false, nullable:false
time blank:false, nullable:false
appDuration blank:false, nullable:false
roomNumber blank:false, nullable:false 
    }
}
