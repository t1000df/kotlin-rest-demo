package com.mobiledin.kotlinrestdemo.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class Article(@Id var id: Int, var nome: String, var author: String) {
	
	
}