package com.uob.comment.tobeDeleted.dto.Request;

import com.fasterxml.jackson.annotation.JsonProperty;
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

    @NotNull
    @JsonProperty("user_id")
    private BigInteger userId;

    private String comment;


    private String createdAt;

    private String updatedAt;


}
