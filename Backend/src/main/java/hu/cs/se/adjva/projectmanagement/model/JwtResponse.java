package hu.cs.se.adjva.projectmanagement.model;

public class JwtResponse {


    private String username;
    private String token;
    private String address;
    private String phone;

    public JwtResponse(String username,  String address, String phone,String token) {
        this.username = username;
        this.token = token;
        this.address = address;
        this.phone = phone;
    }

    public JwtResponse() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
