package com.example.assignmentpart1.service;

import com.example.assignmentpart1.entity.Coin;

import java.util.List;

public interface CoinService {
    Coin store (Coin coin);
    List<Coin> coinList();
    List<Coin> findCoinByName(String name);

    List<Coin> findCoinByMarket(long id);
}
