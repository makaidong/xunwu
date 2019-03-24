package com.imooc.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.imooc.entity.SubwayStation;

/**
 * Created by gyw.
 */
public interface SubwayStationRepository extends CrudRepository<SubwayStation, Long> {
    List<SubwayStation> findAllBySubwayId(Long subwayId);
}
