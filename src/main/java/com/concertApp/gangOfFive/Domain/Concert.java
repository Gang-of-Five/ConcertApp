package com.concertApp.gangOfFive.Domain;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.Set;

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

    @Column(nullable = false, name = "title", length = 100)
    private String title;

    @ManyToOne(optional = false)
    @JoinColumn(name="venueid", referencedColumnName = "venueid")
    private Venue venue;

    @ManyToMany(mappedBy = "concerts")
    private Set<User> users;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "concerthasband",
            joinColumns = @JoinColumn(name = "concertid", referencedColumnName = "concertid"),
            inverseJoinColumns = @JoinColumn(name = "bandid", referencedColumnName = "bandid"))
    private Set<Band> bands;

    @OneToMany(mappedBy = "concert", cascade = {CascadeType.REMOVE}, targetEntity = Comment.class)
    private List<Comment> comments;

    @OneToMany(mappedBy = "concert", cascade = {CascadeType.REMOVE}, targetEntity = Media.class)
    private List<Media> media;

    public Concert (){}

    public Concert(Date datestart, Date dateend, String title, Venue venue, Set users, Set bands) {
        this.datestart = datestart;
        this.dateend = dateend;
        this.title = title;
        this.venue = venue;
        this.users = users;
        this.bands = bands;
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

    public Venue getVenue() {
        return venue;
    }

    public void setVenue(Venue venue) {
        this.venue = venue;
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }
}
