package com.example.assignmentpart1.service;

import com.example.assignmentpart1.entity.Coin;
import com.example.assignmentpart1.entity.Market;
import org.springframework.data.domain.Page;

import java.util.List;

public interface MarketService {

    Market store (Market market);
    List<Market> marketList();

}
