package be.intecbrussel.blog.repositories;

import be.intecbrussel.blog.data.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository <User, Long> {

    List<User> findAll();
    Optional<User> findUserByUserName(String userName);



}
