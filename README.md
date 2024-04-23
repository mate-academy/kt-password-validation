# Password validation

Let's help the user register :)

We should implement the following methods:

- `registerUser()` in UserService class
- `validate()` in PasswordValidator class

Method `validate()` should compare the `password` field with the `repeatPassword` field and check if their length is more or equal to 10. If not, throw exception `PasswordValidationException` with the message "Wrong passwords" (since it's our custom logic, let's create our own exception. We should handle the not-valid case and return the understandable message).

Method `registerUser()` should call the method `validate()` and handle the exception.
If everything is okay, save the user to the database (use method `saveUser()`),
if not, print the message "Your passwords are incorrect. Try again.".
