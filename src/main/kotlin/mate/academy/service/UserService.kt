package mate.academy.service

import mate.academy.exception.PasswordValidationException
import mate.academy.model.User

class UserService (
    private val passwordValidator: PasswordValidator = PasswordValidator()
){
    fun saveUser(user: User) : String {
        return "User ${user.username} saved successfully."
    }

    fun registerUser(username: String, password: String, repeatPassword: String) : String {
        try {
            passwordValidator.validate(password, repeatPassword)
        } catch (e: PasswordValidationException) {
            return "Your passwords are incorrect. Try again."
        }

        return saveUser(User(username, password))
    }
}
