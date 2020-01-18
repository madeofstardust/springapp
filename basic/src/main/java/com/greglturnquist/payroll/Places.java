package com.greglturnquist.payroll;
import javax.persistence.*;

@Entity
@Table(name = "Places", uniqueConstraints = {
        @UniqueConstraint(columnNames = {"ID", "Name", "Climate", "Population", "Political_system"}
        )
}
)
public class Places {

    @Id
    @GeneratedValue
    @Column(name = "ID")
    private int ID;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Name")
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
        this.Name = name;
    }

    public String getClimate() {
        return Climate;
    }

    public void setClimate(String climate) {
        this.Climate = climate;
    }

    public int getPopulation() {
        return Population;
    }

    public void setPopulation(int population) {
        this.Population = population;
    }

    public String getPolitical_system() {
        return Political_system;
    }

    public void setPolitical_system(String political_system) {
        this.Political_system = political_system;
    }
}
