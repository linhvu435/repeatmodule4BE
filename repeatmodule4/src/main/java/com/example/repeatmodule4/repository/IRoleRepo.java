package com.example.repeatmodule4.repository;

import com.example.repeatmodule4.model.Roles;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRoleRepo extends JpaRepository<Roles,Long> {
    Roles findByName(String name);

}
