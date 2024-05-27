package mate.academy.service

import mate.academy.exception.PasswordValidationException
import mate.academy.model.User

// This class represents a user service with user registration functionality
class UserService {

    private val passwordValidator = PasswordValidator()

    fun saveUser(user: User): String {
        return "User ${user.username} saved successfully."
    }

    fun registerUser(username: String, password: String, repeatPassword: String): String {
        try {
            passwordValidator.validate(password, repeatPassword)
            val user = User(username, password)
            return saveUser(user)
        } catch (ex: PasswordValidationException) {
            return "Your passwords are incorrect. Try again."
        }
    }
}
