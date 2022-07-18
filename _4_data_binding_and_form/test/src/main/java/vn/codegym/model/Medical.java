package vn.codegym.model;

public class Medical {
    private  String name;
    private String age;
    private String transport;
    private String startDate;
    private String endDate;
    private String other;

    public Medical(String name, String age, String transport, String startDate, String endDate, String other) {
        this.name = name;
        this.age = age;
        this.transport = transport;
        this.startDate = startDate;
        this.endDate = endDate;
        this.other = other;
    }

    public Medical() {
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

    public String getTransport() {
        return transport;
    }

    public void setTransport(String transport) {
        this.transport = transport;
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

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }
}
