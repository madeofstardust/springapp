package com.greglturnquist.payroll;
import org.springframework.data.annotation.Reference;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Short_story", uniqueConstraints = {
        @UniqueConstraint(columnNames = {"ID","Title", "Year", "Main_hero"}
        )
}
)

public class Short_story {
    @Id
    @GeneratedValue
    @Column(name = "ID")
    private int ID;
    @Column(name = "Title")
    private String Title_of_a_short_story;

    @Column(name = "Year")
    private int Year;

    @Column(name = "Main_hero")
    @Reference()
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

    /*public List<Main_heroes> getName() {
        return Name;
    }

    public void setName(List<Main_heroes> name) {
        Name = name;
    }

     */
}
