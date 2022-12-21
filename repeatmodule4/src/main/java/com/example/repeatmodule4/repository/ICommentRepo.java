package com.example.repeatmodule4.repository;

import com.example.repeatmodule4.model.Comment;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface ICommentRepo extends CrudRepository<Comment,Long> {
    @Query(nativeQuery = true, value = "insert into comment(text, id_account, id_product) values(?1,?2,?3)")
    void insertToComment(String text, long id_account, long id_product);
}
