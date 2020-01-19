package com.greglturnquist.payroll;

import org.springframework.data.annotation.Reference;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "Main_heroes", uniqueConstraints = {
        @UniqueConstraint(columnNames = {"ID", "Main_hero", "Sex", "Race", "Quote"}
        )
}
)

public class Main_heroes {
    @Id
    @GeneratedValue
    @Column(name = "ID")
    private int ID;

    @OneToMany(fetch = FetchType.LAZY, targetEntity = Novel.class)
    @JoinColumn(name = "Main_hero", referencedColumnName = "Main_hero")
    private List<Novel> Main_hero;
    // private String Name;

    @Column(name = "Sex")
    private String Sex;

    @Column(name = "Race")
    private String Race;

    @Column(name = "Quote")
    private String Quote;


    //public String getName() {
    //    return Name;
    //}

    //public void setName(String Name) {
    //    this.Name = Name;
    //}

    public String getSex() {
        return Sex;
    }

    public void setSex(String sex) {
        this.Sex = sex;
    }

    public String getRace() {
        return Race;
    }

    public void setRace(String race) {
        this.Race = race;
    }

    public String getQuote() {
        return Quote;
    }

    public void setQuote(String quote) {
        this.Quote = quote;
    }

}
