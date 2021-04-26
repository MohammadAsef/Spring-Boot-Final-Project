package hu.cs.se.adjva.projectmanagement.model;

public class JWTAuthication {


    private String username;

    private String password;
    public JWTAuthication() {
    }
    public JWTAuthication(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
