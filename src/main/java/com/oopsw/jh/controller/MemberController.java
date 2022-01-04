package com.oopsw.jh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oopsw.jh.model.Member;
import com.oopsw.jh.repository.MemberRepository;

@RestController
public class MemberController {

	@Autowired
	private MemberRepository memberRepository;
	
	@RequestMapping("/member")
	public List<Member> getMembers(){
		return memberRepository.findAll();
	}
	
	
}
