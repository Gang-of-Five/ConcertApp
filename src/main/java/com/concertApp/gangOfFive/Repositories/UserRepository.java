package com.concertApp.gangOfFive.Repositories;

import com.concertApp.gangOfFive.Domain.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    User save(User user);
}
