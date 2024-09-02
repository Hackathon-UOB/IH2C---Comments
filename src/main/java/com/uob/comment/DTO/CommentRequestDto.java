package com.uob.comment.DTO;

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
        private BigInteger postId;

        @NotNull
        private BigInteger userId;

        @NotBlank
        private String comment;


        private String createdAt;

        private String updatedAt;


    }

