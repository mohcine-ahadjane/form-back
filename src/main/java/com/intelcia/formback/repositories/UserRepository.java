package com.intelcia.formback.repositories;

import com.intelcia.formback.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
