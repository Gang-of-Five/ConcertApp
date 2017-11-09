package com.concertApp.gangOfFive.Domain;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table (name = "concert")
public class Concert {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long concertid;

    @Column(nullable = false, name = "datestart")
    private Date datestart;

    @Column(nullable = false, name = "dateend")
    private Date dateend;

    @Column(nullable = false, name = "title")
    private String title;

    @Column(nullable = false, name = "venue")
    private  String venue;

    public Concert (){}

    public Concert(Date datestart, Date dateend, String title, String venue) {
        this.datestart = datestart;
        this.dateend = dateend;
        this.title = title;
        this.venue = venue;
    }

    public Long getConcertid() {
        return concertid;
    }

    public void setConcertid(Long concertid) {
        this.concertid = concertid;
    }

    public Date getDatestart() {
        return datestart;
    }

    public void setDatestart(Date datestart) {
        this.datestart = datestart;
    }

    public Date getDateend() {
        return dateend;
    }

    public void setDateend(Date dateend) {
        this.dateend = dateend;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }
}
