package ksmart31.jjh.leave.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ksmart31.jjh.leave.domain.LeavePolicy;

@Mapper
public interface LeavePolicyMapper {
	// 휴가 정책 리스트 조회 
	public List<LeavePolicy> selectLeavePolicyList(String leaveCategoryCode);
}
