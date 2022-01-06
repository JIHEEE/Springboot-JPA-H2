package com.oopsw.jh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oopsw.jh.model.Member;
import com.oopsw.jh.repository.MemberRepository;

@RestController
public class MemberController {

	@Autowired
	private MemberRepository memberRepository;
	
	@GetMapping("/members")
	public List<Member> getMembers(){
	
		return memberRepository.findAll();

	}
	
	@GetMapping("/member")
	public Member getMemberById(String id) {
		
		Member member = memberRepository.findMemberById(id);
		
		return member;
	
	}
	
	
	
}
