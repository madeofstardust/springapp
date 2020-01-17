package com.greglturnquist.payroll;
import javax.persistence.*;

@Entity
@Table(name = "Places", uniqueConstraints = {
        @UniqueConstraint(columnNames = {"Name", "Climate", "Population", "Political_system"}
        )
}
)
public class Places {

    @Id
    @GeneratedValue
    @Column(name = "Name")
    private String Name;

    @Column(name = "Climate")
    private String Climate;

    @Column(name = "Population")
    private int Population;

    @Column(name = "Political_system")
    private String Political_system;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
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
