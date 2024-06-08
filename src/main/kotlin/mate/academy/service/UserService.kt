package mate.academy.service

import mate.academy.exception.PasswordValidationException
import mate.academy.model.User

// This class represents a user service with user registration functionality
class UserService {
    private val validator = PasswordValidator()
    companion object {
        const val AS = "Your passwords are incorrect. Try again."
    }

    fun saveUser(user: User): String {
        // This is where you would typically save the user to a database
        return "User ${user.username} saved successfully."
    }

    fun registerUser(username: String, password: String, repeatPassword: String): String {
        try {
            validator.validate(password, repeatPassword)
        } catch (e: PasswordValidationException) {
            return AS
        }
        return saveUser(User(username, password))
    }
}
