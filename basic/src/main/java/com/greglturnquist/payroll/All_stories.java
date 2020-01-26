package com.greglturnquist.payroll;
import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "All_stories"
)

public class All_stories {

    @Column(name = "ID")
    private int ID;

    @Id
    @Column(name="Title_of_a_story")
    private String title_of_a_story;

    @OneToMany(mappedBy = "all_story")
    private List<Novel> novels;

    private All_stories(){}

    public All_stories(int ID, String title_of_a_story) {
        this.ID = ID;
        this.title_of_a_story = title_of_a_story;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        All_stories all_story = (All_stories) o;
        return Objects.equals(ID, all_story.ID) &&
                Objects.equals(title_of_a_story, all_story.title_of_a_story);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID, title_of_a_story);
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTitle_of_a_story() {
        return title_of_a_story;
    }

    public void setTitle_of_a_story(String title_of_a_story) {
        this.title_of_a_story = title_of_a_story;
    }

    /*public List<Novel> getNovels() {
        return novels;
    }

    public void setNovels(List<Novel> novels) {
        this.novels = novels;
    }
*/
}
