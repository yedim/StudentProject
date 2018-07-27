package com.mvc.exam1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TestController3 {

	//http://localhost:8080/exam/doAAA?name=hong
	//result2.jsp에 name이 전달됨
	//@ModelAttribute는 요청파라미터를 받아서 뷰(jsp페이지)까지 전달함!!
	@RequestMapping("doAAA")
	public String doAAA(@ModelAttribute("name") String name) {
		System.out.println("doAAA 실행됨...");
		System.out.println("name = "+name);
		
		return "result2";
	}
	
}
