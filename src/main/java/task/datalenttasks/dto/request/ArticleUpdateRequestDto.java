package task.datalenttasks.dto.request;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import javax.validation.constraints.NotEmpty;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ArticleUpdateRequestDto {
    @NotEmpty(message = "Title can not be empty")
    String title;
    @NotEmpty(message = "Content can not be empty")
    String content;
    @NotEmpty(message = "Author can not be empty ")
    String author;
}
