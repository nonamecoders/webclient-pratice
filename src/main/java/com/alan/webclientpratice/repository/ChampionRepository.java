package com.alan.webclientpratice.repository;

import com.alan.webclientpratice.dto.ChampionDto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChampionRepository extends JpaRepository<ChampionDto, Long> {

}
