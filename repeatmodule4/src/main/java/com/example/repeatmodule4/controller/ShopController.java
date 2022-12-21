package com.example.repeatmodule4.controller;

import com.example.repeatmodule4.model.dto.ShopToken;
import com.example.repeatmodule4.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping("/shop")
public class ShopController {
 @Autowired
 ShopService shopService;

 @GetMapping("/{id}")
 public ResponseEntity findShopId(@PathVariable long id) {
  shopService.findIdShopByUserId(id);
  shopService.findShopName(id);
  ShopToken shopToken = new ShopToken(shopService.findIdShopByUserId(id),shopService.findShopName(id));
  return new ResponseEntity<>( shopToken, HttpStatus.OK);
 }

}


