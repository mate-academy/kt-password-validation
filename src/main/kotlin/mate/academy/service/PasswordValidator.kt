package mate.academy.service

import mate.academy.exception.PasswordValidationException

private const val DEFAULT_LENGTH = 10

// This class will validate password requirements
class PasswordValidator {
    @Throws(PasswordValidationException::class)
    fun validate(password: String, repeatPassword: String) {
        if ((password.length < DEFAULT_LENGTH || repeatPassword.length < DEFAULT_LENGTH) || password != repeatPassword) {
            throw PasswordValidationException("Wrong passwords")
        }
    }
}
