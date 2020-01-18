package com.greglturnquist.payroll;
import com.fasterxml.jackson.annotation.JsonFormat;
//import javafx.geometry.Side;
import org.springframework.data.annotation.Reference;

import javax.persistence.*;
import java.util.List;

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
    @Reference()
    private List<All_stories> Title_of_a_story;

    //@Column(name = "Year")
    //Year_of_publishing Year_of_publishing;

    @Column(name = "Main_series")
    @Reference()
    private List<Main_series> Title_of_a_main_series;

    @Column(name = "Side_series")
    @Reference()
    private List<Side_Series> Title_of_a_side_series ;

    @Column(name = "Main_hero")
    @Reference()
    private List<Main_heroes> Name;

    @Column(name = "Side_hero")
    @Reference()
    private List<Side_heroes> Side_hero;

    @Column(name = "Satire")
    private String Satire;

    @Column(name = "Place")
    @Reference()
    private List<Places> Place;

    public Novel() {}

    //Title of a story:

    public List<All_stories> getTitle_of_a_story() {
        return Title_of_a_story;
    }

    public void setTitle_of_a_story (All_stories Title_of_a_story){
        Title_of_a_story = Title_of_a_story;
        }

    //public Year_of_publishing getYear_of_publishing() {
    //    return Year_of_publishing;
    //}

  //  public void setYear_of_publishing(this.Year_of_publishing = Year_of_publishing;
   // }

    public List<Main_series> getTitle_of_a_main_series() {
        return Title_of_a_main_series;
    }

    public void setTitle_of_a_main_series(List<Main_series> title_of_a_main_series) {
        Title_of_a_main_series = title_of_a_main_series;
    }


    //side series:
    //public void setSide_series (Side_Series side_series){
    //        this.Side_series = side_series;
    //    }

    //public Side_Series getSide_series () {
    //    return Side_series;
    //}

    //Main heroes:
    //public Main_heroes getMain_hero () {
    //        return Main_hero;
    //    }

    //public void setMain_hero(Main_heroes Main_hero){
    //        this.Main_hero = Main_hero;
    //    }


    public List<Main_heroes> getName() {
        return Name;
    }

    public void setName(List<Main_heroes> name) {
        Name = name;
    }

    //Side hero:
    public List<Side_heroes> getSide_hero() {
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

    public List<Places> getPlace() {
        return Place;
    }

    public void setPlace(List<Places> place) {
        Place = place;
    }
}

