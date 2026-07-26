package Dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserFollowRespondeDto {

    private Long userFollowedId;
    private Long USerFollowerId;

}
