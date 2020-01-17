package com.greglturnquist.payroll;
import javax.persistence.*;

@Entity
@Table(name = "Short_story", uniqueConstraints = {
        @UniqueConstraint(columnNames = {"Title", "Year", "Main_hero"}
        )
}
)

public class Short_story {
    @Id
    @GeneratedValue
    @Column(name = "Title")
    private String Title_of_a_short_story;

    @Column(name = "Year")
    private int Year;

    @Column(name = "Main_hero")
    private String Main_hero;

    public String getTitle_of_a_short_story() {
        return Title_of_a_short_story;
    }

    public void setTitle_of_a_short_story(String title_of_a_short_story) {
        Title_of_a_short_story = title_of_a_short_story;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int year) {
        Year = year;
    }

    public String getMain_hero() {
        return Main_hero;
    }

    public void setMain_hero(String main_hero) {
        Main_hero = main_hero;
    }
}
