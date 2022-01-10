package com.oopsw.jh.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oopsw.jh.model.Member;
import com.oopsw.jh.repository.MemberRepository;
import com.oopsw.jh.service.MemberService;

@Service
public class MemberServiceImpl implements MemberService{

	@Autowired
	MemberRepository memberRepository;
	
	@Override
	public List<Member> getMembers() throws Exception {
		return memberRepository.findAll();
	}

	@Override
	public Member getMemberById(String id) throws Exception {
		return memberRepository.findMemberById(id);
	}

	@Override
	public Member insertMember(Member member) throws Exception {
		return memberRepository.save(member);
	}
	
	@Override
	public Member updateMember(Member member) throws Exception {
		
		Member updateMember = memberRepository.findMemberById(member.getId()); 
		
		if(updateMember != null) {
			updateMember.setAge(member.getAge());
			updateMember.setName(member.getName());
			
			return memberRepository.save(updateMember);
		}
		
		return memberRepository.save(member);
	}

	@Override
	public void deleteMember(String id) throws Exception {
		memberRepository.deleteById(id);
	}

}
