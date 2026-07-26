package Dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class UserCommentPostResponseDto {

    private Long idUser;
    private Long idPost;
    private String contentPost;
}
