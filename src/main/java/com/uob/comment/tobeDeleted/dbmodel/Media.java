package com.uob.comment.tobeDeleted.dbmodel;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;
import java.time.LocalDateTime;

@Entity
@Table(name = "media")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Media {

    @Id
    @Column (name = "id", columnDefinition = "BIGINT")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BigInteger id;

    @ManyToOne
    @JoinColumn(name = "post_id")
    @JsonIgnore
    private Post post;

    private String linkUrl;

    private LocalDateTime createdAt;

    private LocalDateTime deletedAt;

    @PrePersist
    protected void onCreate() {
        createdAt = LocalDateTime.now();

    }
}
