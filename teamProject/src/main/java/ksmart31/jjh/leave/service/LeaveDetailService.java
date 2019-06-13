package ksmart31.jjh.leave.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ksmart31.jjh.leave.domain.LeaveDetail;
import ksmart31.jjh.leave.mapper.LeaveDetailMapper;

@Service
@Transactional
public class LeaveDetailService {
	@Autowired
	private LeaveDetailMapper leaveDetailMapper;
	
	// 상세 휴가 리스트 조회
	public List<LeaveDetail> getLeaveDetailList(String leaveCategoryCode){
		return leaveDetailMapper.selectLeaveDetailList(leaveCategoryCode);
	}
}
