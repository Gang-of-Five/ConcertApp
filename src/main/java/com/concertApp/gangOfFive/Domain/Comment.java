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

    @Column(nullable = false, name = "userid")
    private Long userid;

    @Column(nullable = false, name = "concertid")
    private Long concertid;

    @Column(nullable = false, name = "text")
    private String text;

    @Column(nullable = false, name = "date")
    private Date date;

    public Comment(){}

    public Comment(Long userid, Long concertid, String text, Date date) {
        this.userid = userid;
        this.concertid = concertid;
        this.text = text;
        this.date = date;
    }

    public Long getCommentid() {
        return commentid;
    }

    public void setCommentid(Long commentid) {
        this.commentid = commentid;
    }

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public Long getConcertid() {
        return concertid;
    }

    public void setConcertid(Long concertid) {
        this.concertid = concertid;
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
