package com.spboot.test.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spboot.test.entity.PcCurrentStatus;
import com.spboot.test.repository.PcCurrentStatusRepository;
import com.spboot.test.service.PcCurrentStatusService;

@Service
public class PcCurrentStatusServiceImpl implements PcCurrentStatusService {

	@Autowired
	private PcCurrentStatusRepository PCRepo;
	
	@Override
	public List<PcCurrentStatus> getPcStatusList() {
		return PCRepo.findAllByOrderByPcStatusNumDesc();
	}

	@Override
	public PcCurrentStatus getPcCurrentStatus(int pcStatusNum) {
		return null;
	}

	@Override
	public PcCurrentStatus insertPcCurrentStatus(PcCurrentStatus pcStatus) {
		return PCRepo.save(pcStatus);
	}

	@Override
	public PcCurrentStatus updatePcCurrentStatus(PcCurrentStatus pcStatus) {
		return PCRepo.save(pcStatus);
	}

	@Override
	public int deletePcCurrentStatus(int pcStatusNum) {
		PCRepo.deleteById(pcStatusNum);
		return 0;
	}

}
