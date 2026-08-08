package mate.academy.service

import mate.academy.exception.PasswordValidationException

// This class will validate password requirements
const val PASSWORD_REQUIRED_LENGTH = 10

class PasswordValidator {
    fun validate(password: String, repeatPassword: String) {
        if (password.length < PASSWORD_REQUIRED_LENGTH || repeatPassword != password)
            throw PasswordValidationException("Wrong passwords")
    }
}
