package ru.yandex.practicum.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.yandex.practicum.mapping.CommentMapper;
import ru.yandex.practicum.model.CommentsModel;
import ru.yandex.practicum.repository.CommentRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CommentService {

    private final CommentMapper commentMapper;
    private final CommentRepository commentRepository;

    public List<CommentsModel> findAll(Long blog) {
        return commentRepository.findAll(blog).stream()
                .map(commentMapper::mapToModel)
                .collect(Collectors.toList());
    }

    public void deleteById(Long id)
    {
        commentRepository.deleteById(id);
    }

    public void save(CommentsModel commentsModel)
    {
        commentRepository.save(commentMapper.mapToEntity(commentsModel));
    }

    public void create(CommentsModel commentsModel)
    {
        commentRepository.create(commentMapper.mapToEntity(commentsModel));
    }
}
