package com.uob.comment.Controller;


import com.uob.comment.DTO.CommentDetail;
import com.uob.comment.DTO.CommentRequestDto;
import com.uob.comment.Model.Comment;
import com.uob.comment.Service.CommentService;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;
import java.util.List;

@RestController
@RequestMapping("/api/IH2C-Comment")
    public class CommentController {

        @Autowired
        private CommentService commentService;

        @PostMapping
        public ResponseEntity<Comment> createComment(@Valid @RequestBody CommentRequestDto dto) {
            Comment createdComment = commentService.createComment(dto);
            return ResponseEntity.status(201).body(createdComment);
        }

        @PutMapping("/{commentId}")
        public ResponseEntity<Comment> updateComment(
                @PathVariable BigInteger commentId,
                @Valid @RequestBody CommentRequestDto dto) {
            Comment updatedComment = commentService.updateComment(commentId, dto);
            return ResponseEntity.ok(updatedComment);
        }

        @DeleteMapping("/{commentId}")
        public ResponseEntity<Void> deleteComment(@PathVariable BigInteger commentId) {
            commentService.deleteComment(commentId);
            return ResponseEntity.noContent().build();  // Return 204 No Content
        }

        @GetMapping("/{postId}")
        public ResponseEntity<List<CommentDetail>> GetCommentListByPostId(@PathVariable BigInteger postId) {
            List<CommentDetail> commentList = commentService.getCommentsByPostId(postId);
            return ResponseEntity.ok(commentList);
        }
    }

