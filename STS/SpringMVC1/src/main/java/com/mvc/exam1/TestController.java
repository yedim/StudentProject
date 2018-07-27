package com.mvc.exam1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	
	//반환형 void인경우
	//요청결과 화면(일반적으로 jsp)은 요청 경로(RequestMappin)에 해당하는 jsp파일이 실행됨
	//jsp 파일의 경로는 servlet-context.xml 파일의 ViewResolver에 설정되어 있음
	
	// http://localhost:8080/exam1/doA라고 요청하면 doA.jsp가 서비스됨.
	@RequestMapping("/doA") 
	public void doA(){
		System.out.println("doA 실행됨... :");
	}
	
	@RequestMapping("/aaa") 
	public void test(){
		System.out.println("aaa 실행됨... :");
	}
}
