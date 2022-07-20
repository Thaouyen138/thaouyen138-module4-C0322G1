package vn.codegym.model;

import javax.persistence.*;

@Entity(name = "blog")
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private String category;
    private String content;

    @Column(name = "time_up", columnDefinition = "Date")
    private String timeUp;

    @Column(name = "status_delete", columnDefinition = "BIT(1)")
    private Integer statusDelete = 0;

    public Blog(Integer id, String name, String category, String content, String timeUp, Integer statusDelete) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.content = content;
        this.timeUp = timeUp;
        this.statusDelete = statusDelete;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String detail) {
        this.category = detail;
    }

    public String getTimeUp() {
        return timeUp;
    }

    public void setTimeUp(String timeUp) {
        this.timeUp = timeUp;
    }

    public Integer getStatusDelete() {
        return statusDelete;
    }

    public void setStatusDelete(Integer statusDelete) {
        this.statusDelete = statusDelete;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Blog() {
    }
}
