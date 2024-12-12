package mate.academy.service

import mate.academy.exception.PasswordValidationException

class PasswordValidator {
    fun validate(password: String, repeatPassword: String) {
        if(password !== repeatPassword || password.length < 10) {
            throw PasswordValidationException("Wrong passwords")
        } else {
            println("Password is right")        }
    }
}
