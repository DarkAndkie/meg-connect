package Dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserPostinteractDto {

    private Long postId;
    private boolean liked;
    private List<UserCommentPostDto> userComments;
}
