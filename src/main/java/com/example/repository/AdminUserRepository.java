package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.AdminUser;
import com.example.enums.Role;


@Repository
public interface AdminUserRepository extends JpaRepository<AdminUser,Long>{
	AdminUser findByEmail(String email);
	List<AdminUser> findByRole(Role role);

}