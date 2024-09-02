package com.uob.comment.DTO;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommentDetail {
    @JsonProperty("comment_id")
    private BigInteger commentId;
    @JsonProperty("comment_body")
    private String commentBody;
    @JsonProperty("created_at")
    private LocalDateTime createdAt;
    @JsonProperty("updated_at")
    private LocalDateTime updatedAt;
//    @JsonProperty("created_by")
//    private User createdBy;
//
    private BigInteger user_id;
}