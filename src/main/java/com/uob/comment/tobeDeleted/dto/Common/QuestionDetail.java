package com.uob.comment.tobeDeleted.dto.Common;

import com.fasterxml.jackson.annotation.JsonProperty;

import com.uob.comment.tobeDeleted.dbmodel.Tag;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;
import java.time.LocalDateTime;
import java.util.List;

@Data
public class QuestionDetail {

    //modurlarization tak ada ni
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class QuestionDetailIncomplete {
        private BigInteger id;
        private String title;
        private String body;
        private List<Tag> tag;
        private int votes;
        private int views;
        private LocalDateTime createdAt;
        private LocalDateTime updatedAt;
        private UserDetail createdBy;
        private BigInteger answers;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class QuestionDetailComplete {

        private BigInteger id;
        private String title;
        private String body;
        private List<String> tag;
        private BigInteger votes;
        private String status;
        @JsonProperty("created_at")
        private LocalDateTime createdAt;
        @JsonProperty("updated_at")
        private LocalDateTime updatedAt;
        @JsonProperty("created_by")
        private UserDetail createdBy;
        private List<CommentDetail> comments;
        private List<AnswerDetail> answers;
        private  List<String> media;
    }
}

//@Data
//@NoArgsConstructor
//@AllArgsConstructor
//public static class QuestionDetail {
//    private BigInteger id;
//    private String title;
//    private String body;
//    private List<String> tag;
//    private int votes;
//
//    private int answers;
//    private String createdAt;
//    private QuestionResponseDTO.UserDetail createdBy;
//}
