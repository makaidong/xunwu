package com.gyw.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.gyw.entity.HouseDetail;

/**
 * Created by gyw.
 */
public interface HouseDetailRepository extends CrudRepository<HouseDetail, Long>{
    HouseDetail findByHouseId(Long houseId);

    List<HouseDetail> findAllByHouseIdIn(List<Long> houseIds);
}
