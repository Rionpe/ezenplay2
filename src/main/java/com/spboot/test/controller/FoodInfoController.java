package com.spboot.test.controller;


import java.io.IOException;
import java.util.List;
import java.util.Optional;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.spboot.test.entity.FoodInfo;
import com.spboot.test.service.FoodInfoService;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class FoodInfoController {

	@Autowired
	private FoodInfoService foodService;
	
	@GetMapping("/food-list")
	public @ResponseBody List<FoodInfo> foodList(){

		return foodService.getFoodInfoList();
	}
	
	@GetMapping("/food-info")
	public @ResponseBody List<FoodInfo> foodInfos(@RequestParam String foodType){
		log.info(foodType);
		return foodService.getFoodInfos(foodType);
	}
	
	@PostMapping("/views/food/food-result")
	public  FoodInfo insertFood(@ModelAttribute FoodInfo food) {
		log.info("foodInfo=>{}",food);
		return foodService.insertFoodInfo(food);
	}
	
	@GetMapping("/food")
	public @ResponseBody Optional<FoodInfo> getfoodInfo(Integer foodNum) {
		return foodService.getFoodInfo(foodNum);
	
	}
}