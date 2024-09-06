package com.uob.comment.tobeDeleted.dto.Common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDetail {
    private BigInteger userId;
    private String userName;
    private String avatar;
    private BigInteger total_points;
    private String badge;
    private String role;
    private String bio;
}
