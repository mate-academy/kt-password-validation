package mate.academy.service

import mate.academy.exception.PasswordValidationException

private const val REQUIRED_PASSWORD_LENGTH = 10

class PasswordValidator {
    fun validate(password: String, repeatPassword: String) {
        require(password == repeatPassword && password.length >= REQUIRED_PASSWORD_LENGTH) {
            throw PasswordValidationException("Wrong passwords")
        }
    }
}
