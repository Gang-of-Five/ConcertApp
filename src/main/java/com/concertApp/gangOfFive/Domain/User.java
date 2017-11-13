package com.concertApp.gangOfFive.Domain;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userid;

    @Column(nullable = false, name = "email", unique = true, length = 50)
    private String email;

    @Column(nullable = false, name = "password", length = 15)
    private String password;

    @Column(nullable = false, name = "username", unique = true, length = 15)
    private String username;

    @Column(nullable = true, name = "bio")
    private String bio;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "userhasconcert",
            joinColumns = @JoinColumn(name = "userid", referencedColumnName = "userid"),
            inverseJoinColumns = @JoinColumn(name = "concertid", referencedColumnName = "concertid"))
    private Set<Concert> concerts;

    @OneToMany(mappedBy = "user", cascade = {CascadeType.REMOVE}, targetEntity = Comment.class)
    private List<Comment> comments;

    @OneToMany(mappedBy = "user", cascade = {CascadeType.REMOVE}, targetEntity = Media.class)
    private List<Media> media;

    public User() {}

    public User(String email, String password, String username, String bio, Set concerts) {
        this.email = email;
        this.password = password;
        this.username = username;
        this.bio = bio;
        this.concerts = concerts;
    }

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public Set<Concert> getConcerts() {
        return concerts;
    }

    public void setConcerts(Set<Concert> concerts) {
        this.concerts = concerts;
    }
}
