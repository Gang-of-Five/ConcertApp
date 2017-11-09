package com.concertApp.gangOfFive.Domain;


import javax.persistence.*;

@Entity
@Table(name = "media")
public class Media {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long mediaid;

    @Column(nullable = false, name = "type")
    private String type;

    @Column(nullable = false, name = "url", unique = true)
    private String url;

    @Column(nullable = false, name = "userid")
    private Long userid;

    @Column(nullable = false, name = "concertid")
    private Long concertid;

    public Media(){}

    public Media(String type, String url, Long userid, Long concertid) {
        this.type = type;
        this.url = url;
        this.userid = userid;
        this.concertid = concertid;
    }

    public Long getMediaid() {
        return mediaid;
    }

    public void setMediaid(Long mediaid) {
        this.mediaid = mediaid;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
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
}
