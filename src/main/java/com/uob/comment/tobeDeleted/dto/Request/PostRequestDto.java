package com.uob.comment.tobeDeleted.dto.Request;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.web.multipart.MultipartFile;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;


@Data
@Setter
@Getter
@NoArgsConstructor
public class PostRequestDto {
    private String title;
    private String body;
    private String type; //question/answer
    private BigInteger parentId;
    private List<BigInteger> tagIds; // List of tag IDs
    private List<MultipartFile> mediaFiles;

    public PostRequestDto(PostRequestDto other) {
        this.title = other.title;
        this.body = other.body;
        this.type = other.type;
        this.parentId = other.parentId;
        this.tagIds = other.tagIds != null ? new ArrayList<>(other.tagIds) : null;
        this.mediaFiles = other.mediaFiles != null ? new ArrayList<>(other.mediaFiles) : null;
    }

}
