package vn.codegym.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "sing")
public class Sing {
    @Id
    private Integer id;
    private String name;
    private String singer;
    @Column(name = "type_sing")
    private String typeSing;
    @Column(name = "link_sing")
    private String linkSing;
    @Column(name = "status_delete", columnDefinition = "BIT(1)")
    private Integer statusDelete;

    public Sing(Integer id, String name, String singer, String typeSing, String linkSing, Integer statusDelete) {
        this.id = id;
        this.name = name;
        this.singer = singer;
        this.typeSing = typeSing;
        this.linkSing = linkSing;
        this.statusDelete = statusDelete;
    }

    public Sing() {
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

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getTypeSing() {
        return typeSing;
    }

    public void setTypeSing(String typeSing) {
        this.typeSing = typeSing;
    }

    public String getLinkSing() {
        return linkSing;
    }

    public void setLinkSing(String linkSing) {
        this.linkSing = linkSing;
    }
}
