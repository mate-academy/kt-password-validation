package mate.academy.service

import mate.academy.exception.PasswordValidationException
import mate.academy.model.User

class UserService {
    private val validator = PasswordValidator()

    private fun saveUser(user: User) : String {
        // This is where you would typically save the user to a database
        return "User ${user.username} saved successfully."
    }

    fun registerUser(username: String, password: String, repeatPassword: String) : String {
        try {
            validator.validate(password, repeatPassword)
        } catch (e: PasswordValidationException) {
            return "Your passwords are incorrect. Try again."
        }
        saveUser(User(username, password))
        return "User $username saved successfully."
    }
}
