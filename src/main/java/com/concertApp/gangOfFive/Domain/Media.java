package com.concertApp.gangOfFive.Domain;


import javax.persistence.*;

@Entity
@Table(name = "media")
public class Media {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long mediaid;

    @Column(nullable = false, name = "type", length = 10)
    private String type;

    @Column(nullable = false, name = "url", unique = true)
    private String url;

    @ManyToOne(optional = false)
    @JoinColumn(name="userid", referencedColumnName = "userid")
    private User user;

    @ManyToOne(optional = false)
    @JoinColumn(name="concertid", referencedColumnName = "concertid")
    private Concert concert;

    public Media(){}

    public Media(String type, String url) {
        this.type = type;
        this.url = url;
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
}
