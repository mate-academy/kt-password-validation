package mate.academy.service

import mate.academy.exception.PasswordValidationException

const val VALID_PASSWORD_LENGTH = 10

class PasswordValidator {
    fun validate(password: String, repeatPassword: String) {
        if (password != repeatPassword || password.length < VALID_PASSWORD_LENGTH) {
            throw PasswordValidationException("Wrong passwords")
        }
    }
}
