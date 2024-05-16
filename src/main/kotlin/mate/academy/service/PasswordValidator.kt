package mate.academy.service

// This class will validate password requirements
import mate.academy.exception.PasswordValidationException

private const val REQUIRED_PASSWORD_LENGTH = 10

class PasswordValidator {
    fun validate(password: String, repeatPassword: String) {
        // write your code here
        if (password != repeatPassword || password.length < REQUIRED_PASSWORD_LENGTH) {
            throw PasswordValidationException("Wrong passwords")
        }
    }
}
