package com.greglturnquist.payroll;
import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;

@Entity
@Table(name = "Novel", uniqueConstraints = {
        @UniqueConstraint( columnNames = {"Title", "Main_hero", "Side_hero","Main_series","Side_series","Place", "Satire"}
                )
            }
        )

public class Novel {

    @Id
    @GeneratedValue
    @Column(name = "Title")
    All_stories Title_of_a_story;

    //@Column(name = "Year")
    //Year_of_publishing Year_of_publishing;

    @Column(name = "Main_series")
    Main_series Title_of_a_main_series;

    @Column(name = "Side_series")
    Side_Series Side_series;

    @Column(name = "Main_hero")
    Main_heroes Main_hero;

    @Column(name = "Side_hero")
    Side_heroes Side_hero;

    @Column(name = "Satire")
    private String Satire;

    @Column(name = "Place")
    private String Place;

    public Novel() {}

    //Title of a story:
    public All_stories getTitle_of_a_story () {
            return Title_of_a_story;
        }

    public void setTitle_of_a_story (All_stories Title_of_a_story){
            this.Title_of_a_story = Title_of_a_story;
        }

    //public Year_of_publishing getYear_of_publishing() {
    //    return Year_of_publishing;
    //}

  //  public void setYear_of_publishing(this.Year_of_publishing = Year_of_publishing;
   // }

    //main series:
    public void setTitle_of_a_main_series(Main_series Title_of_a_main_series) {
        this.Title_of_a_main_series = Title_of_a_main_series;
    }

    public Main_series getTitle_of_a_main_series () {
            return Title_of_a_main_series;
        }

    //side series:
    public void setSide_series (Side_Series side_series){
            this.Side_series = side_series;
        }

    public Side_Series getSide_series () {
        return Side_series;
    }

    //Main heroes:
    public Main_heroes getMain_hero () {
            return Main_hero;
        }

    public void setMain_hero(Main_heroes Name){
            this.Main_hero = Name;
        }

//Side hero:

    public Side_heroes getSide_hero () {
            return Side_hero;
        }

     public void setSide_hero (Side_heroes side_hero){
            this.Side_hero = Side_hero;
        }

        public String getSatire () {
            return Satire;
        }

        public void setSatire (String satire){
            Satire = satire;
        }

        public String getPlace () {
            return Place;
        }

        public void setPlace (String place){
            Place = place;
        }

    }

