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
	public int updateMember() throws Exception {
		return 0;
	}

	@Override
	public int deleteMember() throws Exception {
		return 0;
	}

}