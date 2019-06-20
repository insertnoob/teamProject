package ksmart31.jjh.leave.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ksmart31.jjh.leave.domain.LeaveHistory;

@Mapper
public interface LeaveHistoryMapper {
	// 조직원 아이디별 휴가 내역 조회
	public List<LeaveHistory> selectLeaveHistoryByMemberId();
}
