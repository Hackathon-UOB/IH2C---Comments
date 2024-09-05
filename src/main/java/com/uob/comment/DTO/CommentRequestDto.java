package com.uob.comment.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.antlr.v4.runtime.misc.NotNull;

import java.math.BigInteger;

@Data
@Setter
@Getter
public class CommentRequestDto {
        @NotNull
        @JsonProperty("post_id")
        private BigInteger postId;

        @JsonProperty("user_id")
        @NotNull
        private BigInteger userId;

        @NotBlank
        private String comment;


        private String createdAt;

        private String updatedAt;


    }

