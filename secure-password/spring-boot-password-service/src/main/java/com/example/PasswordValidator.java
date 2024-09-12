package com.example;

import java.util.ArrayList;
import java.util.List;

public class PasswordValidator {

    public static List<String> validate(String password) {
        List<String> errors = new ArrayList<>();
        if (password.length() < 8) {
            errors.add("A senha deve ter pelo menos 8 caracteres.");
        }
        if (!password.matches(".*[A-Z].*")) {
            errors.add("A senha deve conter pelo menos uma letra maiúscula.");
        }
        if (!password.matches(".*[a-z].*")) {
            errors.add("A senha deve conter pelo menos uma letra minúscula.");
        }
        if (!password.matches(".*\\d.*")) {
            errors.add("A senha deve conter pelo menos um dígito numérico.");
        }
        if (!password.matches(".*[!@#$%^&*(),.?\":{}|<>].*")) {
            errors.add("A senha deve conter pelo menos um caractere especial.");
        }
        return errors;
    }
}
