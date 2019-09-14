package com.example.assignmentpart1.service;

import com.example.assignmentpart1.entity.Coin;
import com.example.assignmentpart1.repository.CoinRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.List;

@Service
public class CoinServiceImplement implements CoinService{
    @Autowired
    private CoinRepository coinRepository;
    @Override
    public Coin store(Coin coin) {
        coin.setCreatedAt(Calendar.getInstance().getTimeInMillis());
        coin.setUpdatedAt(Calendar.getInstance().getTimeInMillis());
        coinRepository.save(coin);
        return coin;

    }

    @Override
    public List<Coin> coinList() {
        return coinRepository.findAll();
    }

    @Override
    public List<Coin> findCoinByName(String name) {
        return coinRepository.findAllByName(name);
    }

    @Override
    public List<Coin> findCoinByMarket(long id) {
        return coinRepository.findAllByMarketIdEquals(id);
    }
}