package com.mvc.service;

import org.springframework.stereotype.Service;

import com.mvc.domain.ArticleVO;

@Service   //@Component
public class ArticleServiceImpl implements ArticleService {

	@Override
	public void writeArticle(ArticleVO articleVO) {
		System.out.println("ArticleSerivce : "+ articleVO);
	}

}
