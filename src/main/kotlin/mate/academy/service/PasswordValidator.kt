package mate.academy.service

import mate.academy.exception.PasswordValidationException

const val PASSWORD_LENGTH = 10
class PasswordValidator {
    fun validate(password: String, repeatPassword: String) {
    if (password.length < PASSWORD_LENGTH) {
            throw PasswordValidationException("Wrong passwords")
    }
        if (password != repeatPassword) {
            throw PasswordValidationException("Wrong passwords")
        }
    }
}
