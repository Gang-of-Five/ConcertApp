package com.concertApp.gangOfFive.Model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class UserRegisterForm {

    private static final String EMAIL_PATTERN = "[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{1,63}$";
    private static final String PASSWORD_PATTERN = "^[a-zA-Z0-9@#$%^&]*$";
    private static final int PASSWORD_MINSIZE = 6;
    private static final int PASSWORD_MAXSIZE = 15;
    private static final int USERNAME_MINSIZE = 6;
    private static final int USERNAME_MAXSIZE = 15;

    @NotNull(message = "{insert.email.null}")
    @Pattern(regexp = EMAIL_PATTERN, message = "{insert.email.invalid}")
    private String email;

    @NotNull(message = "{insert.password.null}")
    @Pattern(regexp = PASSWORD_PATTERN, message = "{insert.password.invalid}")
    @Size(min = PASSWORD_MINSIZE, max = PASSWORD_MAXSIZE,
            message = "{insert.password.size}")
    private String password;

    @NotNull(message = "{insert.username.null}")
    @Size(min = USERNAME_MINSIZE, max = USERNAME_MAXSIZE,
            message = "{insert.username.size}")
    private String username;

    private String bio;

    private Long userid;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }
}
