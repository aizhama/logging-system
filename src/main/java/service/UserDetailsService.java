package service;

public class UserDetailsService {

    private String username;
    private String password;
    private String roles;
    private String token;

    public UserDetailsService(){
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public UserDetailsService(String username, String password, String role, String token
    ){
        this.username= username;
        this.password=password;
        this.roles= roles;
        this.token= token;

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

    public String getRole() {
        return roles;
    }

    public void setRole(String role) {
        this.roles = roles;
    }
}
