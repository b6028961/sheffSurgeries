package com.smartin

class ReceptionistController {

    def scaffold=Receptionist

def ReceptionistLogin() {

render view:'ReceptionistLogin'

}


def validate() {
def user = Receptionist.findByRecepUsername(params.username)
if (user && user.password == params.password){
session.user = user
render view:'ReceptionistPage'
}
else{
flash.message = "Invalid username and password."
render view:'ReceptionistLogin'
}
}
def logout = {
 session.user = null
 redirect(uri:'/')
 }

}

