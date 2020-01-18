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
    @Column(name = "ID")
    private int ID;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Title_of_a_series")
    private String Title_of_a_series;

    @Column(name = "Real_world_or_not")
    private String Real_world_or_not;

    public String getTitle_of_a_series() {
        return Title_of_a_series;
    }

    public void setTitle_of_a_series(String title_of_a_series) {
        this.Title_of_a_series = title_of_a_series;
    }

    public String getReal_world_or_not() {
        return Real_world_or_not;
    }

    public void setReal_world_or_not(String real_world_or_not) {
        this.Real_world_or_not = real_world_or_not;
    }
}
