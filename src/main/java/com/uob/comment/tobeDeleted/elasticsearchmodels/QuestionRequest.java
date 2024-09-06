package com.uob.comment.tobeDeleted.elasticsearchmodels;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;
import lombok.NonNull;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class QuestionRequest {


    @NonNull
    @NotEmpty(message = "Title cannot be empty")
    private String title;
    private String details;

    @NonNull
    @NotEmpty(message = "Tags cannot be empty")
    private List<String> tags;  // Tag must not be null


    @JsonProperty("question_id")
    private String questionId;

    @JsonProperty("created_date")
    private LocalDateTime createdDate;

    @JsonProperty("updated_date")
    private LocalDateTime updatedDate;
}

