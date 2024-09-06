package com.uob.comment.tobeDeleted.dto.Response;


import com.uob.comment.tobeDeleted.dto.Common.QuestionDetail;
import com.uob.comment.tobeDeleted.dto.Common.TagSelected;
import com.uob.comment.tobeDeleted.dto.Common.UserDetail;
import com.uob.comment.tobeDeleted.dto.Common.UserProfile;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Data
@Getter
@Setter
public class PreCaptureResponseDetailsDTO {
    private List<TagSelected> tags;
    private List<QuestionDetail.QuestionDetailIncomplete> top_question_list;
    private List<QuestionDetail.QuestionDetailIncomplete> newest_question_list;
    private List<QuestionDetail.QuestionDetailIncomplete> open_question_list;
    private List<QuestionDetail.QuestionDetailIncomplete> oldest_question_list;
    private List<UserDetail> top_perfomers;
    private UserProfile user_profile;
}
