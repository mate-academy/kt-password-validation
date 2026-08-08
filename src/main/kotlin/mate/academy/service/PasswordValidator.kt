package mate.academy.service

import mate.academy.exception.PasswordValidationException

// This class will validate password requirements
const val MIN_PASSWORD_LENGTH = 10
const val ERROR_MESSAGE = "Wrong passwords"

class PasswordValidator {
    fun validate(password: String, repeatPassword: String) {
        if (password != repeatPassword || password.length < MIN_PASSWORD_LENGTH) {
            throw PasswordValidationException(ERROR_MESSAGE)
        }
    }
}
