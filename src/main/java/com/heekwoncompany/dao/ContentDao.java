package com.heekwoncompany.dao;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.heekwoncompany.dto.ContentDto;

public class ContentDao {

	JdbcTemplate template;

	@Autowired
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	public ArrayList<ContentDto> list() { // 게시판 전체 글 목록을 반환하는 메소드
		
		//JDBCtemplate 이용
		String sql = "SELECT * FROM board";
		ArrayList<ContentDto> dtos = (ArrayList<ContentDto>) template.query(sql, new BeanPropertyRowMapper(ContentDto.class));
		
		return dtos;
		
	}

	
	
}
