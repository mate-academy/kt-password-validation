package mate.academy.service

import mate.academy.exception.PasswordValidationException

const val PASSWORD_NUMBER = 10
class PasswordValidator {
    fun validate(password: String, repeatPassword: String) {
        if (password != repeatPassword || repeatPassword.length < PASSWORD_NUMBER) {
            throw PasswordValidationException("Wrong passwords")
        }
    }
}
