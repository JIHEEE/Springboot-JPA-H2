package com.oopsw.jh.service;

import java.util.List;

import com.oopsw.jh.model.Member;

public interface MemberService {
	
	public List<Member> getMembers() throws Exception;
	public Member getMemberById(String id) throws Exception;
	public int updateMember() throws Exception;
	public int deleteMember() throws Exception;
	
}
