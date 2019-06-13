package ksmart31.jjh.leave.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ksmart31.jjh.leave.domain.LeaveCategory;
import ksmart31.jjh.leave.mapper.LeaveCategoryMapper;

@Service
@Transactional
public class LeaveService {
	@Autowired
	private LeaveCategoryMapper leaveCategoryMapper;
	
	// 카테고리 리스트 조회
	public List<LeaveCategory> getLeaveCategoryList(){
		return leaveCategoryMapper.selectLeaveCategoryList();
	}
}
