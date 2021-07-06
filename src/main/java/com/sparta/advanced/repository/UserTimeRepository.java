package com.sparta.advanced.repository;

import com.sparta.advanced.model.User;
import com.sparta.advanced.model.UserTime;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserTimeRepository extends JpaRepository<UserTime, Long> {
    UserTime findByUser(User user);
}