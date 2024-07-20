package task.datalenttasks.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import task.datalenttasks.entity.Article;
@Repository
public interface ArticleRepository extends JpaRepository<Article,Long> {
}
