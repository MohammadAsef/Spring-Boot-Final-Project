package hu.cs.se.adjva.projectmanagement.model;

import javax.persistence.Entity;

/**
 * Company
 */
@Entity
public class Company {

    private Integer company_id;
    private String  company_name;
    private String  phone;
    private String address;


    
    public Integer getCompany_id() {
        return company_id;
    }
    public void setCompany_id(Integer company_id) {
        this.company_id = company_id;
    }
    public String getCompany_name() {
        return company_name;
    }
    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }


    
    



}