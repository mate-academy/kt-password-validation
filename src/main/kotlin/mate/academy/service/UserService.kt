package mate.academy.service

import mate.academy.exception.PasswordValidationException
import mate.academy.model.User

// This class represents a user service with user registration functionality
class UserService {

    fun saveUser(user: User): String {
        // This is where you would typically save the user to a database
        return "User ${user.username} saved successfully."
    }

    @Throws
    fun registerUser(username: String, password: String, repeatPassword: String): String {
        val validator = PasswordValidator()
        try {
            validator.validate(password, repeatPassword)
            return saveUser(User(username, password))
        } catch (ex: PasswordValidationException) {
            return "Your passwords are incorrect. Try again."
        }
    }
}
