package com.alan.webclientpratice.repository;

import com.alan.webclientpratice.dto.SummonerDto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SummonerJpaRepository extends JpaRepository<SummonerDto,String> {

    SummonerDto findByName(String name);

    SummonerDto findByPuuid(String name);

}
