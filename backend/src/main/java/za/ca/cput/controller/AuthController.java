package za.ca.cput.controller;

import org.springframework.web.bind.annotation.*;
import za.ca.cput.domain.User;
import za.ca.cput.factory.UserFactory;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/auth")
public class AuthController {
    private final List<User> users = new ArrayList<>();

    @PostMapping("/login")
    public String login(@RequestBody User user) {
        return users.stream()
                .filter(u -> u.getUsername().equals(user.getUsername()) && u.getPassword().equals(user.getPassword()))
                .findFirst()
                .map(u -> "Login successful for " + u.getUsername())
                .orElse("Invalid credentials");
    }

    @PostMapping("/register")
    public User register(@RequestBody User user) {
        User newUser = UserFactory.createUser(user.getUsername(), user.getPassword());
        users.add(newUser);
        return newUser;
    }

    @GetMapping("/all")
    public List<User> getAll() {
        return users;
    }
}
