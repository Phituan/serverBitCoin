package com.example.assignmentpart1.repository;
import com.example.assignmentpart1.entity.Market;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface MarketRepository extends JpaRepository<Market,Long> {
    List<Market> findAllByNameAndStatus(String name, int status);
}
