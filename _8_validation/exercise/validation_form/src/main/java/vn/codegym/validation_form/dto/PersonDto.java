package vn.codegym.validation_form.dto;

import javax.validation.constraints.*;

public class PersonDto {

    private Integer id;

    @NotBlank(message = "Isn't empty!")
    @Size(min = 4, max = 45, message = "input min 4 and max 45")
    private String firstName;

    @NotBlank(message = "Isn't empty!")
    @Size(min = 4, max = 45, message = "input min 4 and max 45")
    private String lastName;

    @Pattern(regexp = "^[0-9]{10}$", message = "phone is 10 number")
    private String phone;

    @Min(value = 18, message = "age must be more than 18")
    private Integer age;

    @Email
    private String email;

    public PersonDto() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
