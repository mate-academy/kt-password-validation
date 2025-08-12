package mate.academy.service

import mate.academy.exception.PasswordValidationException

// This class will validate password requirements
const val PASSWORD_MIN_LENGTH = 10
class PasswordValidator {
    fun validate(password: String, repeatPassword: String) {
        if (password.length < PASSWORD_MIN_LENGTH || password != repeatPassword) {
            throw PasswordValidationException()
        }
    }
}
