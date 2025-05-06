package edu.psu.se411.basiclogin.repository;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import edu.psu.se411.basiclogin.model.User;

public interface UserRepository extends CrudRepository<User, Integer> {

    @Query("SELECT * FROM users WHERE username = :username")
    User findByUsername(@Param("username") String username);

}
