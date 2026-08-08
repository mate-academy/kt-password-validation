package mate.academy.service

import mate.academy.exception.PasswordValidationException

const val REQUIRED_LENGTH = 10

// This class will validate password requirements
class PasswordValidator {
    fun validate(password: String, repeatPassword: String) {
        if (password != repeatPassword || password.length < REQUIRED_LENGTH)  {
            throw PasswordValidationException("Wrong passwords")
        }
    }
}
