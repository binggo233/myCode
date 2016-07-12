package com.test.dao;

import java.util.List;

import com.test.model.Member;

public interface MemberDao {
	 /**
	   * ��Ӷ���
	   */
	  public boolean add( Member member);
	  
	  /**
	   * ��Ӽ���
	   */
	  public boolean add( List<Member> list);
	  
	  /**
	   * ɾ������ ,����key
	   */
	  public void delete(String key);
	  
	  /**
	   * ɾ������ ,����key����
	   */
	  public void delete(List<String> keys);
	  
	  /**
	   * �޸Ķ��� 
	   */
	  public boolean update(final Member member) ;
	  
	  /**
	   * ����key��ȡ����
	   */
	  public Member get(final String keyId);
}
