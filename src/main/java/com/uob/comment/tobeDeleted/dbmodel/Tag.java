package com.uob.comment.tobeDeleted.dbmodel;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;

@Entity
@Table(name = "tag")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Tag {

    @Id
    @Column (name = "id", columnDefinition = "BIGINT")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BigInteger id;

    @Column(nullable = false)
    private String tag;

    private String status;

    private String description;
}

