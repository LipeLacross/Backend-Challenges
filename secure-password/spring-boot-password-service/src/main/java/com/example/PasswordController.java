package com.example;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/validate-password")
public class PasswordController {

    @PostMapping
    public void validatePassword(@RequestBody PasswordRequest request) {
        List<String> errors = PasswordValidator.validate(request.getPassword());
        if (!errors.isEmpty()) {
            throw new PasswordValidationException(errors);
        }
    }
}
