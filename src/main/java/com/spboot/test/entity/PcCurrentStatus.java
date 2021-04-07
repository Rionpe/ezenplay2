package com.spboot.test.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="pc_current_status")
@Data
public class PcCurrentStatus {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="pc_status_num")
	private Integer pcStatusNum;
	@Column(name="pc_seat_result")
	private Integer pcSeatResult;
	
	 @ManyToOne
	 @JoinColumn(name="user_num")
	 private UserInfo userInfo;
	 
	 @ManyToOne
	 @JoinColumn(name="pc_seat_num")
	 private PcInfo pcInfo;
	 
	 @ManyToOne
	 @JoinColumn(name="res_num")
	 private ReservationInfo reservationInfo;
}
