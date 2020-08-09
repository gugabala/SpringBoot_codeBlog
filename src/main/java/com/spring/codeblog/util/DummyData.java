package com.spring.codeblog.util;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.spring.codeblog.model.Post;
import com.spring.codeblog.repository.BlogRepository;

@Component
public class DummyData {
	@Autowired
	BlogRepository blogRepository;

	// @PostConstruct
	public void savePosts() {

		List<Post> postList = new ArrayList<>();
		Post post1 = new Post();
		post1.setAutor("Gustavo Garcez");
		post1.setData(LocalDate.now());
		post1.setTitulo("Flutter");
		post1.setTexto(
				"Uma corrida armamentista naval entre Argentina, Brasil e Chile — países mais poderosos e ricos da América do Sul — começou no início do século XX, quando o governo brasileiro comprou três dreadnoughts, formidáveis embarcações couraçadas cujas capacidades ultrapassavam em muito a dos navios mais antigos das marinhas do resto do mundo.");

		Post post2 = new Post();
		post2.setAutor("Lucas Vilar");
		post2.setData(LocalDate.now());
		post2.setTitulo("API REST");
		post2.setTexto(
				"Uma corrida armamentista naval entre Argentina, Brasil e Chile — países mais poderosos e ricos da América do Sul — começou no início do século XX, quando o governo brasileiro comprou três dreadnoughts, formidáveis embarcações couraçadas cujas capacidades ultrapassavam em muito a dos navios mais antigos das marinhas do resto do mundo.");
		postList.add(post1);
		postList.add(post2);

		System.out.println("----------------");
		System.out.println("Resultado");

		for (Post post : postList) {
			Post postSaved = blogRepository.save(post);
			System.out.println(postSaved.getId());
		}
		System.out.println("----------------");
		System.out.println("----------------");
	}
}
