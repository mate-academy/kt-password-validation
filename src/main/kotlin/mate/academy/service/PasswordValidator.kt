package mate.academy.service

import mate.academy.exception.PasswordValidationException

// This class will validate password requirements
class PasswordValidator {
    fun validate(password: String, repeatPassword: String) {
        if (password != repeatPassword || password.length < 10) {
            throw PasswordValidationException("Wrong passwords")
        }
    }
}
