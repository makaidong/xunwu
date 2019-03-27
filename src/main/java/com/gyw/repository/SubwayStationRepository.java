package com.gyw.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.gyw.entity.SubwayStation;

/**
 * Created by gyw.
 */
public interface SubwayStationRepository extends CrudRepository<SubwayStation, Long> {
    List<SubwayStation> findAllBySubwayId(Long subwayId);
}
