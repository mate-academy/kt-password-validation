package mate.academy.service

import mate.academy.exception.PasswordValidationException

const val PASSWORD_MIN_LENGTH = 10

class PasswordValidator {
    fun validate(password: String, repeatPassword: String) {
        val isValidPassword = password.length >= PASSWORD_MIN_LENGTH &&
                repeatPassword.length >= PASSWORD_MIN_LENGTH &&
                password == repeatPassword
        if (!isValidPassword) {
            throw PasswordValidationException("Wrong passwords")
        }
    }
}
