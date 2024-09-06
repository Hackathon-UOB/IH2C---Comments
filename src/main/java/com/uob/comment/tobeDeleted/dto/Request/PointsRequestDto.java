package com.uob.comment.tobeDeleted.dto.Request;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.math.BigInteger;

@Data
@Setter
@Getter
public class PointsRequestDto {


    private BigInteger id;
    private BigInteger postId;

    private BigInteger userId;

    private BigInteger points;
}
