package com.spboot.test.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.spboot.test.entity.PcCurrentStatus;
import com.spboot.test.service.PcCurrentStatusService;

@Service
public class PcCurrentStatusServiceImpl implements PcCurrentStatusService {

	@Override
	public List<PcCurrentStatus> getPcStatusList() {
		return null;
	}

	@Override
	public PcCurrentStatus getPcCurrentStatus(int pcStatusNum) {
		return null;
	}

	@Override
	public int insertPcCurrentStatus(PcCurrentStatus pcStatus) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updatePcCurrentStatus(PcCurrentStatus pcStatus) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deletePcCurrentStatus(int pcStatusNum) {
		// TODO Auto-generated method stub
		return 0;
	}

}
