package ru.yandex.practicum.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BlogModel implements Serializable {
    private Long id;
    private String title;
    private String text;
    private List<String> textByParagraph;
    private String picture;
    private String tags;
    private Integer likeCount;
}
