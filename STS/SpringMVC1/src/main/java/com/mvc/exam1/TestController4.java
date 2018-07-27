package com.mvc.exam1;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class TestController4 {

	@RequestMapping("doAAAA")
	public String doAAAA(HttpServletRequest req, Model model) {
		String id=req.getParameter("id");
		String pw=req.getParameter("pw");

		model.addAttribute("id", id);
		model.addAttribute("pw", pw);

		return "sub/result";
	}
	
	@RequestMapping("doBBBB")
	public String doBBBB(@RequestParam("id") String id, @RequestParam("pw") int pw, Model model) {
		
		model.addAttribute("id", id);
		model.addAttribute("pw", pw);

		return "sub/result";
	}
}
