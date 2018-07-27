package com.mvc.exam1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mvc.domain.MemberVO;

@Controller
public class TestController6 {

	//@RequestMapping("/methodTest") 요청은 get, post방식의 요청을 다 처리함
	@RequestMapping("/methodTest")
	public void methodTest() {
		System.out.println("methodTest 실행됨...");
	}
	
	@RequestMapping(value="/submit", method=RequestMethod.POST)
	public String doPost(Model model) {
		System.out.println("/doPost 실행됨...");
		model.addAttribute("method", "post");
		
		return "resultPage";
	}
	
	@RequestMapping(value="/submit", method=RequestMethod.GET)
	public String doGet(Model model) {
		System.out.println("/doGet 실행됨...");
		model.addAttribute("method", "get");
		
		return "resultPage";
	}
	@RequestMapping(value="/member", method=RequestMethod.GET)
	public String memberGet() {
		System.out.println("/memberGet 실행됨...");
		
		return "member/memberForm";
	}
	
	@RequestMapping(value="/member", method=RequestMethod.POST)
	public String memberPost(MemberVO memberVO,Model model) {
		System.out.println("/memberPost 실행됨...");
		
		int age = memberVO.getAge();
		String result="";
		
		if(age<20)
			result="미성년입니다.";
		else
			result="성년입니다.";
		
		model.addAttribute("result", result);
		
		return "member/memberResult";
	}
}
