package com.example.repeatmodule4.controller;

import com.example.repeatmodule4.model.Comment;
import com.example.repeatmodule4.repository.IAccountRepo;
import com.example.repeatmodule4.repository.ICommentRepo;
import com.example.repeatmodule4.repository.IProductRepo;
import com.example.repeatmodule4.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping("/comment")
public class CommentController {
    @Autowired
    CommentService commentService;
    @Autowired
    IAccountRepo iAccountRepo;
    @Autowired
    IProductRepo iProductRepo;
    @Autowired
    ICommentRepo iCommentRepo;
    @GetMapping
    public ResponseEntity comment(@RequestParam String text,@RequestParam long id_account,@RequestParam long id_product){
        Comment comment = new Comment(text,iAccountRepo.findById(id_account).get(),iProductRepo.findById(id_product).get());
        iCommentRepo.save(comment);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
