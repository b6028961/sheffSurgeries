package com.smartin

class DoctorController {

    def scaffold=Doctor

def DoctorLogin() {

render view:'DoctorLogin'

}


def validate() {
def user = Doctor.findByDoctorEmail(params.email)
if (user && user.password == params.password){
session.user = user
render view:'DoctorPage'
}
else{
flash.message = "Invalid email and password."
render view:'DoctorLogin'
}
}
def logout = {
 session.user = null
 redirect(uri:'/')
 }

}
