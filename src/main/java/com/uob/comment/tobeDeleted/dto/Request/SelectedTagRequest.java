package com.uob.comment.tobeDeleted.dto.Request;


import com.uob.comment.tobeDeleted.dbmodel.User;
import com.uob.comment.tobeDeleted.dto.Common.TagSelected;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class SelectedTagRequest {
    private List<TagSelected> tags;
    private User user;
}
