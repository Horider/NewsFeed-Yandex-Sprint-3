package ru.yandex.practicum.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Objects;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BlogEntity implements Serializable {
    private Long id;
    private Timestamp datetime;
    private String title;
    private String text;
    private String picture;
    private String tags;
    private Integer likeCount;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // Сравнение ссылок
        if (o == null || getClass() != o.getClass()) return false; // Проверка на null и тип

        BlogEntity that = (BlogEntity) o;

        // Если id не null, сравниваем по id
        if (id != null && that.id != null) {
            return id.equals(that.id);
        }

        // Если id null, сравниваем остальные поля
        return (Objects.equals(datetime, that.datetime)) &&
                (Objects.equals(title, that.title)) &&
                (Objects.equals(text, that.text)) &&
                (Objects.equals(picture, that.picture)) &&
                (Objects.equals(tags, that.tags)) &&
                (Objects.equals(likeCount, that.likeCount));
    }
}
