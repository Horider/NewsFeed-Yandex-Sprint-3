package ru.yandex.practicum.news.feed.repository;

import ru.yandex.practicum.news.feed.model.User;

import java.util.List;

public interface UserRepository {
    List<User> findAll();
}
