package mate.academy.service

import mate.academy.exception.PasswordValidationException

private const val I = 9

// This class will validate password requirements
class PasswordValidator {
    fun validate(password: String, repeatPassword: String) {
        if (!(password == repeatPassword && password.length > I)){
            throw PasswordValidationException("Wrong passwords")
        }
    }
}
