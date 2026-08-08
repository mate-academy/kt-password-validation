package mate.academy.service

import mate.academy.exception.PasswordValidationException
import mate.academy.model.User

// This class represents a user service with user registration functionality
class UserService {
    private val passwordValidator = PasswordValidator()

    fun registerUser(username: String, password: String, repeatPassword: String) : String {
        return try {
            // Validate the password
            passwordValidator.validate(password, repeatPassword)
            // If validation succeeds, save the user
            val user = User(username, password)
            saveUser(user)
        } catch (e: PasswordValidationException) {
            // Handle the validation error
            "Your passwords are incorrect. Try again."
        }
    }

    private fun saveUser(user: User) : String {
        // This is where you would typically save the user to a database
        return "User ${user.username} saved successfully."
    }
}
