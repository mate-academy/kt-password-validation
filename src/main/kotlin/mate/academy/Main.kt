package mate.academy

import mate.academy.service.UserService

// Test the UserService implementation
fun main() {
    val userService = UserService()

    // Case where passwords are incorrect
    println(userService.registerUser("testUser", "password123", "password124"))
    // Output: Your passwords are incorrect. Try again.

    // Case where passwords are correct
//    println(userService.registerUser("jane_doe", "correct_password", "correct_password"))
    // Output: User jane_doe saved successfully.
}
