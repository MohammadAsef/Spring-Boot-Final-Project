package hu.cs.se.adjva.projectmanagement.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Employee
 */
public class Employee {

    private Integer employee_id;
    private String  first_name;
    private String  last_name;
    private Integer position;
    private String eduction;
    private String phone;
    private String email;
    private String address;
    private String gender;
    private String dob;
    private String hire_date;
    private String marital_status;
    private Double salary;


    @Id
    @GeneratedValue
    public Integer getEmployee_id() {
        return employee_id;
    }
    public void setEmployee_id(Integer employee_id) {
        this.employee_id = employee_id;
    }
    public String getFirst_name() {
        return first_name;
    }
    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }
    public String getLast_name() {
        return last_name;
    }
    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }
    public Integer getPosition() {
        return position;
    }
    public void setPosition(Integer position) {
        this.position = position;
    }
    public String getEduction() {
        return eduction;
    }
    public void setEduction(String eduction) {
        this.eduction = eduction;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
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
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getDob() {
        return dob;
    }
    public void setDob(String dob) {
        this.dob = dob;
    }
    public String getHire_date() {
        return hire_date;
    }
    public void setHire_date(String hire_date) {
        this.hire_date = hire_date;
    }
    public String getMarital_status() {
        return marital_status;
    }
    public void setMarital_status(String marital_status) {
        this.marital_status = marital_status;
    }
    public Double getSalary() {
        return salary;
    }
    public void setSalary(Double salary) {
        this.salary = salary;
    }

    

}