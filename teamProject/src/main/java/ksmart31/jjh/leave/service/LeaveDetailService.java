package ksmart31.jjh.leave.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ksmart31.jjh.leave.domain.LeaveDetail;
import ksmart31.jjh.leave.domain.LeavePolicy;
import ksmart31.jjh.leave.mapper.LeaveDetailMapper;
import ksmart31.jjh.leave.mapper.LeavePolicyMapper;

@Service
@Transactional
public class LeaveDetailService {
	// 세부 휴가
	@Autowired
	private LeaveDetailMapper leaveDetailMapper;
	// 휴가 정책
	@Autowired
	private LeavePolicyMapper leavePolicyMapper;
	
	// 상세 휴가 리스트, 휴가 정책 리스트 조회
	public Map<String, Object> getLeaveDetailAndPolicyList(String leaveCategoryCode){
		// 상세 휴가 리스트
		List<LeaveDetail> leaveDetailList = leaveDetailMapper.selectLeaveDetailList(leaveCategoryCode);
		System.out.println("LeaveDetailService.getLeaveDetailList leaveDetailList : "+leaveDetailList);
		// 휴가 정책 리스트
		List<LeavePolicy> leavePolicyList = leavePolicyMapper.selectLeavePolicyList(leaveCategoryCode);
		System.out.println("LeaveDetailService.getLeaveDetailList leavePolicyList : "+leavePolicyList);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("leaveDetailList", leaveDetailList);
		map.put("leavePolicyList", leavePolicyList);
		return map;
	}
}
