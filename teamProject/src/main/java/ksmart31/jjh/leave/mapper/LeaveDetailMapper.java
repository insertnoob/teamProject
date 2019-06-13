package ksmart31.jjh.leave.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ksmart31.jjh.leave.domain.LeaveDetail;

@Mapper
public interface LeaveDetailMapper {
	// 상세 휴가 리스트 조회
	public List<LeaveDetail> selectLeaveDetailList(String leaveCategoryCode);
}
