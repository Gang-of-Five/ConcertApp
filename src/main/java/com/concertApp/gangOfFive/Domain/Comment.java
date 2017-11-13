package com.concertApp.gangOfFive.Domain;


import javax.annotation.Generated;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table (name = "comment")
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long commentid;

    @Column(nullable = false, name = "text")
    private String text;

    @Column(nullable = false, name = "date")
    private Date date;

    @ManyToOne(optional = false)
    @JoinColumn(name="userid", referencedColumnName = "userid")
    private User user;

    @ManyToOne(optional = false)
    @JoinColumn(name="concertid", referencedColumnName = "concertid")
    private Concert concert;

    public Comment(){}

    public Comment( String text, Date date) {
        this.text = text;
        this.date = date;
    }

    public Long getCommentid() {
        return commentid;
    }

    public void setCommentid(Long commentid) {
        this.commentid = commentid;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
