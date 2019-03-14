package com.smartin

class Appointment {
Date appDate
String time
int appDuration
String roomNumber
    static constraints = {
appDate blank:false, nullable:false
time blank:false, nullable:false
appDuration blank:false, nullable:false
roomNumber blank:false, nullable:false 
}
}
