package com.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mvc.domain.ArticleVO;
import com.mvc.service.ArticleService;

@Controller     //Controller는 GUI, front-end
public class ArticleController {
	
	@Autowired     //자동주입
	private ArticleService articleService;
	
	@RequestMapping(value="/article",method=RequestMethod.GET)
	public String articleGet() {
		System.out.println("articleGet실행됨...");
		
		return "article/form";
	}
	
	@RequestMapping(value="/article",method=RequestMethod.POST)
	public String articlePost(ArticleVO articleVO) {
		System.out.println("articlePost실행됨...");
		
		articleService.writeArticle(articleVO);
		
		return "article/view";
	}
	
	
}
