package mate.academy.service

import mate.academy.exception.PasswordValidationException
import mate.academy.model.User

class UserService {
    private fun saveUser(user: User): String {
        return "User ${user.username} saved successfully."
    }

    @Throws(PasswordValidationException::class)
    fun registerUser(username: String, password: String, repeatPassword: String): String {
        try {
            val passwordValidator = PasswordValidator()
            passwordValidator.validate(password, repeatPassword)
            return saveUser(User(username, password))
        } catch (e: PasswordValidationException) {
            return "Your passwords are incorrect. Try again."
        }
    }
}
