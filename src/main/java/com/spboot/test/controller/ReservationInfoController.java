package com.spboot.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spboot.test.entity.ReservationInfo;
import com.spboot.test.service.ReservationInfoService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class ReservationInfoController {

	@Autowired
	private ReservationInfoService resService;
	
	@PostMapping("/res/insert")
	public String insertRes(@RequestBody ReservationInfo res) {
		log.info("res=>{}",res);
		return resService.insert(res);
	}
	
	@GetMapping("/res/user/{userNum}")
	public List<ReservationInfo> getUserRes(@PathVariable Integer userNum) {
		return resService.getUserRes(userNum);
	}
	
	@DeleteMapping("/res/delete/{resNum}")
	public Integer deleteRes(@PathVariable Integer resNum) {
		log.info("resNum=>{}",resNum);
		return resService.delete(resNum);
	}
}
