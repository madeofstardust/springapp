package com.greglturnquist.payroll;
import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "All_stories", uniqueConstraints = {
        @UniqueConstraint(columnNames = {"ID", "Title_of_a_story"}
        )
}
)

public class All_stories {
    @Id
    @GeneratedValue
    @Column(name = "ID")
    private int ID;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Title_of_a_story")
    private String Title_of_a_story;

    public All_stories(String Title_of_a_story){
        this.Title_of_a_story = Title_of_a_story;
    }

    public String getTitle_of_a_story() {
        return Title_of_a_story;
    }

    public void setTitle_of_a_story(String title_of_a_story) {
        Title_of_a_story = title_of_a_story;
    }

}
