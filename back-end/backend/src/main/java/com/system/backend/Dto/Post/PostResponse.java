package com.system.backend.Dto.Post;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Lob;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PostResponse {
    private Integer user_id;
    private String user_name;
    private String title;
    private String content;
    private String publishdate;
    @Lob
    private String img;
}