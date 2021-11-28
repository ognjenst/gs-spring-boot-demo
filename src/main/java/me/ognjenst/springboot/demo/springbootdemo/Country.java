package me.ognjenst.springboot.demo.springbootdemo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

@Entity
@Table(name = "country")
public class Country {
    @Id
    @Column(name = "country_id")
    private int ID;

    public Country() {

    }

    public Country(int ID, String country, Timestamp last_update) {
        this.ID = ID;
        this.country = country;
        this.last_update = last_update;
    }

    private String country;
    private Timestamp last_update;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Timestamp getLast_update() {
        return last_update;
    }

    public void setLast_update(Timestamp last_update) {
        this.last_update = last_update;
    }

    @Override
    public String toString() {
        return "Country{" +
                "ID=" + ID +
                ", country='" + country + '\'' +
                ", last_update=" + last_update +
                '}';
    }
}
