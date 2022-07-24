package vn.codegym.sing_validate.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

public class SingDto {

    @NotBlank
    @Pattern(regexp = "^[a-zA-Z0-9]{1,800}$")
    private String nameSing;


    @NotBlank
    @Pattern(regexp = "^[a-zA-Z0-9]{1,300}$")
    private String singer;

    @NotBlank
    @Pattern(regexp = "^[a-zA-Z0-9\\,]{1,1000}$")
    private String type;

    public SingDto() {
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
}
