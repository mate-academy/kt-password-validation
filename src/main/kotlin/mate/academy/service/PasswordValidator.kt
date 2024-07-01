package mate.academy.service

import mate.academy.exception.PasswordValidationException
import kotlin.jvm.Throws

const val PASSWORD_BOUNDARY = 10

class PasswordValidator {
    @Throws fun validate(password: String, repeatPassword: String) {
        if (password != repeatPassword || password.length <= PASSWORD_BOUNDARY)
            throw PasswordValidationException("Wrong passwords")
    }
}
