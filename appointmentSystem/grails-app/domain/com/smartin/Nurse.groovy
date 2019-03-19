package com.smartin

class Nurse {
String nurseName
String qualifications
String nurseEmail
String nurseOffice
String nursePhone
static hasMany=[doctors:Doctor]
static belongsTo=[Doctor]
    static constraints = {
nurseName blank:false, nullable:false
qualifications blank:false, nullable:false
nurseEmail blank:false, nullable:false
nursePhone blank:false, nullable:false
    }
}
