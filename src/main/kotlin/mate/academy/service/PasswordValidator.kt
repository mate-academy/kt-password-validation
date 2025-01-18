package mate.academy.service

import mate.academy.exception.PasswordValidationException

const val MIN_LENGTH = 10

// This class will validate password requirements
class PasswordValidator {
    fun validate(password: String, repeatPassword: String) {
        if (password.length < MIN_LENGTH || repeatPassword.length < MIN_LENGTH || password != repeatPassword) {
            throw PasswordValidationException("Wrong passwords")
        }
    }
}
