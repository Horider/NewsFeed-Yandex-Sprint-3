package ru.yandex.practicum.news.feed.repository;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import ru.yandex.practicum.news.feed.model.User;

import java.util.List;

@Repository
public class JdbcNativeUserRepository implements UserRepository {

    private final JdbcTemplate jdbcTemplate;

    public JdbcNativeUserRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<User> findAll() {
        return jdbcTemplate.query(
                "select id, first_name, last_name, age, active from users",
                (rs, rowNum) -> new User(
                        rs.getLong("id"),
                        rs.getString("first_name"),
                        rs.getString("last_name"),
                        rs.getInt("age"),
                        rs.getBoolean("active")
                ));
    }

}