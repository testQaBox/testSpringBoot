package com.test.testSite.repo;

import com.test.testSite.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {
}

/* control BD*/