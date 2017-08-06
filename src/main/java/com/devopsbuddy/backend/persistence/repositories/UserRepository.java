package com.devopsbuddy.backend.persistence.repositories;

import com.devopsbuddy.backend.persistence.domain.backend.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    /**
     * Returns a given a username or null if not found.
     * @param username The username
     * @return a given a username or null if not found.
     */
    User findByUsername(String username);

}
