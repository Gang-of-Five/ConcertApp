package com.concertApp.gangOfFive.Services;

import com.concertApp.gangOfFive.Domain.User;
import com.concertApp.gangOfFive.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void save(User user) { userRepository.save(user); }
}
