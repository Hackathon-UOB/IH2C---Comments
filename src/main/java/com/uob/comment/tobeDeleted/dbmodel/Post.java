package com.uob.comment.tobeDeleted.dbmodel;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;
import java.time.LocalDateTime;

@Entity
@Table(name = "post")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Post {

    @Id
    @Column (name = "id", columnDefinition = "BIGINT")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BigInteger id;

    @Column(nullable = false)
    private String type;

    private String title;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String body;


    private BigInteger userId;

    private String status;

    private BigInteger points;
    private BigInteger parentId;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;


    @PrePersist
    protected void onCreate() {
        createdAt = LocalDateTime.now();
        updatedAt = LocalDateTime.now();
    }

    @PreUpdate
    protected void onUpdate() {
        updatedAt = LocalDateTime.now();
    }
}


