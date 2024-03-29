package ksmart31.jjh.leave.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import ksmart31.jjh.leave.domain.LeaveDetail;
import ksmart31.jjh.leave.domain.LeavePolicy;
import ksmart31.jjh.leave.service.LeaveCategoryManagementService;

@RestController
public class LeaveDetailAndPolicyController {
	@Autowired
	private LeaveCategoryManagementService leaveCategoryManagementService;
	
	@GetMapping("/leaveDetail")
	public LeaveDetail getleaveDetail(String leaveDetailCode) {
		System.out.println("LeaveCategoryController.getleaveDetail [GET] 메소드 실행");
		System.out.println("LeaveCategoryController.getleaveDetail [GET] leaveDetailCode : "+leaveDetailCode);
		
		return leaveCategoryManagementService.getLeaveDetail(leaveDetailCode);
		// List<LeaveDetail> resultLeaveDetail = new ArrayList<LeaveDetail>();
		// resultLeaveDetail.add(leaveDetail);
		// return resultLeaveDetail;
	}
	
	@GetMapping("/leavePolicy")
	public LeavePolicy getleavePolicy(String leavePolicyCode) {
		System.out.println("LeaveCategoryController.getleavePolicy [GET] 메소드 실행");
		System.out.println("LeaveCategoryController.getleavePolicy [GET] leavePolicyCode : "+leavePolicyCode);
		
		return leaveCategoryManagementService.getLeavePolicy(leavePolicyCode);
		// List<LeaveDetail> resultLeaveDetail = new ArrayList<LeaveDetail>();
		// resultLeaveDetail.add(leaveDetail);
		// return resultLeaveDetail;
	}
	
}
