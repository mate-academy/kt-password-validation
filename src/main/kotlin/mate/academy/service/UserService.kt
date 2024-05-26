package mate.academy.service

import mate.academy.exception.PasswordValidationException
import mate.academy.model.User

class UserService {
    fun registerUser(username: String, password: String, repeatPassword: String) = try {
        PasswordValidator().validate(password, repeatPassword)
        saveUser(User(username, password))
    } catch (_: PasswordValidationException) {
        "Your passwords are incorrect. Try again."
    }

    private fun saveUser(user: User): String {
        return "User ${user.username} saved successfully."
    }
}
