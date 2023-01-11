package com.example.demo.andi;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AndiRepository
        extends JpaRepository<Andi,Integer> {
}
