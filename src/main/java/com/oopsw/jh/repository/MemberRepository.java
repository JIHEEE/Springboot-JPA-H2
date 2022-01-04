package com.oopsw.jh.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.oopsw.jh.model.Member;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long>{
	
}
