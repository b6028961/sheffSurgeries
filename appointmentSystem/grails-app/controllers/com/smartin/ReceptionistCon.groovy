package com.smartin

class ReceptionistController {

    def scaffold=Receptionist

def ReceptionistLogin() {

render view:'ReceptionistLogin'

}

def ReceptionistLogout() {

session.user = null

redirect(uri:'/')

}





def validate() {
def user = Receptionist.findByRecepUsername(params.username)
if (user && user.recepPassword == params.password){
session.user = user
render view:'ReceptionistPage'
}
else{
flash.message = "Invalid username and password."
render view:'ReceptionistLogin'
}
}


}
