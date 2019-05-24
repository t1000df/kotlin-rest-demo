package com.mobiledin.kotlinrestdemo.controller

import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.GetMapping
import com.mobiledin.kotlinrestdemo.model.Article

@RestController
@RequestMapping("/api")
class ArticleController {
	
	@GetMapping("/articles")
    fun getAllArticles(): List<Article> {
		
		var lista = mutableListOf(Article(1,"Teste","Alesssandro"),Article(2,"Teste2","Alesssandro"))
		return lista
		
	}
}