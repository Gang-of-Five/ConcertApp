INSERT INTO user (bio, email, username, password) VALUES ('Some bio', 'email@example.com','username001','password');
INSERT INTO venue (venuename, venueaddress) VALUES ('SomeVenueName', 'SomeVenueAddress');
INSERT INTO concert (datestart, title, dateend, venueid) VALUES ('2017-06-15', 'Some Concert Title', '2017-06-15', '1');
INSERT INTO media (type, url, userid, concertid) VALUES ('Photo', 'someUrl', '1', '1');
INSERT INTO band (bandname) VALUES ('SomeBandName');
INSERT INTO userhasconcert (userid, concertid) VALUES ('1', '1');
INSERT INTO concerthasband (concertid, bandid) VALUES ('1', '1');
INSERT INTO comment (text, date, userid, concertid) VALUES ('SomeCommentText', '2017-06-15', '1', '1');