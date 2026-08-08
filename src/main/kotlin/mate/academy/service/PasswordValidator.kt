package mate.academy.service

import mate.academy.exception.PasswordValidationException

const val MINIMUM_LEN_OF_PASSWORD: Int = 10
// This class will validate password requirements
class PasswordValidator {
    fun validate(password: String, repeatPassword: String) {
        // write your code here
        if (password.length < MINIMUM_LEN_OF_PASSWORD
            || password != repeatPassword) {
            throw PasswordValidationException("Wrong passwords")
        }
    }
}
