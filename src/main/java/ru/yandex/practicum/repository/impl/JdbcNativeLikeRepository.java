package ru.yandex.practicum.repository.impl;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import ru.yandex.practicum.repository.LikeRepository;

@Repository
@AllArgsConstructor
public class JdbcNativeLikeRepository implements LikeRepository {

    @Autowired
    private final JdbcTemplate jdbcTemplate;

    @Override
    public void addLike(Long blogId) {
        jdbcTemplate.update("insert into likes(blog) values(?)", blogId);
    }

}
