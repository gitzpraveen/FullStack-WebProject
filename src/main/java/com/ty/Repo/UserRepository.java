package com.ty.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ty.Entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> 
{
	User findByEmail(String email);

}
