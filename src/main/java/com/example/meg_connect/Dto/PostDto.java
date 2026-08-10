package com.example.meg_connect.Dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PostDto {


    private Long id;
    private LocalDateTime uploadDate;
    private String content;
    private List<PostImageDto> listPostImages;

}
