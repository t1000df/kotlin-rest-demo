package com.mobiledin.kotlinrestdemo.repository

import org.springframework.stereotype.Repository
import org.springframework.data.jpa.repository.JpaRepository
import com.mobiledin.kotlinrestdemo.model.Article

@Repository
interface ArticleRepository : JpaRepository<Article, Long> 