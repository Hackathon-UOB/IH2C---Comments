package com.uob.comment.tobeDeleted.dto.Response;

import com.fasterxml.jackson.annotation.JsonProperty;

import com.uob.comment.tobeDeleted.dto.Common.QuestionDetail;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PostResponseDto {

    @JsonProperty("questions_detail")
    private List<QuestionDetail.QuestionDetailComplete> questionsDetail;

}
