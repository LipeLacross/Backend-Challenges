package com.example;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/customer-loans")
public class LoanController {

    @PostMapping
    public Map<String, Object> getLoans(@RequestBody Map<String, Object> request) {
        int age = (int) request.get("age");
        double income = (double) request.get("income");
        String location = (String) request.get("location");
        String name = (String) request.get("name");

        List<Map<String, Object>> loans = new ArrayList<>();

        if (income <= 3000 || (income > 3000 && income <= 5000 && age < 30 && "SP".equals(location))) {
            loans.add(Map.of("type", "PERSONAL", "interest_rate", 4));
        }

        if (income >= 5000) {
            loans.add(Map.of("type", "CONSIGNMENT", "interest_rate", 2));
        }

        if (income <= 3000 || (income > 3000 && income <= 5000 && age < 30 && "SP".equals(location))) {
            loans.add(Map.of("type", "GUARANTEED", "interest_rate", 3));
        }

        return Map.of("customer", name, "loans", loans);
    }
}
