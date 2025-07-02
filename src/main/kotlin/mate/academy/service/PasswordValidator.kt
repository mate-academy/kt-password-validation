package mate.academy.service

import mate.academy.exception.PasswordValidationException

const val TEN = 10
class PasswordValidator {
    fun validate(password: String, repeatPassword: String) {
        if (password != repeatPassword || password.length < TEN) {
            throw PasswordValidationException("Wrong passwords")
        }
    }
}
