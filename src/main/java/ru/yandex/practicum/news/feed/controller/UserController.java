package ru.yandex.practicum.news.feed.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.yandex.practicum.news.feed.model.User;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/users")
public class UserController {

    @GetMapping("/users")
    public String users(Model model) {
        List<User> users = Arrays.asList(
                new User(1L, "Иван", "Иванов", 30, true),
                new User(2L, "Пётр", "Петров", 25, false),
                new User(3L, "Мария", "Сидорова", 28, true)
        );
        model.addAttribute("users", users);

        return "users";
    }

}