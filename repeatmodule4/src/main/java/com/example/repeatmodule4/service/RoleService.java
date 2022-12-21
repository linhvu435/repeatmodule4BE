package com.example.repeatmodule4.service;

import com.example.repeatmodule4.model.Roles;
import com.example.repeatmodule4.repository.IRoleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class RoleService {
    @Autowired
    private IRoleRepo roleRepo;


    public Iterable<Roles> findAll() {
        return roleRepo.findAll();
    }


    public Optional<Roles> findById(Long id) {
        return roleRepo.findById(id);
    }


    public Roles save(Roles roles) {
        return roleRepo.save(roles);
    }


    public void delete(Long id) {
        roleRepo.deleteById(id);
    }

}
