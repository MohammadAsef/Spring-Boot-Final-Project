package hu.cs.se.adjva.projectmanagement.model;

public class JwtResponse {

    private String username;
    private String name;
    private String token;


    public JwtResponse(String username, String name, String token) {
        this.username = username;
        this.name = name;
        this.token = token;
    }

    public JwtResponse() {
    }

    
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getToken() {
        return token;
    }
    public void setToken(String token) {
        this.token = token;
    }

}
