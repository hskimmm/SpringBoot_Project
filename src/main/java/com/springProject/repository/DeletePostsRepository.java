package com.springProject.repository;

import com.springProject.entity.DeletePosts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeletePostsRepository extends JpaRepository<DeletePosts, Long> {
}
