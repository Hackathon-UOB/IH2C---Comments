package com.uob.comment.tobeDeleted.dto.Common;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;
import java.time.LocalDateTime;
import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class AnswerDetail {
    @JsonProperty("answer_id")
    private BigInteger answerId;
    @JsonProperty("answer_body")
    private String answerBody;
    private BigInteger votes;
    private String status;
    @JsonProperty("created_at")
    private LocalDateTime createdAt;
    @JsonProperty("updated_at")
    private LocalDateTime updatedAt;
    @JsonProperty("created_by")
    private UserDetail createdBy;
    @JsonProperty("answer_comments")
    private List<CommentDetail> answerComments;
    @JsonProperty("media")
    List<String> mediaUrls;
}
