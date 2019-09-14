package com.example.assignmentpart1.controller;

import com.example.assignmentpart1.entity.Coin;
import com.example.assignmentpart1.entity.JsonResponse;
import com.example.assignmentpart1.entity.Market;
import com.example.assignmentpart1.service.CoinService;
import com.example.assignmentpart1.service.MarketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(value = "/api/markets")
public class MarketController {
    @Autowired
    private MarketService marketService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<Market>> Markets(){
        List<Market> markets = marketService.marketList();
        return new ResponseEntity<>(markets, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Object> store(@RequestBody Market market){

        try {
            if (market == null){
                return new ResponseEntity<>(new JsonResponse()
                        .setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR)
                        .setMessage("service error"), HttpStatus.INTERNAL_SERVER_ERROR);
            }
            return new ResponseEntity<>(new JsonResponse()
                    .setStatus(HttpServletResponse.SC_CREATED)
                    .setMessage("create success")
                    .setMetaData(marketService.store(market)), HttpStatus.OK);
        }catch (Exception ex){
            ex.printStackTrace();
            return new ResponseEntity<>(new JsonResponse()
                    .setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR)
                    .setMessage("service error"), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}