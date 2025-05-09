package mate.academy.service


import mate.academy.exception.PasswordValidationException
import mate.academy.model.User

// This class represents a user service with user registration functionality
class UserService {

    fun saveUser(user: User): String {

        return "User ${user.username} saved successfully."
    }

    fun registerUser(username: String, password: String, repeatPassword: String): String {
        try {
            PasswordValidator().validate(password, repeatPassword)
            saveUser(User(username, password))
            return "User $username saved successfully."
        } catch (e: PasswordValidationException) {
            return "Your passwords are incorrect. Try again."
        }
    }
}
