package com.greglturnquist.payroll;

import org.springframework.data.annotation.Reference;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "Main_heroes"
)

public class Main_heroes {

    @Column(name = "ID")
    private int ID;

    @Id
    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "main_hero")
    private List<Novel> novels;

    @Column(name = "Sex")
    private String Sex;

    @Column(name = "Race")
    private String Race;

    @Column(name = "Quote")
    private String Quote;


    public List<Novel> getNovels() {
        return novels;
    }

    public void setNovels(List<Novel> novels) {
        this.novels = novels;
    }

    public String getName() {
        return name;
    }

    public void setName(String Name) {
        this.name = Name;
    }

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
