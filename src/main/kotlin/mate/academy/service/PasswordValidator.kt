package mate.academy.service

import mate.academy.exception.PasswordValidationException
const val LENGTH_PASSWORD = 10

// This class will validate password requirements
class PasswordValidator {
    fun validate(password: String, repeatPassword: String) {
        if (password != repeatPassword || password.length < LENGTH_PASSWORD) {
            throw PasswordValidationException("Wrong passwords")
        }
    }
}
