package com.example.assignmentpart1.service;

import com.example.assignmentpart1.entity.Coin;
import com.example.assignmentpart1.entity.Market;
import com.example.assignmentpart1.repository.CoinRepository;
import com.example.assignmentpart1.repository.MarketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.List;

@Service
public class MarketServiceImplement implements MarketService{
    @Autowired
    private MarketRepository marketRepository;
    @Override
    public Market store(Market market) {
        market.setCreatedAt(Calendar.getInstance().getTimeInMillis());
        market.setUpdatedAt(Calendar.getInstance().getTimeInMillis());
        marketRepository.save(market);
        return market;

    }

    @Override
    public List<Market> marketList() {
        return marketRepository.findAll();
    }
}