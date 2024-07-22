package task.datalenttasks.dto.response;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
public class ArticleResponseDto {
    @NotNull(message = "Id can not be empty")
    String id;
    @NotEmpty(message = "Title can not be empty")
    String title;
    @NotEmpty(message = "Content can not be empty")
    String content;
    @NotEmpty(message = "Author can not be empty ")
    String author;
}