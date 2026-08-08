package mate.academy.service

import mate.academy.model.User
import mate.academy.exception.PasswordValidationException

class UserService {

    private fun saveUser(user: User) : String {
        return "User ${user.username} saved successfully."
    }

    fun registerUser(username: String, password: String, repeatPassword: String) : String {
        val passwordValidator = PasswordValidator()
        return try {
            passwordValidator.validate(password, repeatPassword)
            val user = User(username, password)
            saveUser(user)
        } catch (e: PasswordValidationException) {
            "Your passwords are incorrect. Try again."
        }
    }
}
