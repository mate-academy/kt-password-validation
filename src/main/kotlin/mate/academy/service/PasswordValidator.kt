package mate.academy.service

import mate.academy.exception.PasswordValidationException

// This class will validate password requirements
class PasswordValidator {
    fun validate(password: String, repeatPassword: String) {
        // write your code here
        if (password.length < 10 || password != repeatPassword) {
            throw PasswordValidationException("Wrong passwords")
        }
    }
}
