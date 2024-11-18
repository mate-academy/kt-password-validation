package mate.academy.service

import mate.academy.exception.PasswordValidationException

// This class will validate password requirements
class PasswordValidator {
    companion object {
        const val MIN_PASSWORD_LENGTH = 10
    }

    fun validate(password: String, repeatPassword: String) {
        require(password.length >= MIN_PASSWORD_LENGTH && password == repeatPassword) {
            throw PasswordValidationException("Wrong passwords")
        }
    }
}
