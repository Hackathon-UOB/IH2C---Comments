package com.uob.comment.Service;



import com.uob.comment.DTO.CommentDetail;
import com.uob.comment.DTO.CommentRequestDto;
import com.uob.comment.Model.Comment;
import com.uob.comment.Repository.CommentRepository;



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



    public Comment createComment(CommentRequestDto dto) {
        Comment comment = new Comment();
        comment.setUserId(dto.getUserId());
        comment.setPostId(dto.getPostId());
        comment.setComment(dto.getComment());
        comment.setCreatedAt(LocalDateTime.now());
        comment.setUpdatedAt(LocalDateTime.now());
        return commentRepository.save(comment);
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
        return new CommentDetail(
                comment.getId(),
                comment.getComment(),
                comment.getCreatedAt(),
                comment.getUpdatedAt(),
                comment.getUserId()
        );
    }



}