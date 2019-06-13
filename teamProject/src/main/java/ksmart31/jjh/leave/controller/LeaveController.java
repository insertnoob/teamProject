package ksmart31.jjh.leave.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ksmart31.jjh.leave.domain.LeaveCategory;
import ksmart31.jjh.leave.service.LeaveService;

@Controller
public class LeaveController {
	@Autowired
	private LeaveService leaveService;
	
	@GetMapping("/leaveCategoryList")
	public String getleaveCategoryList(Model model) {
		List<LeaveCategory> list = leaveService.getLeaveCategoryList();
		System.out.println("LeaveController.getleaveCategoryList [GET] list : "+list);
		model.addAttribute("leaveCategoryList", list);
		return "leaveCategoryList";
	}
	
}
