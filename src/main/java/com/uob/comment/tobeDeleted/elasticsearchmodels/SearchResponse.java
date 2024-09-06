package com.uob.comment.tobeDeleted.elasticsearchmodels;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class SearchResponse {

        private String title;
        private String details;
        private List<String> tags;

        @JsonProperty("question_id")
        private String referenceId;

        @JsonProperty("user_id")
        private String userId;

        @JsonProperty("created_date")
        private LocalDateTime insertedDate;

        @JsonProperty("updated_date")
        private LocalDateTime updatedDate;



}
