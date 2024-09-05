package com.uob.comment.Model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;
import java.time.LocalDateTime;

@Entity
@Table(name = "comment")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Comment {

    @Id
    @Column (name = "id", columnDefinition = "BIGINT")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BigInteger id;

//    @ManyToOne
//    @JoinColumn(name = "post_id")
//    @JsonBackReference
    @Column(name = "post_id")
    private BigInteger postId;

//    @ManyToOne
//    @JoinColumn(name = "user_id")
//    @JsonIgnore
    @Column(name = "user_id")
    private BigInteger userId;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String comment;

    private String status;

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

