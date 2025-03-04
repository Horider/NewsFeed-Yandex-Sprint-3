package ru.yandex.practicum.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.sql.Timestamp;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BlogEntity {
    private Long id;
    private Timestamp datetime;
    private String title;
    private String text;
    private String picture;
    private String tags;
    private Integer likeCount;
}
