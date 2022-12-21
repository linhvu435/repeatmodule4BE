package com.example.repeatmodule4.repository;
import com.example.repeatmodule4.model.Account;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.Optional;


public interface IAccountRepo extends CrudRepository<Account, Long> {
    Account findByUserName(String userName);
    Account findByEmail(String email);
    @Query(value = "SELECT * FROM account where user_name = :userName ", nativeQuery = true)
    Optional<Account> checkDoubleUser(@Param("userName") String user_name);
}
