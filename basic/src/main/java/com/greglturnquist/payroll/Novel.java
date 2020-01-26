package com.greglturnquist.payroll;
import com.fasterxml.jackson.annotation.JsonFormat;
//import javafx.geometry.Side;
import org.springframework.data.annotation.Reference;

import javax.persistence.*;

@Entity
@Table(name = "Novel")
public class Novel {

    @Id
    @GeneratedValue
    @Column(name = "ID")
    private int ID;

    @ManyToOne
    @JoinColumn(name = "Title", referencedColumnName = "Title_of_a_story")
    private All_stories all_story;

    @ManyToOne
    @JoinColumn(name = "Main_series", referencedColumnName = "Title_of_a_series")
    private Main_series main_series;

    @ManyToOne
    @JoinColumn(name = "Side_series", referencedColumnName = "Title_of_a_side_series")
    private Side_Series side_series;

    @ManyToOne
    @JoinColumn(name = "Main_hero", referencedColumnName = "name")
    private Main_heroes main_hero;

    @ManyToOne
    @JoinColumn(name = "Side_hero", referencedColumnName = "SHname")
    private Side_heroes side_hero;

    @ManyToOne
    @JoinColumn(name = "Place", referencedColumnName = "Pname")
    private Places place;

    @Column(name = "Satire")
    private String Satire;


    public Novel() {}


    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public All_stories getAll_story() {
        return all_story;
    }

    public void setAll_story(All_stories all_story) {
        this.all_story = all_story;
    }

    public Main_series getMain_series() {
        return main_series;
    }

    public void setMain_series(Main_series main_series) {
        this.main_series = main_series;
    }

    public Side_Series getSide_series() {
        return side_series;
    }

    public void setSide_series(Side_Series side_series) {
        this.side_series = side_series;
    }

    public Main_heroes getMain_hero() {
        return main_hero;
    }

    public void setMain_hero(Main_heroes main_hero) {
        this.main_hero = main_hero;
    }

    public Side_heroes getSide_hero() {
        return side_hero;
    }

    public void setSide_hero(Side_heroes side_hero) {
        this.side_hero = side_hero;
    }

    public Places getPlace() {
        return place;
    }

    public void setPlace(Places place) {
        this.place = place;
    }

    public String getSatire() {
        return Satire;
    }

    public void setSatire(String satire) {
        Satire = satire;
    }
}


