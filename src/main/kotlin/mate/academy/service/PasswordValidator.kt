package mate.academy.service

import mate.academy.exception.PasswordValidationException

// This class will validate password requirements
class PasswordValidator {
    companion object{
        const val MIN_PASSWORD_LENGTH = 10
    }

    fun validate(password: String, repeatPassword: String) {
        // write your code here
        if (password != repeatPassword || password.length < MIN_PASSWORD_LENGTH) {
            throw PasswordValidationException("Wrong passwords")
        }
    }
}
