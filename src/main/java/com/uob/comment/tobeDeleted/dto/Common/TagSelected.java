package com.uob.comment.tobeDeleted.dto.Common;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.math.BigInteger;

@Data
@Getter
@Setter
public class TagSelected {
    private BigInteger tag_id;
    private String tag_title;
    private Boolean selected_tag;
    private BigInteger tag_count; //modurlarization tak ada ni
    private String tag_desc; //modurlarization tak ada ni

}
