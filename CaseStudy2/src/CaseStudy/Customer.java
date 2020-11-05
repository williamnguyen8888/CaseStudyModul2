package CaseStudy;

import java.io.Serializable;
import java.time.LocalDate;

public class Customer implements Serializable{
    private int Id;
    private String nameCustomer;
    private LocalDate birthday;
    private String gender;
    private int phoneNumber;

    public Customer() {
    }

    public Customer(int id, String nameCustomer, LocalDate birthday, String gender, int phoneNumber) {
        Id = id;
        this.nameCustomer = nameCustomer;
        this.birthday = birthday;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
    }

    public int getId() {
        return Id;
    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public String getGender() {
        return gender;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setId(int id) {
        Id = id;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "Id=" + Id +
                ", nameCustomer='" + nameCustomer + '\'' +
                ", birthday=" + birthday +
                ", gender='" + gender + '\'' +
                ", phoneNumber=" + phoneNumber;
    }
}
