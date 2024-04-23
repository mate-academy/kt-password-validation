package mate.academy.service

import mate.academy.model.User

// This class represents a user service with user registration functionality
class UserService {

    fun saveUser(user: User) : String {
        // This is where you would typically save the user to a database
        return "User ${user.username} saved successfully."
    }

    fun registerUser(username: String, password: String, repeatPassword: String) : String {

    }
}
