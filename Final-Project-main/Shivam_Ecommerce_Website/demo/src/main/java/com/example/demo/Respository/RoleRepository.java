package com.example.demo.Respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.Role;

public interface RoleRepository extends JpaRepository<Role,Integer>{
    
}
