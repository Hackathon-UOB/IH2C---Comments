package com.uob.comment.tobeDeleted.dto.Common;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.math.BigInteger;

@Data
@Getter
@Setter

//modurlarization called PointDetailDto
public class PointsDetail {
    private String title;
    private BigInteger points;
}
