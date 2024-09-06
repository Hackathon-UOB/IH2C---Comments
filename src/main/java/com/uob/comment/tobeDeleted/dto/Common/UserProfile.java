package com.uob.comment.tobeDeleted.dto.Common;


import com.uob.comment.tobeDeleted.dbmodel.UserTag;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.math.BigInteger;
import java.util.List;

@Data
@Getter
@Setter
public class UserProfile {
    private BigInteger UserId;
    private String UserName;
    private String role;
    private String bio;
    private String avatar;
    private BigInteger total_points;
    private String badge;
    private List<UserTag> tags;
    private List<PointsDetail> point_details;
    //  private List<PointsRange> point_range;
}
