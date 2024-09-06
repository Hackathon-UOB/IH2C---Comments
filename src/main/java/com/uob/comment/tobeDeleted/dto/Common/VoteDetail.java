package com.uob.comment.tobeDeleted.dto.Common;

import lombok.*;

import java.math.BigInteger;
import java.time.LocalDateTime;

@Data
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class VoteDetail {
    public BigInteger postId;
    public BigInteger userId;
    public String status; //Voted//Remove Voted
    public LocalDateTime createdAt;
    public LocalDateTime updatedAt;

}
