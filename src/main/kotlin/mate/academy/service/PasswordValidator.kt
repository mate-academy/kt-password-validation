package mate.academy.service

import mate.academy.exception.PasswordValidationException

const val PASSWORD_MIN_LENGTH = 10

// This class will validate password requirements
class PasswordValidator {
    // Declaring that this method can throw a checked exception
    @Throws(PasswordValidationException::class)
    fun validate(password: String, repeatPassword: String) {
        // write your code here
        if (password.length < PASSWORD_MIN_LENGTH ||
                (password != repeatPassword))
            throw PasswordValidationException("Wrong passwords")
    }
}
