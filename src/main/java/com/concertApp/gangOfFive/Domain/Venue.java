package com.concertApp.gangOfFive.Domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table (name = "venue")
public class Venue {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long venueid;

    @Column(nullable = false, name = "venuename", length = 50)
    private String venuename;

    @Column(name = "venueaddress", length = 100)
    private String venueaddress;

    @OneToMany(mappedBy = "venue", targetEntity = Concert.class)
    private List<Concert> concerts;

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
