package com.oopsw.jh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oopsw.jh.model.Member;
import com.oopsw.jh.service.MemberService;

@RestController
public class MemberController {

	@Autowired
	private MemberService memberService;
	
	@GetMapping("/members")
	public List<Member> getMembers() throws Exception {
	
		return memberService.getMembers();
		
	}
	
	@GetMapping("/member")
	public Member getMemberById(String id) throws Exception {
		
		Member member = memberService.getMemberById(id);
		
		return member;
	
	}
	
	@PutMapping("/member")
	public Member insertMember(Member paramMember) throws Exception {
//		paramMember.setId("4");
//		paramMember.setName("Amy");
//		paramMember.setAge(26);
		
		Member member = memberService.insertMember(paramMember);
		return member;
	}
	
	@DeleteMapping("member")
	public void deleteMember(String id) throws Exception {
		memberService.deleteMember(id);
	}
	
	
	
	
}
