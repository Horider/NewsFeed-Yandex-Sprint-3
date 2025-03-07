package ru.yandex.practicum.repository;

import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class JdbcNativeLikeRepository implements LikeRepository {

    private final JdbcTemplate jdbcTemplate;

    @Override
    public void addLike(Long blogId) {
        jdbcTemplate.update("insert into likes(blog) values(?)", blogId);
    }

}
