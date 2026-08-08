package mate.academy.service

import mate.academy.exception.PasswordValidationException

// This class will validate password requirements
class PasswordValidator {

    companion object {
        private const val MIN_PASSWORDS_LENGTH = 10
    }

    fun validate(password: String, repeatPassword: String) {
        if (password != repeatPassword || password.length < MIN_PASSWORDS_LENGTH) {
            throw PasswordValidationException("Wrong passwords")
        }
    }
}
