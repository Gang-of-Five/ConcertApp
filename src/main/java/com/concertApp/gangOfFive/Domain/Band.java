package com.concertApp.gangOfFive.Domain;


import javax.persistence.*;

@Entity
@Table (name = "band")
public class Band {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long bandid;

    @Column(nullable = false, name = "bandname", unique = true)
    private String bandname;

    public Band() {}

    public Band(String bandname) {
        this.bandname = bandname;
    }

    public Long getBandid() {
        return bandid;
    }

    public void setBandid(Long bandid) {
        this.bandid = bandid;
    }

    public String getBandname() {
        return bandname;
    }

    public void setBandname(String bandname) {
        this.bandname = bandname;
    }
}
