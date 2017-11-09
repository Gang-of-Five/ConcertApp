package com.concertApp.gangOfFive.Domain;

import javax.persistence.*;

@Entity
@Table (name = "venue")
public class Venue {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long venueid;

    @Column(nullable = false, name = "venuename")
    private String venuename;

    @Column(name = "venueaddress")
    private String venueaddress;

    public Venue() {
    }

    public Venue(String venuename, String venueaddress) {
        this.venuename = venuename;
        this.venueaddress = venueaddress;
    }

    public Long getVenueid() {
        return venueid;
    }

    public void setVenueid(Long venueid) {
        this.venueid = venueid;
    }

    public String getVenuename() {
        return venuename;
    }

    public void setVenuename(String venuename) {
        this.venuename = venuename;
    }

    public String getVenueaddress() {
        return venueaddress;
    }

    public void setVenueaddress(String venueaddress) {
        this.venueaddress = venueaddress;
    }
}
