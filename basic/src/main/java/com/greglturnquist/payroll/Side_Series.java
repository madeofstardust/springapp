package com.greglturnquist.payroll;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Side_Series"
)
public class Side_Series {
    @Column(name = "ID")
    private int ID;

    @Id
    @Column(name="Title_of_a_side_series")
    private String title_of_a_side_series;

    @OneToMany(mappedBy = "side_series")
    private List<Novel> novels;

    @Column(name = "Real_world_or_not")
    private String Real_world_or_not;


    public String getReal_world_or_not() {
        return Real_world_or_not;
    }

    public void setReal_world_or_not(String real_world_or_not) {
        this.Real_world_or_not = real_world_or_not;
    }
}
