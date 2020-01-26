package com.greglturnquist.payroll;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Main_series"
)

public class Main_series {


    @Column(name = "ID")
    private int ID;

    @Id
    @Column(name="Title_of_a_series")
    private String title_of_a_series;

    @OneToMany(mappedBy = "main_series")
    private List<Novel> novels;

    @Column(name = "Magical_or_not")
    private String magical_or_not;

    @Column(name = "For_children_or_not")
    private String for_children_or_not;

}
