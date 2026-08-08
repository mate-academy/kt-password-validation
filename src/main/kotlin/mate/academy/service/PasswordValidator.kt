package mate.academy.service

import mate.academy.exception.PasswordValidationException

const val MIN_VALUE_THE_LENGTH_OF_PASSWORD = 10

class PasswordValidator {
    fun validate(password: String, repeatPassword: String) {
        if (password != repeatPassword || password.length <= MIN_VALUE_THE_LENGTH_OF_PASSWORD) {
            throw PasswordValidationException("Wrong passwords")
        }
    }
}
