# Password Validation

Let's help the user to register 😎 Implement the following methods:

- `registerUser()` in the `UserService` class;
- `validate()` in the `PasswordValidator` class.

The `validate()` method should compare the `password` field with the `repeatPassword` field and check if their length is more or equal to `10`. If not, throw the `PasswordValidationException` exception with the  `Wrong passwords` message. Since it's our custom logic, let's create our own exception. We should handle the not-valid case and return the understandable message.

The `registerUser()` method should call the `validate()` method and handle the exception. If everything is okay, save the user to the database (use the `saveUser()` method). If not, print the  `Your passwords are incorrect. Try again.` message.
