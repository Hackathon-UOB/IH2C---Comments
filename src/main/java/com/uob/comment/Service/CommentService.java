package com.uob.comment.Service;




import com.uob.comment.Repository.CommentRepository;


import com.uob.comment.tobeDeleted.dbmodel.Comment;
import com.uob.comment.tobeDeleted.dbmodel.User;
import com.uob.comment.tobeDeleted.dto.Common.CommentDetail;
import com.uob.comment.tobeDeleted.dto.Common.UserDetail;
import com.uob.comment.tobeDeleted.dto.Request.CommentRequestDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CommentService {

    @Autowired
    private CommentRepository commentRepository;



    public CommentDetail createComment(CommentRequestDto dto) {
        Comment comment = new Comment();
        comment.setUserId(dto.getUserId());
        comment.setPostId(dto.getPostId());
        comment.setComment(dto.getComment());
        comment.setCreatedAt(LocalDateTime.now());
        comment.setUpdatedAt(LocalDateTime.now());
        return mapToCommentDetail(commentRepository.save(comment));

    }

    public Comment updateComment(BigInteger commentId, CommentRequestDto dto) {
        Optional<Comment> optionalComment = commentRepository.findById(commentId);
        if (optionalComment.isPresent()) {
            Comment comment = optionalComment.get();
            comment.setComment(dto.getComment());
            comment.setUpdatedAt(LocalDateTime.now());
            return commentRepository.save(comment);
        } else {
            throw new RuntimeException("Comment not found");
        }
    }

    public void deleteComment(BigInteger commentId) {
        commentRepository.deleteById(commentId);
    }

    public List<CommentDetail> getCommentsByPostId(BigInteger postId) {
        List<Comment> commentList = commentRepository.findByPostId(postId);
        List<CommentDetail> commentDetailList = commentList.stream()
                .map(this::mapToCommentDetail) // Correctly referencing the method
                .collect(Collectors.toList());

        return commentDetailList;
    }

    protected CommentDetail mapToCommentDetail(Comment comment) {
        UserDetail userNew = new UserDetail();
        userNew.setUserId(comment.getUserId());
        CommentDetail commentDetail = new CommentDetail();
        commentDetail.setCommentId(comment.getId());
        commentDetail.setCommentBody(comment.getComment());
        commentDetail.setCreatedAt(comment.getCreatedAt());
        commentDetail.setUpdatedAt(comment.getUpdatedAt());
        commentDetail.setCreatedBy(userNew);

        return commentDetail;
    }

    public CommentDetail mapToCommentDetails(Comment comment) {
        UserDetail userNew = new UserDetail();
        userNew.setUserId(comment.getUserId());
        return CommentDetail.builder()
                .postId(comment.getPostId())
                .commentId(comment.getId())
                .commentBody(comment.getComment())
                .createdAt(comment.getCreatedAt())
                .updatedAt(comment.getUpdatedAt())
                .createdBy(userNew)
                .build();
    }

    public List<CommentDetail> getCommentListByPostIds(List<BigInteger> postIds) {
        List<Comment> commentList = commentRepository.findByPostIdIn(postIds);

        return commentList.stream()
                .map(this::mapToCommentDetails) // Correctly referencing the method
                .collect(Collectors.toList());
    }
}