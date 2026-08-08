package mate.academy.service

import mate.academy.exception.PasswordValidationException
import mate.academy.model.User

// This class represents a user service with user registration functionality
class UserService {
    val validator = PasswordValidator()

    fun saveUser(user: User) : String {
        // This is where you would typically save the user to a database
        return "User ${user.username} saved successfully."
    }

    fun registerUser(username: String, password: String, repeatPassword: String) : String {
       try {
           validator.validate(password, repeatPassword)
           val user = User(username, password)
           return saveUser(user)
       } catch (_: PasswordValidationException) {
           return "Your passwords are incorrect. Try again."
       }
    }
}
