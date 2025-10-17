package model;
public class User {
    private int userId;
    private String username;
    private String password;
    private Role role;
    private Department department;

    public User() {
    }

    public User(int userId, String username, String password, Role role, Department department) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.role = role;
        this.department = department;
    }

    public int getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public Role getRole() {
        return role;
    }

    public Department getDepartment() {
        return department;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
    
}
