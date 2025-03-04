package ru.yandex.practicum.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CommentEntity {
    private Long id;
    private Timestamp datetime;
    private Long blog;
    private String comment;
}
