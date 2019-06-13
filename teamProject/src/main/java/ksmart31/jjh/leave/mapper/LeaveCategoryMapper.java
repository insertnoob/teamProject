package ksmart31.jjh.leave.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ksmart31.jjh.leave.domain.LeaveCategory;

@Mapper
public interface LeaveCategoryMapper {
	// 카테고리 리스트 조회
	public List<LeaveCategory> selectLeaveCategoryList();
	
}
