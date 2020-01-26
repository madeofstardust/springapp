package com.greglturnquist.payroll;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Places"
)
public class Places {

    @GeneratedValue
    @Column(name = "ID")
    private int ID;

    @Id
    @Column(name = "Pname")
    private String place_name;

    @OneToMany(mappedBy = "place")
    private List<Novel> novels;

    @Column(name = "Climate")
    private String Climate;

    @Column(name = "Population")
    private int Population;

    @Column(name = "Political_system")
    private String Political_system;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getPlace_name() {
        return place_name;
    }

    public void setPlace_name(String place_name) {
        this.place_name = place_name;
    }

    public List<Novel> getNovels() {
        return novels;
    }

    public void setNovels(List<Novel> novels) {
        this.novels = novels;
    }

    public String getClimate() {
        return Climate;
    }

    public void setClimate(String climate) {
        Climate = climate;
    }

    public int getPopulation() {
        return Population;
    }

    public void setPopulation(int population) {
        Population = population;
    }

    public String getPolitical_system() {
        return Political_system;
    }

    public void setPolitical_system(String political_system) {
        Political_system = political_system;
    }
}
