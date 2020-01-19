package com.greglturnquist.payroll;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Main_series", uniqueConstraints = {
        @UniqueConstraint(columnNames = {"ID", "Title_of_a_series", "Magical_or_not", "For_children_or_not"}
        )
}
)

public class Main_series {

    @Id
    @GeneratedValue
    @Column(name = "ID")
    private int ID;

    @ManyToOne(fetch = FetchType.LAZY, targetEntity = Novel.class)
    @JoinColumn(name = "Title_of_a_series", referencedColumnName = "Main_series")
    private List<Novel> Main_series;
    //private String Title_of_a_series;

    @Column(name = "Magical_or_not")
    private String Magical_or_not;

    @Column(name = "For_children_or_not")
    private String For_children_or_not;

}
