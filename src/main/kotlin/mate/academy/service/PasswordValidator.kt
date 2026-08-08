package mate.academy.service

import mate.academy.exception.PasswordValidationException

private const val MIN_PASSWORD_LENGTH = 10

// This class will validate password requirements
class PasswordValidator {
    @Throws(PasswordValidationException::class)  // Declaring that this method can throw a checked exception
    fun validate(password: String, repeatPassword: String) {
        if (password != repeatPassword || password.length < MIN_PASSWORD_LENGTH) {
            throw PasswordValidationException("Wrong passwords")
        }
    }
}
