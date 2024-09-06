package com.uob.comment.tobeDeleted.dto.Response;


import com.uob.comment.tobeDeleted.dto.Common.QuestionDetail;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class QuestionResponseDTO {

    private int totalPages;
    private int totalQuestions;
    private int pageKey;
    private List<QuestionDetail> questionList;
}
