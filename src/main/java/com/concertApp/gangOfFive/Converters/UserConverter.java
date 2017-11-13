package com.concertApp.gangOfFive.Converters;

import com.concertApp.gangOfFive.Domain.User;
import com.concertApp.gangOfFive.Model.UserRegisterForm;

public class UserConverter {
    public static User buildUserObject(UserRegisterForm userRegisterForm) {
        User user = new User();
        user.setEmail(userRegisterForm.getEmail());
        user.setPassword(userRegisterForm.getPassword());
        user.setUsername(userRegisterForm.getUsername());
        user.setBio(userRegisterForm.getBio());

        return user;
    }
}
