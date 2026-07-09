package mate.academy.service

import mate.academy.exception.PasswordValidationException
import mate.academy.model.User

class UserService(private val passwordValidator: PasswordValidator) {

    fun saveUser(user: User): String {
        // This is where you would typically save the user to a database
        return "User ${user.username} saved successfully."
    }

    fun registerUser(username: String, password: String, repeatPassword: String): String {
        return try {
            passwordValidator.validate(password, repeatPassword)
            saveUser(User(username, password))

        } catch (e: PasswordValidationException) {
            INCORRECT_PASSWORDS_MESSAGE
        }
    }

    private companion object {
        const val INCORRECT_PASSWORDS_MESSAGE =
            "Your passwords are incorrect. Try again."
    }
}
