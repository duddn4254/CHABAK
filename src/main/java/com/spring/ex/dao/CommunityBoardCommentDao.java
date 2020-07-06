package com.spring.ex.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.ex.dto.community_board_comment_Dto;
import com.spring.ex.service.CommunityBoardCommentServiceImpl;

@Repository
public class CommunityBoardCommentDao implements CommunityBoardCommentServiceImpl{
	
	@Autowired
	public SqlSessionTemplate mybatis;
	
	@Override
	public int commentInsert(community_board_comment_Dto commentVO) {
		commentVO.setCb_num(commentVO.getCb_num());
		return mybatis.insert("board_comment_Mapper.commentInsert", commentVO);
	}
	
	@Override
	public List<community_board_comment_Dto> SelectList(community_board_comment_Dto commentVO) {
		return mybatis.selectList("board_comment_Mapper.commnetList", commentVO);
	}
	
	@Override
	public int commentUpdate(community_board_comment_Dto commentVO) {
		return mybatis.update("board_comment_Mapper.commentUpdate", commentVO);
	}
	
	@Override
	public int commentDelete(community_board_comment_Dto commentVO) {
		/* commentVO.setCb_num(commnetVO.); */
		return mybatis.delete("board_comment_Mapper.commentDelete", commentVO);
	}
	

}
