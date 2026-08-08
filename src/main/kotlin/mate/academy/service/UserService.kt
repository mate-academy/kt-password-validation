package mate.academy.service

import mate.academy.exception.PasswordValidationException
import mate.academy.model.User

// This class represents a user service with user registration functionality
class UserService {
private val passwordValidator = PasswordValidator()
    fun saveUser(user: User) : String {
        // This is where you would typically save the user to a database
        return "User ${user.username} saved successfully."
    }

    fun registerUser(username: String, password: String, repeatPassword: String) : String {
        return try {
            passwordValidator.validate(password, repeatPassword)

            val user = User(username = username,
                            password = password)

            saveUser(user)
        } catch (e: PasswordValidationException) {
            "Your passwords are incorrect. Try again."
        }
    }
}
