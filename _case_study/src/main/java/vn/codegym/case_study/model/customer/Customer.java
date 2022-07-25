package vn.codegym.case_study.model.customer;

import javax.persistence.*;

@Entity
public class Customer {

    @Id
    private String id;

    private String name;

    @Column(name = "date_of_birth", columnDefinition = "date")
    private String dateOfBirth;

    private Integer gender;

    @Column(name = "id_card", columnDefinition = "varchar(45)")
    private String idCard;
    @Column(name = "phone_number", columnDefinition = "varchar(20)")
    private String phoneNumber;

    private String email;
    private String address;

    @Column(name = "status_delete")
    private  Integer statusDelete;

    @ManyToOne
    @JoinColumn(name = "customer_type" , referencedColumnName = "id")
    private CustomerType customerType;

    public Integer getStatusDelete() {
        return statusDelete;
    }

    public void setStatusDelete(Integer statusDelete) {
        this.statusDelete = statusDelete;
    }

    public CustomerType getCustomerType() {
        return customerType;
    }

    public void setCustomerType(CustomerType customerType) {
        this.customerType = customerType;
    }

    public Customer() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Customer(String id, String name, String dateOfBirth, Integer gender, String idCard, String phoneNumber, String email, String address, Integer statusDelete, CustomerType customerType) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.idCard = idCard;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
        this.statusDelete = statusDelete;
        this.customerType = customerType;
    }
}
