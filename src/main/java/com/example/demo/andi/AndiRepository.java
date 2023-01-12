package com.example.demo.andi;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AndiRepository
        extends JpaRepository<Andi,Integer> {

//    @Query("SELECT a FROM Andi andi  WHERE andi.email = ?1")//we can use this way for complicated queries
    Optional<Andi> findAndiByEmail(String email);//    SELECT * FROM andisdemoproject WHERE email =?
}
