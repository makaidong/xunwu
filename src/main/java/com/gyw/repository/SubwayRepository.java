package com.gyw.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.gyw.entity.Subway;

/**
 * Created by gyw.
 */
public interface SubwayRepository extends CrudRepository<Subway, Long>{
    List<Subway> findAllByCityEnName(String cityEnName);
}
