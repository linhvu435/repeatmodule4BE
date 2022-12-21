package com.example.repeatmodule4.repository;


import com.example.repeatmodule4.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IProductRepo extends PagingAndSortingRepository<Product, Long> {
    @Query(nativeQuery = true, value = "SELECT * FROM product where name like concat('%',:name,'%')")
    List<Product> findByName(@Param("name") String name);
    @Query(nativeQuery = true,value = "select * from product where id_shop = ?1")
    Page<Product> productShop(long id, Pageable pageable);

}
