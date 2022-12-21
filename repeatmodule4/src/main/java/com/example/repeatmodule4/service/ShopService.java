package com.example.repeatmodule4.service;

import com.example.repeatmodule4.repository.IShopRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
@Service
public class ShopService  {
    @Autowired
    IShopRepo iShopRepo;

    public long findIdShopByUserId(long id){
        return iShopRepo.findShopId(id);
    }

    public String findShopName(long id)
    {
        return iShopRepo.findShopName(id);
    }
}