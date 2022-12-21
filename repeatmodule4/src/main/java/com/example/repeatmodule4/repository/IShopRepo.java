package com.example.repeatmodule4.repository;

import com.example.repeatmodule4.model.Shop;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface IShopRepo extends CrudRepository<Shop,Long> {
    @Query(nativeQuery = true,value = "select id from shop where id_account = ?1")
    long findShopId(long id);
    @Query(nativeQuery = true, value = "select name from shop where id_account = ?1")
    String findShopName(long id);
}
