package com.greglturnquist.payroll;

import org.springframework.data.annotation.Reference;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "Main_heroes", uniqueConstraints = {
        @UniqueConstraint(columnNames = {"ID", "Name", "Sex", "Race", "Quote"}
        )
}
)

public class Main_heroes {
    @Id
    @GeneratedValue

    //@ManyToOne(fetch = FetchType.LAZY)
    //@JoinColumn(name = "Main_hero")
    //private Novel novel;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Name")
    private String Name;

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
