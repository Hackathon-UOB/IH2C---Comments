package com.uob.comment.Repository;




import com.uob.comment.tobeDeleted.dbmodel.Comment;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment,BigInteger> {
    List<Comment> findByPostId(BigInteger postId);

    List<Comment> findByPostIdIn(List<BigInteger> postIds);

}