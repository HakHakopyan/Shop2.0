package com.example.project.repository;

import com.example.project.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
    @Override
    List<User> findAll();

    User findByUsername(String username);

    User findByActivationCode(String code);
}
