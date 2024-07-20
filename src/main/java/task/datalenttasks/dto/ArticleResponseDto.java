package task.datalenttasks.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
public class ArticleResponseDto {
    String id;

    String title;

    String content;

    String author;
}