package com.uob.comment.tobeDeleted.dbmodel;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;

@Entity
@Table(name = "post_tag")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PostTag {

    @Id
    @Column (name = "id", columnDefinition = "BIGINT")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BigInteger id;
    private BigInteger postId;
    private BigInteger tagId;
}