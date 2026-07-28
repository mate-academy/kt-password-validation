package mate.academy.service

import mate.academy.exception.PasswordValidationException

const val SIZE = 10
// This class will validate password requirements
class PasswordValidator {
    fun validate(password: String, repeatPassword: String) {
        if(password.length < SIZE || password!= repeatPassword) {
            throw PasswordValidationException("Wrong passwords")
        }
    }
}
