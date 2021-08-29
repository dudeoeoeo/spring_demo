package com.docker_exam.backend_spring.repository;

import com.docker_exam.backend_spring.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
