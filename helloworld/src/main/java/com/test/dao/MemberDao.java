package com.test.dao;

import java.util.List;

import com.test.model.Member;

public interface MemberDao {
	 /**
	   * 添加对象
	   */
	  public boolean add( Member member);
	  
	  /**
	   * 添加集合
	   */
	  public boolean add( List<Member> list);
	  
	  /**
	   * 删除对象 ,依赖key
	   */
	  public void delete(String key);
	  
	  /**
	   * 删除集合 ,依赖key集合
	   */
	  public void delete(List<String> keys);
	  
	  /**
	   * 修改对象 
	   */
	  public boolean update(final Member member) ;
	  
	  /**
	   * 根据key获取对象
	   */
	  public Member get(final String keyId);
}
