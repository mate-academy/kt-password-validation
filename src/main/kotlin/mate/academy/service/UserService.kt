package mate.academy.service

import mate.academy.exception.PasswordValidationException
import mate.academy.model.User

// This class represents a user service with user registration functionality
const val PASSWORD_ERROR_MESSAGE = "Your passwords are incorrect. Try again."
const val SUCCESS_MESSAGE = "User %s saved successfully."

class UserService {
    private val passwordValidator = PasswordValidator()

    fun saveUser(user: User): String {
        // This is where you would typically save the user to a database
        return String.format(SUCCESS_MESSAGE, user.username)
    }

    fun registerUser(username: String, password: String, repeatPassword: String): String {
        return try {
            passwordValidator.validate(password, repeatPassword)
            saveUser(User(username, password))
        } catch (e: PasswordValidationException) {
            PASSWORD_ERROR_MESSAGE
        }
    }
}
