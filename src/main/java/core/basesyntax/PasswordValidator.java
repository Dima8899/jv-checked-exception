package core.basesyntax;

public class PasswordValidator {
    public void validate(String password, String repeatPassword) throws PasswordValidationException {
        if (password == null || repeatPassword == null) {
            throw new PasswordValidationException("Password or repeat password cannot be null");
        }

        if (!password.equals(repeatPassword)) {
            throw new PasswordValidationException("Passwords do not match");
        }

        if (password.length() < 10) {
            throw new PasswordValidationException("Password should be at least 10 characters");
        }

    }
}
