package com.concertApp.gangOfFive.Domain;

import javax.persistence.*;


@Entity
@Table(name = "concerthasband")
public class ConcertHasBand {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long concerthasbandid;

    @Column(nullable = false, name = "concertid")
    private Long concertid;

    @Column(nullable = false, name = "bandid")
    private Long bandid;

    public ConcertHasBand(){}

    public ConcertHasBand(Long concertid, Long bandid) {
        this.concertid = concertid;
        this.bandid = bandid;
    }

    public Long getConcerthasbandid() {
        return concerthasbandid;
    }

    public void setConcerthasbandid(Long concerthasbandid) {
        this.concerthasbandid = concerthasbandid;
    }

    public Long getConcertid() {
        return concertid;
    }

    public void setConcertid(Long concertid) {
        this.concertid = concertid;
    }

    public Long getBandid() {
        return bandid;
    }

    public void setBandid(Long bandid) {
        this.bandid = bandid;
    }
}
