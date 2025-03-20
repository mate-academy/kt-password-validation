package mate.academy.service

import mate.academy.exception.PasswordValidationException

const val MIN_LENGTH: Int = 10

class PasswordValidator {
    fun validate(password: String, repeatPassword: String) {
        if (password != repeatPassword || password.length < MIN_LENGTH) {
            throw PasswordValidationException("Wrong passwords")
        }
    }
}
