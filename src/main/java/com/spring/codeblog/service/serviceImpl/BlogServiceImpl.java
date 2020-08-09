package com.spring.codeblog.service.serviceImpl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.spring.codeblog.model.Post;
import com.spring.codeblog.repository.BlogRepository;
import com.spring.codeblog.service.BlogService;

@Service
public class BlogServiceImpl implements BlogService {
	  @Autowired
	    BlogRepository blogRepository;

	    @Override
	    public List<Post> findAll() {
	        return blogRepository.findAll();
	    }

	    @Override
	    public Post findById(long id) {
	        return blogRepository.findById(id).get();
	    }

	    @Override
	    public Post save(Post post) {
	        return blogRepository.save(post);
	    }


}
