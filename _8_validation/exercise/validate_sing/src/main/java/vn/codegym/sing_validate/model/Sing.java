package vn.codegym.sing_validate.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Entity
public class Sing {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name_sing")
    private String nameSing;

    private String singer;

    @NotBlank
    @Pattern(regexp = "^[a-zA-Z0-9\\,]{1,1000}$")
    private String type;

    public Sing() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameSing() {
        return nameSing;
    }

    public void setNameSing(String nameSing) {
        this.nameSing = nameSing;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Sing( String nameSing, String singer, String type) {
        this.nameSing = nameSing;
        this.singer = singer;
        this.type = type;
    }
}
