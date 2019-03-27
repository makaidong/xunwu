package com.gyw.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.gyw.entity.HouseTag;

/**
 * Created by gyw.
 */
public interface HouseTagRepository extends CrudRepository<HouseTag, Long> {
    HouseTag findByNameAndHouseId(String name, Long houseId);

    List<HouseTag> findAllByHouseId(Long id);

    List<HouseTag> findAllByHouseIdIn(List<Long> houseIds);
}
