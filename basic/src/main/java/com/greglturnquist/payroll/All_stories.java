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

    @Column(name = "Title_of_a_story")
    private String Title_of_a_story;

    public All_stories(String Title_of_a_story){
        this.Title_of_a_story = Title_of_a_story;
    }
    @Override
    public int hashCode() {
        return Objects.hash(Title_of_a_story);
    }

    public String getTitle_of_a_story() {
        return Title_of_a_story;
    }

    public void setTitle_of_a_story(String title_of_a_story) {
        Title_of_a_story = title_of_a_story;
    }

    @Override
    public String toString() {
        return "All_stories{" +
                "Title='" + Title_of_a_story + '\'' +
                '}';
    }
}
