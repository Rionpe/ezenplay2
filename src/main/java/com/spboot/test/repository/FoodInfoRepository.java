package com.spboot.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spboot.test.entity.FoodInfo;

public interface FoodInfoRepository extends JpaRepository<FoodInfo, Integer> {

}
