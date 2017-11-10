package com.concertApp.gangOfFive.Domain;


import javax.persistence.*;
import java.util.Set;

@Entity
@Table (name = "band")
public class Band {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long bandid;

    @Column(nullable = false, name = "bandname", unique = true, length = 50)
    private String bandname;

    @ManyToMany(mappedBy = "bands")
    private Set<Concert> concerts;

    public Band() {}

    public Band(String bandname, Set concerts) {
        this.bandname = bandname;
        this.concerts = concerts;
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
