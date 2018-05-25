package com.redq.latte.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.redq.latte.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	@Query("from User u where u.mobile=:mobile")
	User findByMobile(@Param("mobile") String mobile);

	@Query("from User u where u.nickname=:nickname")
	User findByNickname(@Param("nickname") String nickname);
	
}