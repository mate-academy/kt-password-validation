package mate.academy.service

import mate.academy.exception.PasswordValidationException

const val PASSWORD_LENGTH_MIN = 10
// This class will validate password requirements
class PasswordValidator {
    fun validate(password: String, repeatPassword: String) {
        if (password != repeatPassword || password.length < PASSWORD_LENGTH_MIN) {
            throw PasswordValidationException("Wrong passwords")
        }
    }
}
