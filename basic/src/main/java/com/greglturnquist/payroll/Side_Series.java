package com.greglturnquist.payroll;
import javax.persistence.*;

@Entity
@Table(name = "Side_Series", uniqueConstraints = {
        @UniqueConstraint(columnNames = {"ID", "Title_of_a_series", "Real_world_or_not"}
        )
}
)
public class Side_Series {
    @Id
    @GeneratedValue
    @Column(name = "Title_of_a_series")
    private String Title_of_a_series;

    @Column(name = "ID")
    private int ID;

    @Column(name = "Real_world_or_not")
    private String Real_world_or_not;

}
