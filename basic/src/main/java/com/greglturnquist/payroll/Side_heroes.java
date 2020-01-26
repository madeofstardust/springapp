package com.greglturnquist.payroll;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Side_heroes"
)
public class Side_heroes {

    @Column(name = "ID")
    private int ID;

    @Id
    @Column(name = "SHname")
    private String shname;

    @OneToMany(mappedBy = "side_hero")
    private List<Novel> novels;

    @Column(name = "Sex")
    private String Sex;

    @Column(name = "Race")
    private String Race;

    public String getShname() {
        return shname;
    }

    public void setShname(String shname) {
        this.shname = shname;
    }

    public List<Novel> getNovels() {
        return novels;
    }

    public void setNovels(List<Novel> novels) {
        this.novels = novels;
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
