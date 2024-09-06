package com.uob.comment.tobeDeleted.dbmodel;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigInteger;
import java.time.LocalDateTime;

@Entity
@Table(name = "comment")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Setter
@Getter
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

