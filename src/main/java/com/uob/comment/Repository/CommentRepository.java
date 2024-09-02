package com.uob.comment.Repository;





import com.uob.comment.Model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment,BigInteger> {
    List<Comment> findByPost_id(BigInteger postId);

}