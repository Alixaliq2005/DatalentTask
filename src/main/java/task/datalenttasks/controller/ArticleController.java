package task.datalenttasks.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import task.datalenttasks.dto.ArticleCreateRequestDto;
import task.datalenttasks.dto.ArticleResponseDto;
import task.datalenttasks.dto.ArticleUpdateRequestDto;
import task.datalenttasks.service.ArticleServiceImpl;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class ArticleController {

    private final ArticleServiceImpl articleService;

    @PostMapping("/create")
    public void createArticle(@RequestBody ArticleCreateRequestDto articleCreateRequestDto) {
        articleService.createArticle (articleCreateRequestDto);
    }

    @PutMapping("/update/{id}")
    public void updateArticle(@PathVariable Long id, @RequestBody ArticleUpdateRequestDto articleUpdateRequestDto) {
        articleService.updateArticle (id, articleUpdateRequestDto);
    }

    @GetMapping
    public List<ArticleResponseDto> getAll() {
        return articleService.getAll ();
    }

    @GetMapping("{id}")
    public ArticleResponseDto getById(@PathVariable Long id) {
        return articleService.getById (id);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id){
        articleService.deleteArticle (id);
    }

}

