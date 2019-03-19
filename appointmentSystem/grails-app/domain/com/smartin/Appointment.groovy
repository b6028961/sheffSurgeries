package com.smartin

class Appointment {
Date appDate
String appTime
int appDuration
String roomNumber
Patient patientName
static hasMany=[surgeries:Surgery]
static belongsTo=[Surgery]
    static constraints = {
appDate blank:false, nullable:false
appTime blank:false, nullable:false
appDuration blank:false, nullable:false
roomNumber blank:false, nullable:false 
}
}
