package all.login.entity;

import java.io.Serializable;

public class User implements Serializable {
    private long userid;
    private String phoneNumber;
    private String password;

    public User(String phoneNumber, String password) {
        this.phoneNumber = phoneNumber;
        this.password = password;
    }

    public User() {
    }

    public void setId(long id) {
        this.userid = id;
    }

    public long getId() {
        return userid;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
