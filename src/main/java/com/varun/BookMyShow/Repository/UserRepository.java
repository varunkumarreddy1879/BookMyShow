package com.varun.BookMyShow.Repository;

import com.varun.BookMyShow.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

    public Optional<User> findById(Long userId);

    public Optional<User> findBymail(String mail);

    public User save(User user);
}
