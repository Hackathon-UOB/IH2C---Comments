package com.uob.comment.tobeDeleted.dbmodel;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;
import java.time.LocalDateTime;


@Entity
@Table(name = "favorite")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Favorite {

    @Id
    @Column(name = "id", columnDefinition = "BIGINT")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BigInteger id;

    @Column(name = "post_id")
    private BigInteger postId;

    @Column(name = "user_id")
    private BigInteger userId;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @PrePersist
    protected void onCreate() {
        createdAt = LocalDateTime.now();

    }
}
