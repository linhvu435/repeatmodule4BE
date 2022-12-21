package com.example.repeatmodule4.service;

import com.example.repeatmodule4.repository.ICommentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentService {
    @Autowired
    ICommentRepo iCommentRepo;
    public void insertToComment(String text, long idAccount, long idProduct){
        iCommentRepo.insertToComment(text,idAccount,idProduct);
    }

}
