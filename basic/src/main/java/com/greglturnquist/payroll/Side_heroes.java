package com.greglturnquist.payroll;
import javax.persistence.*;

@Entity
@Table(name = "Side_heroes", uniqueConstraints = {
        @UniqueConstraint(columnNames = {"ID", "Name", "Sex", "Race"}
        )
}
)
public class Side_heroes {

    @Id
    @GeneratedValue
    @Column(name = "ID")
    private int ID;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Name_of_sc")
    private String Name_of_sc;

    @Column(name = "Sex")
    private String Sex;

    @Column(name = "Race")
    private String Race;


    public String getName() {
        return Name_of_sc;
    }

    public void setName(String name) {
        Name_of_sc = name;
    }

    public String getSex() {
        return Sex;
    }

    public void setSex(String sex) {
        Sex = sex;
    }

    public String getRace() {
        return Race;
    }

    public void setRace(String race) {
        Race = race;
    }
}
