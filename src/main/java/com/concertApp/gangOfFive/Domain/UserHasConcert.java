package com.concertApp.gangOfFive.Domain;

import javax.persistence.*;

@Entity
@Table(name = "userhasconcert")
public class UserHasConcert {

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    private Long userhasconcertid;

    @Column(nullable = false, name = "userid")
    private Long userid;

    @Column(nullable = false, name = "concertid")
    private Long concertid;

    @Column(nullable = false, name = "isfavourite")
    private Boolean isfavourite;

    public UserHasConcert(){}

    public UserHasConcert(Long userid, Long concertid) {
        this.userid = userid;
        this.concertid = concertid;
        this.isfavourite = isfavourite;
    }

    public Long getUserhasconcertid() {
        return userhasconcertid;
    }

    public void setUserhasconcertid(Long userhasconcertid) {
        this.userhasconcertid = userhasconcertid;
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

    public Boolean getIsfavourite() {
        return isfavourite;
    }

    public void setIsfavourite(Boolean isfavourite) {
        this.isfavourite = isfavourite;
    }
}
