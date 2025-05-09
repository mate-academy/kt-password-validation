package mate.academy.service

import mate.academy.exception.PasswordValidationException

// This class will validate password requirements
class PasswordValidator {
    companion object {
        const val MESSAGE = "Wrong passwords"
        const val PASSWORD_LENGTH = 10
    }
    fun validate(password: String, repeatPassword: String) {
        if (password.length < PASSWORD_LENGTH) {
            throw PasswordValidationException(MESSAGE)
        }
        if (!password.equals(repeatPassword) || password.length != repeatPassword.length) {
            throw PasswordValidationException(MESSAGE)
        }
    }
}
