package ru.yandex.practicum.service;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.yandex.practicum.mapping.BlogMapper;
import ru.yandex.practicum.model.BlogEditModel;
import ru.yandex.practicum.model.BlogModel;
import ru.yandex.practicum.model.BlogsModel;
import ru.yandex.practicum.repository.BlogRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class BlogService {

    private final BlogMapper blogMapping;
    private final BlogRepository blogRepository;

    public List<BlogsModel> findPage(Integer page, Integer size) {
        return blogRepository.findPage(page, size).stream()
                .map(blogMapping::mapToModel)
                .collect(Collectors.toList());
    }

    public List<BlogsModel> findPageByTag(Integer page, Integer size, String filterTags) {
        return blogRepository.findPageByTag(page, size,filterTags).stream()
                .map(blogMapping::mapToModel)
                .collect(Collectors.toList());
    }

    public Integer getCount() {
        return blogRepository.getCount();
    }


    public Integer getCountByTag(String filterTags) {
        return blogRepository.getCountByTag(filterTags);
    }

    public BlogModel getById(Long id) {
        return blogMapping.mapToModel(blogRepository.getById(id));
    }

    public void deleteById(Long id)
    {
        blogRepository.deleteById(id);
    }

    public void create(BlogEditModel blogEditModel)
    {
        blogRepository.create(blogMapping.mapToEntity(blogEditModel));
    }

    public void save(BlogEditModel blogEditModel)
    {
        blogRepository.save(blogMapping.mapToEntity(blogEditModel));
    }

}
