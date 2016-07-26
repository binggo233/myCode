package com.test.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.test.model.Member;
import com.test.service.MemberService;


@Controller
@RequestMapping(value="/member")
public class MemberController {
	
	  @Resource(name="memberService")
	  private MemberService memberService;
	  
	  public void setMemberService(MemberService memberService) {
	    this.memberService = memberService;
	  }
	  
	  
	  
	  @RequestMapping(value="/add")
	  public ModelAndView add(HttpServletRequest request,HttpServletResponse response){
	    Map<String,Object> map = new HashMap<String, Object>();
	    
	    Member member=new Member();
	    member.setId(1+"");
	    member.setNickname("dj");
	    this.memberService.add(member);
	    
	    map.put("message", "�ɹ�������ݵ���" );
	    return toView("/member/add", map);
	  }
	  
	 private ModelAndView toView(String string, Map<String, Object> map) {
		 ModelAndView modView=new ModelAndView();
		 modView.setViewName(string);
		 modView.addObject("map",map);
		return modView;
	}

	/*@RequestMapping(value={"/add","/add.jsp"},method={RequestMethod.POST})
	  public ModelAndView addMember(HttpServletRequest request,HttpServletResponse response,
	      @ModelAttribute("member")Member member){
	    Map<String,Object> map = new HashMap<String, Object>();
	    System.out.println(member);
	    map.put("message", "�ɹ�������ݵ���," + member);
	    this.memberService.add(member);
	    return toView("member/message", map);
	  }*/
	  
	  @RequestMapping(value={"/query","/query.html"},method={RequestMethod.GET,RequestMethod.POST})
	  public ModelAndView queryMember(HttpServletRequest request,HttpServletResponse response,
	     String id){
	    Map<String,Object> map = new HashMap<String, Object>();
	    System.out.println(id);
	    Member member = this.memberService.get(id);
	    if(null!=member){
	      map.put("message", "��ѯId=" + id + "���û���Ϊ:" + member.getNickname());
	    }else{
	      map.put("message", "û�в�ѯ����Id=" + id + "��ص�����");
	    }
	    return toView("member/message", map);
	  }
	  
	  @RequestMapping(value={"/{id:\\d+}/delete","/{id:\\d+}/delete.html"},method={RequestMethod.GET,RequestMethod.POST})
	  public ModelAndView deleteMember(HttpServletRequest request, HttpServletResponse response,
	      @PathVariable("id")String id){
	    Map<String,Object> map = new HashMap<String, Object>();
	    try {
	      this.memberService.delete(id);
	      map.put("message", "ɾ��IdΪ" + id +"���û��ɹ�.");
	    } catch (Exception e) {
	      e.printStackTrace();
	      map.put("message", "ɾ��IdΪ" + id +"���û�ʧ��, "+e.getMessage());
	    }
	    return toView("member/message", map);	
	  }
}
