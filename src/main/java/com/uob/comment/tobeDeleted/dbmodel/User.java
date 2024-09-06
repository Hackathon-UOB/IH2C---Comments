package com.uob.comment.tobeDeleted.dbmodel;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigInteger;
import java.time.LocalDateTime;

@Entity
@Table(name = "\"user\"")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Builder
public class User {

    @Id
    @Column (name = "id", columnDefinition = "BIGINT")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BigInteger id;

    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private String lanid;

    private String profilePhoto;

    private BigInteger points;

    private String role;

    private String status;

    private LocalDateTime createdAt;

    private String profileSummary;

    private Boolean enableNotification;

    public User(BigInteger userId) {
    }

//    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
//    @JsonIgnore
//    private List<Post> posts;
//
//    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
//    @JsonIgnore
//    private List<Comment> comments;
//
//    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
//    @JsonIgnore
//    private List<Vote> votes;

//    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
//    @JsonManagedReference
//    private List<UserTag> userTags;

    //private String badge;
    // private String avatar;


//    public BigInteger getRankingMetric() {
//        return points.add(BigInteger.valueOf(votes.size()));
//    }

//    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//    private List<Favorite> favorites;
//
//    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//    private List<UserNotification> notifications;
//
//    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//    private List<UserTag> userTags;

    @PrePersist
    protected void onCreate() {
        createdAt = LocalDateTime.now();
    }

}
