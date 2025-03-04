package ru.yandex.practicum.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BlogsModel implements Serializable {
    private Long id;
    private String title;
    private String shotText;
    private String picture;
    private String tags;
    private Integer commentsCount;
    private Integer likeCount;
}
