package mate.academy.service

import mate.academy.exception.PasswordValidationException
import mate.academy.model.User
import kotlin.jvm.Throws

// This class represents a user service with user registration functionality
class UserService {
    fun saveUser(user: User): String {
        // This is where you would typically save the user to a database
        return "User ${user.username} saved successfully."
    }

    @Throws(PasswordValidationException::class)
    fun registerUser(username: String, password: String, repeatPassword: String): String {
        var runCatching = kotlin.runCatching {
            PasswordValidator().validate(password = password, repeatPassword = repeatPassword)
        }
        return if (runCatching.isFailure)
            "Your passwords are incorrect. Try again."
        else
            saveUser(User(username, password))
    }
}
