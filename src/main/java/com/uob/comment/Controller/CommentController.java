package com.uob.comment.Controller;


import com.uob.comment.DTO.CommentDetail;
import com.uob.comment.DTO.CommentRequestDto;
import com.uob.comment.tobeDeleted.dbmodel.Comment;
import com.uob.comment.Service.CommentService;

import com.uob.comment.tobeDeleted.dto.Response.ApiResponse;
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
        public ApiResponse<CommentDetail> createComment(@RequestBody CommentRequestDto dto) {
            CommentDetail createdComment = commentService.createComment(dto);
            return ApiResponse.success("Successfully created comment", createdComment);
        }

        @PutMapping("/{commentId}")
        public ApiResponse<Comment> updateComment(
                @PathVariable BigInteger commentId,
                @Valid @RequestBody CommentRequestDto dto) {
            Comment updatedComment = commentService.updateComment(commentId, dto);
            return ApiResponse.success("successful",updatedComment);
        }


        @GetMapping("/{postId}")
        public ApiResponse<List<CommentDetail>> GetCommentListByPostId(@PathVariable BigInteger postId) {
            List<CommentDetail> commentList = commentService.getCommentsByPostId(postId);
            return ApiResponse.success("success",commentList);
        }
    }

