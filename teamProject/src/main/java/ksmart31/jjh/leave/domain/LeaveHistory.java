package ksmart31.jjh.leave.domain;

public class LeaveHistory {
	private String LeaveHistoryCode;
	private String memberId;
	private String leaveCategorySort;
	private int leaveHistoryGrantHour;
	private int leaveHistoryGrantDay;
	private int leaveHistoryUsedHour;
	private int leaveHistoryUsedDay;
	private int leaveHistoryRemainingHour;
	private int leaveHistoryRemainingDay;
	private String leave_history_date;
	private String member_employee_code;
	private String member_name;
	private String department_name;
	private String member_position_name;
	public String getLeaveHistoryCode() {
		return LeaveHistoryCode;
	}
	public void setLeaveHistoryCode(String leaveHistoryCode) {
		LeaveHistoryCode = leaveHistoryCode;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getLeaveCategorySort() {
		return leaveCategorySort;
	}
	public void setLeaveCategorySort(String leaveCategorySort) {
		this.leaveCategorySort = leaveCategorySort;
	}
	public int getLeaveHistoryGrantHour() {
		return leaveHistoryGrantHour;
	}
	public void setLeaveHistoryGrantHour(int leaveHistoryGrantHour) {
		this.leaveHistoryGrantHour = leaveHistoryGrantHour;
	}
	public int getLeaveHistoryGrantDay() {
		return leaveHistoryGrantDay;
	}
	public void setLeaveHistoryGrantDay(int leaveHistoryGrantDay) {
		this.leaveHistoryGrantDay = leaveHistoryGrantDay;
	}
	public int getLeaveHistoryUsedHour() {
		return leaveHistoryUsedHour;
	}
	public void setLeaveHistoryUsedHour(int leaveHistoryUsedHour) {
		this.leaveHistoryUsedHour = leaveHistoryUsedHour;
	}
	public int getLeaveHistoryUsedDay() {
		return leaveHistoryUsedDay;
	}
	public void setLeaveHistoryUsedDay(int leaveHistoryUsedDay) {
		this.leaveHistoryUsedDay = leaveHistoryUsedDay;
	}
	public int getLeaveHistoryRemainingHour() {
		return leaveHistoryRemainingHour;
	}
	public void setLeaveHistoryRemainingHour(int leaveHistoryRemainingHour) {
		this.leaveHistoryRemainingHour = leaveHistoryRemainingHour;
	}
	public int getLeaveHistoryRemainingDay() {
		return leaveHistoryRemainingDay;
	}
	public void setLeaveHistoryRemainingDay(int leaveHistoryRemainingDay) {
		this.leaveHistoryRemainingDay = leaveHistoryRemainingDay;
	}
	public String getLeave_history_date() {
		return leave_history_date;
	}
	public void setLeave_history_date(String leave_history_date) {
		this.leave_history_date = leave_history_date;
	}
	public String getMember_employee_code() {
		return member_employee_code;
	}
	public void setMember_employee_code(String member_employee_code) {
		this.member_employee_code = member_employee_code;
	}
	public String getMember_name() {
		return member_name;
	}
	public void setMember_name(String member_name) {
		this.member_name = member_name;
	}
	public String getDepartment_name() {
		return department_name;
	}
	public void setDepartment_name(String department_name) {
		this.department_name = department_name;
	}
	public String getMember_position_name() {
		return member_position_name;
	}
	public void setMember_position_name(String member_position_name) {
		this.member_position_name = member_position_name;
	}
	@Override
	public String toString() {
		return "LeaveHistory [LeaveHistoryCode=" + LeaveHistoryCode + ", memberId=" + memberId + ", leaveCategorySort="
				+ leaveCategorySort + ", leaveHistoryGrantHour=" + leaveHistoryGrantHour + ", leaveHistoryGrantDay="
				+ leaveHistoryGrantDay + ", leaveHistoryUsedHour=" + leaveHistoryUsedHour + ", leaveHistoryUsedDay="
				+ leaveHistoryUsedDay + ", leaveHistoryRemainingHour=" + leaveHistoryRemainingHour
				+ ", leaveHistoryRemainingDay=" + leaveHistoryRemainingDay + ", leave_history_date="
				+ leave_history_date + ", member_employee_code=" + member_employee_code + ", member_name=" + member_name
				+ ", department_name=" + department_name + ", member_position_name=" + member_position_name + "]";
	}
	
}
