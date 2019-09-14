package com.example.assignmentpart1.repository;

import com.example.assignmentpart1.entity.Coin;

import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;

public interface CoinRepository extends JpaRepository<Coin, Long> {
    List<Coin> findAllByNameAndStatus(String name, int status);
    List<Coin> findAllByMarketIdEquals(long id);
    List<Coin> findAllByName(String name);

}
