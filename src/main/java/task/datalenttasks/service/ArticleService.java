package task.datalenttasks.service;

import task.datalenttasks.dto.request.ArticleCreateRequestDto;
import task.datalenttasks.dto.response.ArticleResponseDto;
import task.datalenttasks.dto.request.ArticleUpdateRequestDto;

import java.util.List;

public interface ArticleService {

    void createArticle(ArticleCreateRequestDto articleCreateRequestDto);

    void updateArticle(Long id, ArticleUpdateRequestDto updateRequestDto);

    List<ArticleResponseDto> getAll();

    ArticleResponseDto getById(Long id);

    void deleteArticle(Long id);
}
