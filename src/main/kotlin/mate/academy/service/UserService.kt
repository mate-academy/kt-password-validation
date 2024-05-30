package mate.academy.service

import mate.academy.exception.PasswordValidationException
import mate.academy.model.User

// This class represents a user service with user registration functionality
class UserService {

    private fun saveUser(user: User): String {
        // This is where you would typically save the user to a database
        return "User ${user.username} saved successfully."
    }

    fun registerUser(username: String, password: String, repeatPassword: String): String {
        val passwordValidator = PasswordValidator()
        try {
            passwordValidator.validate(password, repeatPassword)
            val user = User(username, password)
            return saveUser(user)
        } catch (e: PasswordValidationException) {
            val error = "Your passwords are incorrect. Try again."
            print(error)
            return error
        }
    }
}
