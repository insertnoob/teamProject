package ksmart31.jjh.leave.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import ksmart31.jjh.leave.domain.LeaveDetail;
import ksmart31.jjh.leave.service.LeaveDetailService;

@RestController
public class LeaveDetailController {
	@Autowired
	private LeaveDetailService leaveDetailService;
	
	@GetMapping("/leaveDetailList")
	public List<LeaveDetail> getLeaveDetailList(String leaveCategoryCode) {
		System.out.println("LeaveDetailController.getLeaveDetailList [GET] 메소드 실행");
		System.out.println("LeaveDetailController.getLeaveDetailList [GET] leaveCategoryCode : "+leaveCategoryCode);
		List<LeaveDetail> leaveDetailList = leaveDetailService.getLeaveDetailList(leaveCategoryCode);
		System.out.println("LeaveDetailController.getLeaveDetailList [GET] leaveDetailList : "+leaveDetailList);
		return leaveDetailList;
	}
}
