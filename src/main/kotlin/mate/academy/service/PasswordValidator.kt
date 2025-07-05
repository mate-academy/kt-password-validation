package mate.academy.service

import mate.academy.exception.PasswordValidationException

const val TEN = 10

class PasswordValidator {
    fun validate(password: String, repeatPassword: String) {
        if (password.length <= TEN || repeatPassword.length <= TEN || password != repeatPassword) {
            throw PasswordValidationException("Wrong passwords")
        }
    }
}
