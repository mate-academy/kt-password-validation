package mate.academy.service

import mate.academy.exception.PasswordValidationException
import mate.academy.model.User

// This class represents a user service with user registration functionality
class UserService {
    private val passwordValidator = PasswordValidator()

    fun saveUser(user: User) : String {
        // This is where you would typically save the user to a database
        return "User ${user.username} saved successfully."
    }

    fun registerUser(username: String, password: String, repeatPassword: String) : String {
            return try {
                // Викликаємо валідацію
                passwordValidator.validate(password, repeatPassword)

                // Якщо валідація пройшла успішно, створюємо об'єкт і зберігаємо
                val user = User(username, password)
                saveUser(user)
            } catch (e: PasswordValidationException) {
                // Обробка випадку, якщо паролі невірні
                "Your passwords are incorrect. Try again."
            }

    }
}
