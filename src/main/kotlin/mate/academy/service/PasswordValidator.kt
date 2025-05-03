package mate.academy.service

import mate.academy.exception.PasswordValidationException

const val PASSWORD_LENGTH_THRESHOLD = 10

class PasswordValidator {
    fun validate(password: String, repeatPassword: String) {
        if (password.length <= PASSWORD_LENGTH_THRESHOLD || password != repeatPassword) {
            throw PasswordValidationException("Wrong passwords")
        }
    }
}
