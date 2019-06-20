package ksmart31.jjh.leave.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LeaveHistoryContoller {

	
	@GetMapping("/leaveHistoryManagement")
	public String getleaveHistoryManagement() {
		
		return "leaveHistoryManagement";
	}
}
