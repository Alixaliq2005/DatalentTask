package task.datalenttasks.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import task.datalenttasks.dto.ArticleCreateRequestDto;
import task.datalenttasks.dto.ArticleResponseDto;
import task.datalenttasks.dto.ArticleUpdateRequestDto;
import task.datalenttasks.entity.Article;
import task.datalenttasks.exception.NotFoundArticleException;
import task.datalenttasks.repository.ArticleRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ArticleServiceImpl {
    private final ArticleRepository articleRepository;

    public void createArticle(ArticleCreateRequestDto articleCreateRequestDto) {
        Article article = Article.builder ()
                .title (articleCreateRequestDto.getTitle ())
                .content (articleCreateRequestDto.getContent ())
                .author (articleCreateRequestDto.getAuthor ())
                .build ();
        articleRepository.save (article);
    }

    public void updateArticle(Long id, ArticleUpdateRequestDto updateRequestDto) {
        Article article = articleRepository.findById (id)
                .stream ()
                .findFirst ()
                .orElseThrow (NotFoundArticleException::new);

        article.setAuthor (updateRequestDto.getAuthor ());
        article.setContent (updateRequestDto.getContent ());
        article.setTitle (updateRequestDto.getTitle ());
        articleRepository.save (article);

    }

    public List<ArticleResponseDto> getAll() {
        List<Article> articles = articleRepository.findAll ();
        return articles.stream ().map (article -> ArticleResponseDto.builder ()
                        .id (article.getId ())
                        .content (article.getContent ())
                        .title (article.getTitle ())
                        .author (article.getAuthor ())
                        .build ())
                .toList ();
    }

    public ArticleResponseDto getById(Long id) {
        Article article = articleRepository.findById (id)
                .stream ()
                .findFirst ()
                .orElseThrow (NotFoundArticleException::new);
        return ArticleResponseDto.builder ()
                .author (article.getAuthor ())
                .title (article.getTitle ())
                .content (article.getContent ())
                .build ();
    }

    public void deleteArticle(Long id){
        Article article=articleRepository.findById (id).orElseThrow (NotFoundArticleException::new);
        articleRepository.delete (article);
    }
}
