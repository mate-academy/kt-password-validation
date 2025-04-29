package mate.academy.service

import mate.academy.exception.PasswordValidationException
import mate.academy.model.User

class UserService {

    fun saveUser(user: User) : String {
        return "User ${user.username} saved successfully."
    }

    fun registerUser(username: String, password: String, repeatPassword: String) : String {
        val validator = PasswordValidator()
        try {
            validator.validate(password, repeatPassword)
        } catch (e: PasswordValidationException) {
            return "Your passwords are incorrect. Try again."
        }
        val user = User(username, password)
        return saveUser(user)
    }
}
