package com.mine.repository;

import com.mine.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 * Comment 仓库.
 */
public interface CommentRepository extends JpaRepository<Comment, Long> {

}
