package com.uob.comment.tobeDeleted.dto.Common;


import com.uob.comment.tobeDeleted.dbmodel.Tag;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigInteger;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class PostTagDetails {
        private BigInteger postId;
        private List<Tag> tags;
}
