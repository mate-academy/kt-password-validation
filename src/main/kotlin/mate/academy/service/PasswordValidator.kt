package mate.academy.service

import mate.academy.exception.PasswordValidationException

class PasswordValidator {
    fun validate(password: String, repeatPassword: String) {
        if (password != repeatPassword || password.length < MIN_PASSWORD_LENGTH) {
            throw PasswordValidationException(WRONG_PASSWORDS_MESSAGE)
        }
    }

    private companion object {
        const val MIN_PASSWORD_LENGTH = 10
        const val WRONG_PASSWORDS_MESSAGE = "Wrong passwords"
    }
}
