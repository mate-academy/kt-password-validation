package mate.academy.service

import mate.academy.exception.PasswordValidationException

// This class will validate password requirements
class PasswordValidator {
    @Throws(PasswordValidationException::class)
    fun validate(password: String, repeatPassword: String) {
        if ((password.length < 10 || repeatPassword.length < 10) || password != repeatPassword) {
            throw PasswordValidationException("Wrong passwords")
        }
    }
}
