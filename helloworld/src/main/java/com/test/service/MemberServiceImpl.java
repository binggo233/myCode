package com.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.dao.MemberDao;
import com.test.model.Member;

@Service(value="memberService")
public class MemberServiceImpl implements MemberService {

	@Autowired
	private MemberDao memberDao;
	
	public boolean add(Member member) {
		// TODO Auto-generated method stub
		return memberDao.add(member);
	}

	public boolean add(List<Member> list) {
		// TODO Auto-generated method stub
		return memberDao.add(list);
	}

	public void delete(String key) {
		memberDao.delete(key);

	}

	public void delete(List<String> keys) {
		// TODO Auto-generated method stub
		memberDao.delete(keys);
	}

	public boolean update(Member member) {
		return memberDao.update(member);
	}

	public Member get(String keyId) {
		return memberDao.get(keyId);
	}

}
