package mate.academy.service

import mate.academy.exception.PasswordValidationException

private const val PASSKENGTH = 10

// This class will validate password requirements
class PasswordValidator {
    fun validate(password: String, repeatPassword: String) {
        if ((password.length < PASSKENGTH || repeatPassword.length < PASSKENGTH) || (password != repeatPassword)) {
                throw PasswordValidationException("Wrong passwords")
        }
    }
}
