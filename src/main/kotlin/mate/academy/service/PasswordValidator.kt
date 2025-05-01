package mate.academy.service

import mate.academy.exception.PasswordValidationException

private const val MIN_PASSWORD_LENGTH = 10
// This class will validate password requirements
class PasswordValidator {
    fun validate(password: String, repeatPassword: String) {
        if (password.length < MIN_PASSWORD_LENGTH || password != repeatPassword) {
            throw PasswordValidationException("Wrong passwords")
        }
    }
}
