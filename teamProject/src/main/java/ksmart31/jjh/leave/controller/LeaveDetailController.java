package ksmart31.jjh.leave.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import ksmart31.jjh.leave.service.LeaveDetailService;

@RestController
public class LeaveDetailController {
	@Autowired
	private LeaveDetailService leaveDetailService;
	
	@GetMapping("/leaveDetailAndPolicyList")
	public Map<String, Object> getLeaveDetailAndPolicyList(String leaveCategoryCode) {
		System.out.println("LeaveDetailController.getLeaveDetailList [GET] 메소드 실행");
		System.out.println("LeaveDetailController.getLeaveDetailList [GET] leaveCategoryCode : "+leaveCategoryCode);
		Map<String, Object> map =  leaveDetailService.getLeaveDetailAndPolicyList(leaveCategoryCode);
		System.out.println("LeaveDetailController.getLeaveDetailList [GET] map : "+map);
		return map;
	}
}
