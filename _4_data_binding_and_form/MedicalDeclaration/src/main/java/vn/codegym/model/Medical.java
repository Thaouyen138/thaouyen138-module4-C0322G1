package vn.codegym.model;

public class Medical {
    private String name;
    private String age;
    private String gender;
    private String national;
    private String identity;
    private String transport;
    private String idTransport;
    private String chair;
    private String startDate;
    private String endDate;

    public Medical(String name, String age, String gender, String national, String identity, String transport, String idTransport, String chair, String startDate, String endDate) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.national = national;
        this.identity = identity;
        this.transport = transport;
        this.idTransport = idTransport;
        this.chair = chair;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNational() {
        return national;
    }

    public void setNational(String national) {
        this.national = national;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public String getTransport() {
        return transport;
    }

    public void setTransport(String transport) {
        this.transport = transport;
    }

    public String getIdTransport() {
        return idTransport;
    }

    public void setIdTransport(String idTransport) {
        this.idTransport = idTransport;
    }

    public String getChair() {
        return chair;
    }

    public void setChair(String chair) {
        this.chair = chair;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public Medical() {
    }
}
