package com.gyw.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.gyw.entity.HousePicture;

/**
 * Created by gyw.
 */
public interface HousePictureRepository extends CrudRepository<HousePicture, Long> {
    List<HousePicture> findAllByHouseId(Long id);
}
